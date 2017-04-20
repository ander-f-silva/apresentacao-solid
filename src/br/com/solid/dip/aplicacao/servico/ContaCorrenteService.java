package br.com.solid.dip.aplicacao.servico;

import java.util.ArrayList;
import java.util.Date;

import br.com.solid.dip.aplicacao.persistencia.ContaCorrenteDao;
import br.com.solid.dip.aplicacao.vo.ContaCorrente;
 
public class ContaCorrenteService {

	ContaCorrenteDao dao = new ContaCorrenteDao();
	
	public ArrayList<ContaCorrente> cosultarExtrato(Date dataInicio, Date dataFinal) {
		return dao.cosultarExtrato(dataInicio, dataFinal);
	}

}
