package br.com.solid.lsp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lancamento {
	
	private String descricao;
	
	private Date data;
	
	private Double valor;

	public Lancamento(String descricao, Date data, Double valor) {
		super();
		this.descricao = descricao;
		this.data = data;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getValor() {
		return valor;
	}
	
	public Date getData() {
		return data;
	}
	
	@Override
	public String toString() {
		
		DateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
		
		return descricao + " " + formatadorData.format(data) + " " + valor;
	}

}
