package br.com.solid.dip.aplicacao;

import br.com.solid.dip.aplicacao.persistencia.ContaCorrenteDao;
import br.com.solid.dip.aplicacao.persistencia.ContaCorrenteDao2;
import br.com.solid.dip.aplicacao.persistencia.ContaCorrenteDaoInterface;
import br.com.solid.dip.aplicacao.servico.ContaCorrenteInterface;
import br.com.solid.dip.aplicacao.servico.ContaCorrenteService;

public class Fabrica {

	private Fabrica() {
		
	}
	
	public static Fabrica getInstance() {
		return new Fabrica();
	}
	
	public ContaCorrenteInterface getContaCorrenteService() {
		return new ContaCorrenteService();
	}
	
	public ContaCorrenteDaoInterface getContaCorrenteDao(int versao) {
		
		if (versao == 1) {
			return new ContaCorrenteDao();
		}
		
		return new ContaCorrenteDao2();
	}
	
	
}
