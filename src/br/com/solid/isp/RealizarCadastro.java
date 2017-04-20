package br.com.solid.isp;

import java.util.Date;

import br.com.solid.isp.vo.Atendente;
import br.com.solid.isp.vo.Cliente;

public class RealizarCadastro {
	
	public static void main(String[] args) {
		
		Cadastrar<Cliente> cadastrarCli = new ManterCliente();
		
		cadastrarCli.adicionar(new Cliente("Anderson",new Date()));
		
		cadastrarCli.deletar(new Cliente("Anderson",new Date()));
		
		Cadastrar<Atendente> cadastrarBack = new ManterBackoffice();
		
		cadastrarBack.adicionar(new Atendente(1234, "Anderson","090"));
		
		cadastrarBack.deletar(new Atendente(1234, "Anderson","090"));
	}

}
