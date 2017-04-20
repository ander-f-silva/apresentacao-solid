package br.com.solid.dip.aplicacao.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import br.com.solid.dip.aplicacao.vo.ContaCorrente;

public class ContaCorrenteDao2 implements ContaCorrenteDaoInterface {

	public Collection<ContaCorrente> cosultarExtrato(Date dataInicio, Date dataFinal) {
		
		List<ContaCorrente> lista = new ArrayList<>();
		
		lista.add(new ContaCorrente(1L, "Conta de Luz 2", new Date(), 59.0));
		lista.add(new ContaCorrente(2L, "Salario 2", new Date(), 789.0));
		lista.add(new ContaCorrente(3L, "Conta de Água 2", new Date(), 25.0));
		lista.add(new ContaCorrente(4L, "Pagamento Parcela do Fogão 2", new Date(), 80.0));
				
		return lista;
	}
	
	public boolean possuiSaldoConta() {
		return true;
	}

}
