package br.com.solid.lsp;

public class ContaInvestimento extends Conta {
 
	@Override
	public void lancar(Lancamento lancamento) {
	    if(lancamento.getValor().doubleValue() > 10.0) {
	    	super.lancar(lancamento);	
	    }
	}
	
	
}