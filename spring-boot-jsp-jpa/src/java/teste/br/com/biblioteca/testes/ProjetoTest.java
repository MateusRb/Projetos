package br.com.biblioteca.testes;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.biblioteca.model.Projeto;
import br.com.biblioteca.service.ProjetoService;

public class ProjetoTest {

	private ProjetoService projetoService;

	@Test
	public void deveInserirPessoaNova() {
		Projeto projeto = new Projeto();
		projeto.setNome("Juca");
		projetoService.salvar(projeto);
		assertNotNull(projeto.getId());
		projetoService.excluir(projeto);
	}

	@Test
	public void deveAlterarCopo() {
		Projeto projeto = new Projeto();
		projeto.setNome("Juca");
		projetoService.salvar(projeto);
		projeto.setNome("Leandro");
		projetoService.alterar(projeto);
		Projeto projetoBanco = projetoService.visualizarProjeto(projeto);
		assertEquals("Canecao", projetoBanco.getNome());
		projetoService.excluir(projetoBanco);
	}

}
