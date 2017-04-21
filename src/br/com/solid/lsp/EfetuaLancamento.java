package br.com.solid.lsp;

import java.util.Date;

public class EfetuaLancamento {

	public static void main(String[] args) {
		
		
		/*
		 * Usando a classe derivada com tipo para declarar o objeto
		 */
		ContaCorrente contaCorrente = new ContaCorrente("Anderson", "Rua Celso Lara Barberi", 19494L);
		
		contaCorrente.lancar(new Lancamento("Pagamentos 1", new Date(), 9.03));
		contaCorrente.lancar(new Lancamento("Pagamentos 2", new Date(), 39.03));
		contaCorrente.lancar(new Lancamento("Pagamentos 3", new Date(), 10.03));
		contaCorrente.lancar(new Lancamento("Pagamentos 4", new Date(), 39.03));
		
		System.out.println("Objeto tipo Conta Corrente ");
		
		for (Lancamento lancamento : contaCorrente.getLancamentos()) {
			System.out.println(lancamento.toString());
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Objeto tipo Conta");
		
		/*
		 * Usando a classe base para declarar o objeto
		 */
		Conta conta = new ContaCorrente("Anderson", "Rua Celso Lara Barberi", 19494L);
		
		conta.lancar(new Lancamento("Pagamentos 1", new Date(), 9.03));
		conta.lancar(new Lancamento("Pagamentos 2", new Date(), 39.03));
		conta.lancar(new Lancamento("Pagamentos 3", new Date(), 10.03));
		conta.lancar(new Lancamento("Pagamentos 4", new Date(), 39.03));
		
		for (Lancamento lancamento : conta.getLancamentos()) {
			System.out.println(lancamento.toString());
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Objeto tipo Conta Investimento");
		
		/*
		 * Usando a classe base para declarar o objeto
		 */
		ContaInvestimento contaInvestimento = new ContaInvestimento();
							
		contaInvestimento.lancar(new Lancamento("Aplicação 1", new Date(), 07.03));
		contaInvestimento.lancar(new Lancamento("Aplicação 2", new Date(), 39.03));
		contaInvestimento.lancar(new Lancamento("Aplicação 3", new Date(), 39.03));
		
		for (Lancamento lancamento : contaInvestimento.getLancamentos()) {
			System.out.println(lancamento.toString());
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Objeto tipo Conta 2");
		
		Conta conta2 = new ContaInvestimento();
		
		conta2.lancar(new Lancamento("Aplicação 1", new Date(), 07.03));
		conta2.lancar(new Lancamento("Aplicação 2", new Date(), 39.03));
		conta2.lancar(new Lancamento("Aplicação 3", new Date(), 39.03));
		
		for (Lancamento lancamento : conta2.getLancamentos()) {
			System.out.println(lancamento.toString());
		}
		

	}
	
	
	
	

}
