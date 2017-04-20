package br.com.solid.isp;

import java.util.List;

import javax.mail.MethodNotSupportedException;

public interface Cadastrar<E> {
	
	public void adicionar(E element);
	
	public void deletar(E element);
	
	public E consultar(Long id);

	public void atualizar(E element) throws MethodNotSupportedException;
	
	public List<E> listar();


}
