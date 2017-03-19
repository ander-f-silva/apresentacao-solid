package br.com.solid.srp;

public class ExecutorRelatorio {

	public static void main(String[] args) {
		
		System.out.println("####################################");
		System.out.println("									");
		System.out.println("	   GERAR RELATÓRIO	    		");
		System.out.println("						  			");
		System.out.println("####################################");

		Relatorio relatorio = new Relatorio();
		
		boolean sucesso = relatorio.gerar();
				
		if (sucesso) {
			System.out.println("Operação realizada com sucesso");
			System.exit(0);
		} else {
			System.out.println("Falha ocorrida na durante a operação");
			System.exit(1);
		}		
	}

}
