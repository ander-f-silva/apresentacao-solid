package br.com.solid.isp;

import java.util.ArrayList;
import java.util.List;

import br.com.solid.isp.vo.Atendente;

public class ManterBackoffice implements Cadastrar<Atendente> {

	private List<Atendente> atendentes = new ArrayList<>();
	
	@Override
	public void adicionar(Atendente atendente) {
		atendentes.add(atendente);
		
	}

	@Override
	public void deletar(Atendente atendente) {
		atendentes.remove(atendente);
		
	}

	@Override
	public Atendente consultar(Long id) {
		return null;
	}

	@Override
	public void atualizar(Long id, Atendente element) {
		
		
	}

}
