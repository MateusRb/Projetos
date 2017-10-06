package br.com.biblioteca.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.biblioteca.enums.Risco;
import br.com.biblioteca.enums.Status;

@Entity
public class Projeto implements Serializable {

	private static final long serialVersionUID = -8870764578463706656L;
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	@Temporal(TemporalType.DATE)
	private Date data_inicio;
	@Temporal(TemporalType.DATE)
	private Date data_previsao_fim;
	@Temporal(TemporalType.DATE)
	private Date data_fim;
	private String descricao;
	@Enumerated(EnumType.STRING)
	private Status status;
	private Float orcamento;
	@Enumerated(EnumType.STRING)
	private Risco risco;
	@ManyToOne
	private Pessoa gerente;
	@OneToMany
	private List<Pessoa> membros;

	public Projeto(Long id, String nome, Date data_inicio, Date data_previsao_fim, Date data_fim, String descricao,
			Status status, Float orcamento, Risco risco, Pessoa gerente, List<Pessoa> membros) {
		super();
		this.id = id;
		this.nome = nome;
		this.data_inicio = data_inicio;
		this.data_previsao_fim = data_previsao_fim;
		this.data_fim = data_fim;
		this.descricao = descricao;
		this.status = status;
		this.orcamento = orcamento;
		this.risco = risco;
		this.gerente = gerente;
		this.membros = membros;
	}

	public Projeto() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Date getData_previsao_fim() {
		return data_previsao_fim;
	}

	public void setData_previsao_fim(Date data_previsao_fim) {
		this.data_previsao_fim = data_previsao_fim;
	}

	public Date getData_fim() {
		return data_fim;
	}

	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Float getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Float orcamento) {
		this.orcamento = orcamento;
	}

	public Risco getRisco() {
		return risco;
	}

	public void setRisco(Risco risco) {
		this.risco = risco;
	}

	public Pessoa getGerente() {
		return gerente;
	}

	public void setGerente(Pessoa gerente) {
		this.gerente = gerente;
	}

	public List<Pessoa> getMembros() {
		return membros;
	}

	public void setMembros(List<Pessoa> membros) {
		this.membros = membros;
	}

	public void addFuncionario(Pessoa pessoa) {
		if (pessoa == null) {
			membros = new ArrayList<>();
		}
		membros.add(pessoa);
	}
}
