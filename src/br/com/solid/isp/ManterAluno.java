package br.com.solid.isp;

import java.util.LinkedList;
import java.util.List;


import br.com.solid.isp.vo.Aluno;

public class ManterAluno implements CadastroAluno {

	private List<Aluno> alunos = new LinkedList<Aluno>();
	
	
	@Override
	public void adicionar(Aluno aluno) {
		alunos.add(aluno);
		
	}

	@Override
	public void deletar(Aluno aluno) {
		alunos.remove(aluno);
	}

	@Override
	public Aluno consultar(Long id) {
		return alunos.get(id.intValue());	
	}







}
