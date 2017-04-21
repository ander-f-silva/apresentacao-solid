package br.com.solid.srp.arquivo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManupuladoArquivo {
	
	FileWriter arq;
    PrintWriter gravarArq;
    
    public ManupuladoArquivo(String caminho) throws IOException {
    	arq = new FileWriter(caminho);
        gravarArq = new PrintWriter(arq);
    }
	
	public void escrever(String... texto) {	    
	    gravarArq.printf("%d | %s | %s | %s \n", texto[0], texto[1], texto[2], texto[3]);
	}
	
	public void finalizar() throws IOException {
		arq.close();
	}

}
