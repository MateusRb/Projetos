package br.com.biblioteca.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.biblioteca.enums.Risco;
import br.com.biblioteca.enums.Status;
import br.com.biblioteca.model.Projeto;
import br.com.biblioteca.service.PessoaService;
import br.com.biblioteca.service.ProjetoService;

@Controller
@RequestMapping("/projeto")
public class ProjetoController {

	private ProjetoService projetoService;

	private PessoaService pessoaService;

	public ProjetoController(ProjetoService projetoService, PessoaService pessoaService) {
		super();
		this.projetoService = projetoService;
		this.pessoaService = pessoaService;
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("projetos", projetoService.getProjetos());
		return "/listar";
	}

	@GetMapping("/novo")
	public void novo(Model model) {
		model.addAttribute("pessoas", pessoaService.getPessoas());
		model.addAttribute("riscos", Arrays.asList(Risco.values()));
		model.addAttribute("status", Arrays.asList(Status.values()));
	}

	@GetMapping("/visualiza/{projeto.id}")
	public Projeto visualizar(Projeto projeto) {
		return projetoService.visualizarProjeto(projeto);
	}

	@PostMapping("/salvar")
	public String salvar(Projeto projeto) {
		projetoService.salvar(projeto);
		return "redirect:/lista";
	}

	@DeleteMapping("/excluir/{projeto.id}")
	public void deletar(Projeto projeto) {

		projetoService.excluir(projeto);
	}

	@PostMapping("/alterar/{projeto.id}")
	public void alterar(Projeto projeto) {
		projetoService.alterar(projeto);
	}

	@PostMapping("/adicionarFuncionario/{projeto.id}")
	public void adicionPessoa(Projeto projeto, Long codigo) {

		projetoService.adicionarPessoa(projeto, codigo);
	}
}
