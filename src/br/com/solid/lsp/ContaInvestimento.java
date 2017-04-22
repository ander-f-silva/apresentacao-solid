package br.com.solid.lsp;

import java.util.ArrayList;
import java.util.List;

public class ContaInvestimento implements Conta {
 	
	private List<Lancamento> lancamentos = new ArrayList<>();
	
	public void lancar(Lancamento lancamento) {
	    if(lancamento.getValor().doubleValue() > 10.0) {
	    	lancamentos.add(lancamento);	
	    }
	}

	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}
		
}