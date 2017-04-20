package br.com.solid.dip.aplicacao.persistencia;

import java.util.ArrayList;
import java.util.Date;

import br.com.solid.dip.aplicacao.vo.ContaCorrente;

public class ContaCorrenteDao {

	public ArrayList<ContaCorrente> cosultarExtrato(Date dataInicio, Date dataFinal) {
		
		ArrayList<ContaCorrente> lista = new ArrayList<>();
		
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
