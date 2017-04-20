package br.com.solid.dip.aplicacao.servico;

import br.com.solid.dip.aplicacao.SaldoInsuficienteException;
import br.com.solid.dip.aplicacao.persistencia.ContaCorrenteDao;
import br.com.solid.dip.aplicacao.persistencia.ContaInvestimentoDao;

public class ContaInvestimentoService {
	
	ContaCorrenteDao contaCorrenteDao = new ContaCorrenteDao();
	
	ContaInvestimentoDao contaInvestimentoDao = new ContaInvestimentoDao();
	
	public void aplicar(Double valor) throws SaldoInsuficienteException {
		if (contaCorrenteDao.possuiSaldoConta()) {
			throw new SaldoInsuficienteException();
		}
		
		contaInvestimentoDao.aplicar(valor);		
	}
	
}
