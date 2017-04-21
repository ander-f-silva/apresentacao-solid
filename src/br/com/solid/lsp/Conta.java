package br.com.solid.lsp;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {

	protected String nomeCliente;
	
	protected String enderecoCliente;
	
	protected List<Lancamento> lancamentos = new ArrayList<>();
	
	
	public void lancar(Lancamento lancamento) {
		lancamentos.add(lancamento);
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}
	
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	
}