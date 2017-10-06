package br.com.biblioteca.enums;

public enum Risco {

	BAIXO("Baixo"), MEDIO("Médio"), ALTO("Alto");

	private String descricao;

	private Risco(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
