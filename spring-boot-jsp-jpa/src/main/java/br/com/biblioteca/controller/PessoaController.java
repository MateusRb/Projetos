package br.com.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.biblioteca.model.Pessoa;
import br.com.biblioteca.service.PessoaService;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {

	private PessoaService pessoaService;

	public PessoaController(PessoaService pessoaService) {
		super();
		this.pessoaService = pessoaService;
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("pessoas", pessoaService.getPessoas());
		return "pessoa/listar";
	}

	@GetMapping("/novo")
	public void novo() {
	}

	@PostMapping("/salvar")
	public String salvar(Pessoa pessoa) {
		pessoaService.salvar(pessoa);
		return "redirect:/listar";
	}

	@RequestMapping("/excluir/{pessoa.id}")
	public void deletar(Pessoa pessoa) {
		pessoaService.excluir(pessoa);
	}

	@GetMapping("/alterar/{pessoa.id}")
	public void alterar(Pessoa pessoa) {
		pessoaService.alterar(pessoa);
	}

}
