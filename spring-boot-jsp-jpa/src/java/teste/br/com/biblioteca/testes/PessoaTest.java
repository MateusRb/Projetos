package br.com.biblioteca.testes;
import org.junit.Test;

import br.com.biblioteca.model.Pessoa;
import br.com.biblioteca.service.PessoaService;
import junit.framework.TestCase;

public class PessoaTest extends TestCase {

	private PessoaService pessoaService;

	@Test
	public void deveInserirPessoaNova() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Juca");
		pessoaService.salvar(pessoa);
		assertNotNull(pessoa.getId());
		pessoaService.excluir(pessoa);
	}

	@Test
	public void deveAlterarCopo() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Juca");
		pessoaService.salvar(pessoa);
		pessoa.setNome("Leandro");
		pessoaService.alterar(pessoa);
		Pessoa pessoaBanco = pessoaService.visualizarPessoa(pessoa);
		assertEquals("Canecao", pessoaBanco.getNome());
		pessoaService.excluir(pessoaBanco);
	}

}
