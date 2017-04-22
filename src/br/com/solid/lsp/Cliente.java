package br.com.solid.lsp;

public class Cliente {

	protected String nome;

	protected String endereco;

	public Cliente(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

}
