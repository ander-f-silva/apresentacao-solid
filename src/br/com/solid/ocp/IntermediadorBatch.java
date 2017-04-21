package br.com.solid.ocp;

import java.util.Scanner;

public class IntermediadorBatch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		String processo = sc.next();
		
		if ("expurgo".equals(processo)) {
			ExpurgoBatch eb = new ExpurgoBatch();	
			eb.processar();
		}
		
		if ("relatorio".equals(processo)) {
			RelatorioFaturametoBatch rb = new RelatorioFaturametoBatch();
			rb.processar();
		}
		
		if ("inclusao".equals(processo)) {
			InclusaoClientesBatch icb = new InclusaoClientesBatch();
			icb.processar();
		}		
	}
		
	
}
