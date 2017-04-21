package br.com.solid.srp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.solid.srp.dao.vo.Lancamento;

public class LancamentoHorasDao {

	public List<Lancamento> listar() {
		Connection conexao = null;
		PreparedStatement operacaoSql = null;
		ResultSet registros = null;

		List<Lancamento> lancamentos = new ArrayList<>();

		try {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/timesheet", "root", "root");

			String sql = "select id, nome_funcionario, dt_entrada, dt_saida from lancamento_horas order by id asc";
			operacaoSql = conexao.prepareStatement(sql);

			registros = operacaoSql.executeQuery();

			while (registros.next()) {
				Long id = registros.getLong("id");
				String nomeFuncionario = registros.getString("nome_funcionario");
				Timestamp dtEntrada = registros.getTimestamp("dt_entrada");
				Timestamp dtSaida = registros.getTimestamp("dt_saida");
				Date entrada = new Date(dtEntrada.getTime());
				Date saida = new Date(dtSaida.getTime());

				lancamentos.add(new Lancamento(id, nomeFuncionario, entrada, saida));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conexao != null) {
				try {
					conexao.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (operacaoSql != null) {
				try {
					operacaoSql.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (registros != null) {
				try {
					registros.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return lancamentos;
	}

}
