package br.com.solid.lsp;

import java.util.List;

public interface Conta {

	public void lancar(Lancamento lancamento);
	
	List<Lancamento> getLancamentos();
		
}