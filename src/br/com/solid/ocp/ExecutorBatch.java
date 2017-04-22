package br.com.solid.ocp;

import java.util.Scanner;

public class ExecutorBatch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		
		Processo.getBatch(nome).processar();
	}
		
	
}
