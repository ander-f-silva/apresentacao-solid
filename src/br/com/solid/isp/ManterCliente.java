package br.com.solid.isp;

import java.util.ArrayList;
import java.util.List;

import br.com.solid.isp.vo.Cliente;

public class ManterCliente implements Cadastrar<Cliente> {

	private List<Cliente> clientes = new ArrayList<>();
	
	@Override
	public void adicionar(Cliente cliente) {
		clientes.add(cliente);
		
	}

	@Override
	public void deletar(Cliente cliente) {
		clientes.remove(cliente);
	}

	@Override
	public Cliente consultar(Long id) {
		return clientes.get(id.intValue());
		
	}

	@Override
	public void atualizar(Long id, Cliente element) {
		
		
	}

}
