package br.com.solid.isp;

public interface Cadastrar<E> {
	
	public void adicionar(E element);
	
	public void deletar(E element);
	
	public E consultar(Long id);
	
	public void atualizar(Long id, E element);

}
