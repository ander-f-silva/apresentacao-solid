package br.com.solid.isp;

import java.util.ArrayList;
import java.util.Date;

import br.com.solid.isp.vo.Turma;
import br.com.solid.isp.vo.Aluno;

public class RealizarCadastro {
	
	public static void main(String[] args) {
		
		Cadastrar<Aluno> cadastrarCli = new ManterAluno();
		
		cadastrarCli.adicionar(new Aluno("Anderson",new Date()));
		
		cadastrarCli.deletar(new Aluno("José",new Date()));
		
		Cadastrar<Turma> cadastrarBack = new ManterTurma();
		
		cadastrarBack.adicionar(new Turma("A", new ArrayList<Aluno>()));
		
		cadastrarBack.deletar(new Turma("B", new ArrayList<Aluno>()));
	}

}
