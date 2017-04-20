package br.com.solid.isp.vo;

import java.util.List;

public class Turma {
	
	private String nome;
	
	private List<Aluno> alunos;
	
	private String periodo;

	public Turma(String nome, List<Aluno> alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public String getPeriodo() {
		return periodo;
	}

	
	
	
	

}
