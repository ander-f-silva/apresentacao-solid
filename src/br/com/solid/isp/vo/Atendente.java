package br.com.solid.isp.vo;

public class Atendente {
	
	private Integer codigo;
	
	private String nome;
	
	private String ramal;

	public Atendente(Integer codigo, String nome, String ramal) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.ramal = ramal;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getRamal() {
		return ramal;
	}
	
	
	

}
