package br.com.solid.srp.dao.vo;

import java.util.Date;

public class Lancamento {
	
	private Long id;
	private String nomeFuncionario;
	private Date entrada;
	private Date saida;
	
	public Lancamento(Long id, String nomeFuncionario, Date entrada, Date saida) {
		super();
		this.id = id;
		this.nomeFuncionario = nomeFuncionario;
		this.entrada = entrada;
		this.saida = saida;
	}
	public Long getId() {
		return id;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public Date getEntrada() {
		return entrada;
	}
	public Date getSaida() {
		return saida;
	}
	
}
