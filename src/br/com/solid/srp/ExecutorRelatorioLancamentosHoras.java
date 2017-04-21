package br.com.solid.srp;

import java.util.List;

import br.com.solid.srp.dao.LancamentoHorasDao;
import br.com.solid.srp.dao.vo.Lancamento;
import envio.Email;

public class ExecutorRelatorioLancamentosHoras {

	public static void main(String[] args) {
		
		System.out.println("####################################");
		System.out.println("									");
		System.out.println("	   GERAR RELATÓRIO	    		");
		System.out.println("						  			");
		System.out.println("####################################");

		RelatorioLancamentoHoras relatorio = new RelatorioLancamentoHoras();
		
		LancamentoHorasDao dao = new LancamentoHorasDao();

		List<Lancamento> lancamentos = dao.listar();
		
		boolean sucesso = relatorio.gerar(lancamentos);
		
		Email email = new Email();
		email.enviar();
		
		if (sucesso) {
			System.out.println("Operação realizada com sucesso");
			System.exit(0);
		} else {
			System.out.println("Falha ocorrida na durante a operação");
			System.exit(1);
		}		
	}

}
