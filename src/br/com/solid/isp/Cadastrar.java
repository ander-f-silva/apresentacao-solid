package br.com.solid.isp;

public interface Cadastrar<E> {
	
	public void adicionar(E element);
	
	public void deletar(E element);
	
	public void consultar(E element);
	
	public void atualizar(E element);

}
