package br.com.solid.isp;

import br.com.solid.isp.vo.Aluno;

public interface CadastroAluno {
	
	public void adicionar(Aluno element);
	
	public void deletar(Aluno element);
	
	public Aluno consultar(Long id);

}
