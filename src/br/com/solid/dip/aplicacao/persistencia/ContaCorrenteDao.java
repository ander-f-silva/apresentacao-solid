package br.com.solid.dip.aplicacao.persistencia;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import br.com.solid.dip.aplicacao.vo.ContaCorrente;

public class ContaCorrenteDao implements ContaCorrenteDaoInterface {

	public Collection<ContaCorrente> cosultarExtrato(Date dataInicio, Date dataFinal) {
		
		List<ContaCorrente> lista = new Vector();
		
		lista.add(new ContaCorrente(1L, "Conta de Luz", new Date(), 59.0));
		lista.add(new ContaCorrente(2L, "Salario", new Date(), 789.0));
		lista.add(new ContaCorrente(3L, "Conta de Água", new Date(), 25.0));
		lista.add(new ContaCorrente(4L, "Pagamento Parcela do Fogão", new Date(), 80.0));
				
		return lista;
	}
	
	public boolean possuiSaldoConta() {
		return true;
	}

}
