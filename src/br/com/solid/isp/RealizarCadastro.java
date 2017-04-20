package br.com.solid.isp;

import java.util.ArrayList;
import java.util.Date;

import br.com.solid.isp.vo.Aluno;
import br.com.solid.isp.vo.Turma;

public class RealizarCadastro {
	
	public static void main(String[] args) {
		
		CadastroAluno cadastrarCli = new ManterAluno();
		
		cadastrarCli.adicionar(new Aluno("Anderson",new Date()));
		
		cadastrarCli.deletar(new Aluno("José",new Date()));
				
		CadastroTurma cadastrarBack = new ManterTurma();
		
		cadastrarBack.adicionar(new Turma("A", new ArrayList<Aluno>()));
		
		cadastrarBack.deletar(new Turma("B", new ArrayList<Aluno>()));
		
		cadastrarBack.listar();
	
	}

}
