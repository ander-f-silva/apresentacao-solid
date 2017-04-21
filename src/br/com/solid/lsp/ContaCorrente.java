package br.com.solid.lsp;

public class ContaCorrente extends Conta {

	private Long numeroConta;

	public ContaCorrente(String nome, String endereco, Long numeroConta) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nome;
		this.enderecoCliente = endereco;
	}
	
	public Long getNumero() {
		return numeroConta;
	}
	
	
	
}