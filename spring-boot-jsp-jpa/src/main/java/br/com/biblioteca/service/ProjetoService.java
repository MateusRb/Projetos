package br.com.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.biblioteca.enums.Status;
import br.com.biblioteca.model.Pessoa;
import br.com.biblioteca.model.Projeto;
import br.com.biblioteca.repository.PessoaRepository;
import br.com.biblioteca.repository.ProjetoRepository;

@Service
public class ProjetoService {

	@Autowired
	private ProjetoRepository projetoRepository;
	@Autowired
	private PessoaRepository pessoaRepository;

	public List<Projeto> getProjetos() {
		return projetoRepository.findAll();
	}

	public Projeto visualizarProjeto(Projeto projeto) {
		return projetoRepository.findOne(projeto.getId());
	}

	public void excluir(Projeto projeto) {
		if (projeto.getStatus().equals(Status.INICIADO) || projeto.getStatus().equals(Status.EM_ANDAMENTO)
				|| projeto.getStatus().equals(Status.ENCERRADO)) {
			projetoRepository.delete(projeto);
		}
	}

	public void alterar(Projeto projeto) {
		projetoRepository.save(projeto);
	}

	public void salvar(Projeto projeto) {
		projetoRepository.save(projeto);
	}

	public void adicionarPessoa(Projeto projeto, Long codigo) {
		Pessoa pessoaBanco = pessoaRepository.findOne(codigo);
		if (pessoaBanco.isFuncionario()) {
			projeto.addFuncionario(pessoaBanco);
			projetoRepository.save(projeto);
		}
	}
}
