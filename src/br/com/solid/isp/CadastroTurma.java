package br.com.solid.isp;

import java.util.List;

import br.com.solid.isp.vo.Aluno;
import br.com.solid.isp.vo.Turma;

public interface CadastroTurma {
	
	public void adicionar(Turma aluno);
	
	public void deletar(Turma aluno);
	
	public List<Turma> listar();

}
