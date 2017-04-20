package br.com.solid.dip.aplicacao.apresentacao;

import java.util.ArrayList;
import java.util.Date;

import br.com.solid.dip.aplicacao.servico.ContaCorrenteService;
import br.com.solid.dip.aplicacao.vo.ContaCorrente;

public class ContaCorrenteController {
	
	ContaCorrenteService service = new ContaCorrenteService();
	
	public ArrayList<ContaCorrente> cosultarExtrato(Date dataInicio, Date dataFinal) {
		return service.cosultarExtrato(dataInicio, dataFinal);
	}

}
