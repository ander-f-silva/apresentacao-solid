package br.com.solid.dip.aplicacao.apresentacao;

import java.util.Collection;
import java.util.Date;

import br.com.solid.dip.aplicacao.Fabrica;
import br.com.solid.dip.aplicacao.servico.ContaCorrenteInterface;
import br.com.solid.dip.aplicacao.vo.ContaCorrente;

public class ContaCorrenteController {
	
	ContaCorrenteInterface service = Fabrica.getInstance().getContaCorrenteService();
	
	public Collection<ContaCorrente> cosultarExtrato(Date dataInicio, Date dataFinal) {
		return service.cosultarExtrato(dataInicio, dataFinal);
	}
	
	public static void main(String[] args) {
		ContaCorrenteController controller  = new ContaCorrenteController();
		
		Collection<ContaCorrente> contas = controller.cosultarExtrato(new Date(), new Date());
		
	
		for (ContaCorrente contaCorrente : contas) {
			System.out.println(contaCorrente.getDescricao());
		}
		
	}

}
