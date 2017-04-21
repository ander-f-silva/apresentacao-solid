package br.com.solid.srp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.com.solid.srp.arquivo.ManupuladoArquivo;
import br.com.solid.srp.dao.vo.Lancamento;

public class RelatorioLancamentoHoras {

	public boolean gerar(List<Lancamento> lancamentos) {
		boolean resultado = true;

		try {
			ManupuladoArquivo arquivo = new ManupuladoArquivo("/home/anderson_silva/relatorio/arquivo.txt");

			for (Lancamento lancamento : lancamentos) {
				Long id = lancamento.getId();
				String nomeFuncionario = lancamento.getNomeFuncionario();
				Date entrada = lancamento.getEntrada();
				Date saida = lancamento.getSaida();

				DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

				arquivo.escrever(id.toString(), nomeFuncionario, dateFormat.format(entrada), dateFormat.format(saida));
			}
		} catch (Exception e) {
			System.out.println(e);
			resultado = false;
		}

		return resultado;
	}
}
