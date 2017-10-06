package br.com.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.biblioteca.model.Pessoa;
import br.com.biblioteca.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public List<Pessoa> getPessoas() {
		return pessoaRepository.findAll();
	}

	public Pessoa visualizarPessoa(Pessoa pessoa) {
		return pessoaRepository.findOne(pessoa.getId());
	}

	public void excluir(Pessoa pessoa) {
		pessoaRepository.delete(pessoa);
	}

	public void alterar(Pessoa pessoa){
		pessoaRepository.save(pessoa);
		
	}
	
	public void salvar(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
	}

}
