package br.com.solid.dip.aplicacao.servico;

import java.util.Collection;
import java.util.Date;

import br.com.solid.dip.aplicacao.Fabrica;
import br.com.solid.dip.aplicacao.persistencia.ContaCorrenteDaoInterface;
import br.com.solid.dip.aplicacao.vo.ContaCorrente;
 
public class ContaCorrenteService implements ContaCorrenteInterface {

	ContaCorrenteDaoInterface dao = Fabrica.getInstance().getContaCorrenteDao(1);
	
	public Collection<ContaCorrente> cosultarExtrato(Date dataInicio, Date dataFinal) {
		return dao.cosultarExtrato(dataInicio, dataFinal);
	}

}
