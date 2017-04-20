package br.com.solid.dip.aplicacao.persistencia;

import java.util.Collection;
import java.util.Date;

import br.com.solid.dip.aplicacao.vo.ContaCorrente;

public interface ContaCorrenteDaoInterface  {
	Collection<ContaCorrente> cosultarExtrato(Date dataInicio, Date dataFinal);
}
