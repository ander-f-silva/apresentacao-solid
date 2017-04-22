package br.com.solid.lsp;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente implements Conta {

	private Cliente cliente;
	
	private Long numeroConta;
	
	private List<Lancamento> lancamentos = new ArrayList<>();

	public ContaCorrente(String nome, String endereco, Long numeroConta) {
		this.numeroConta = numeroConta;
		cliente = new Cliente(nome,endereco);		
	}
	
	public void lancar(Lancamento lancamento) {
		lancamentos.add(lancamento);
	}

	
	public Long getNumero() {
		return numeroConta;
	}
	
	public String getNomeCliente() {
		return cliente.getNome();
	}
	
	public String getEnderecoCliente() {
		return cliente.getEndereco();
	}
	
	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}
	
	
}