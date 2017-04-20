package br.com.solid.dip.aplicacao.vo;

import java.util.Date;

public class ContaCorrente {

	private Long id;

	private String descricao;

	private Date dataTransacao;

	private Double valor;

	public ContaCorrente(Long id, String descricao, Date dataTransacao, Double valor) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.dataTransacao = dataTransacao;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public Date getDataTransacao() {
		return dataTransacao;
	}

	public Double getValor() {
		return valor;
	}

}
