package br.com.solid.dip.aplicacao.servico;

import java.util.Collection;
import java.util.Date;

import br.com.solid.dip.aplicacao.vo.ContaCorrente;

public interface ContaCorrenteInterface {
	Collection<ContaCorrente> cosultarExtrato(Date dataInicio, Date dataFinal);
}
