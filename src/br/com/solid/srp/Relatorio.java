package br.com.solid.srp;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Relatorio {
	
	public boolean gerar() {
		boolean resultado = true;
		Connection conexao = null;
		PreparedStatement operacaoSql = null;
		ResultSet registros = null;
		
		try {
			//Abrir a conexão com o banco de dados			
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/timesheet", "spyder", "spyder");
			
			//Realiza consulta para efetuar 
			
			String sql = "select id, nome_funcionario, dt_entrada, dt_saida from lancamento_horas order by id asc";
			operacaoSql = conexao.prepareStatement(sql);
			
			registros = operacaoSql.executeQuery();
			
			//Gerar o arquivo para gravar o relatório
			FileWriter arq = new FileWriter("/home/anderson/relario.txt");
		    PrintWriter gravarArq = new PrintWriter(arq);
		 			
		   //Lê os registros da base  
			while (registros.next()) {
				Long id = registros.getLong("id");
				String nomeFuncionario = registros.getString("nome_funcionario");
				Timestamp dtEntrada = registros.getTimestamp("dt_entrada");
				Timestamp dtSaida = registros.getTimestamp("dt_saida");
				Date entrada = new Date(dtEntrada.getTime());
				Date saida = new Date(dtSaida.getTime());
				
				DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
								
				gravarArq.printf("%d | %s | %s | %s \n", id, nomeFuncionario, dateFormat.format(entrada), dateFormat.format(saida));
			}
			
			arq.close();
			
			Properties propriedades = new Properties();
	    	InputStream strean = null;

    		strean = Relatorio.class.getResourceAsStream("config.properties");
	    		
    		if(strean==null){
    		    return false;
    		}
	    		
    		propriedades.load(strean);
    		
			SimpleEmail email = new SimpleEmail();
			email.setHostName(propriedades.getProperty("server.host"));
			email.setSmtpPort(new Integer(propriedades.getProperty("server.port")).intValue());
			email.setFrom(propriedades.getProperty("email.from"), propriedades.getProperty("user.from"));
			email.addTo(propriedades.getProperty("email.to"), propriedades.getProperty("user.to"));
			email.setSubject(propriedades.getProperty("emai.title"));
			email.setMsg(propriedades.getProperty("email.msg"));
		    email.setSSL(Boolean.valueOf(propriedades.getProperty("habilita.ssl")));
			email.setAuthentication(propriedades.getProperty("authentication.login"), propriedades.getProperty("authentication.password"));
			email.send();
			
		} catch (SQLException e) {			
			System.out.println(e);
			resultado = false;
		} catch (IOException e) {
			System.out.println(e);
			resultado = false;
		} catch (EmailException e) {
			System.out.println(e);
			resultado = false;
		} finally {
	        if (conexao != null) {
	        	try {
					conexao.close();
				} catch (SQLException e) {		
					System.out.println(e);
					resultado = false;
				}
	        }	
	        if (operacaoSql != null) {
	        	try {
	        		operacaoSql.close();
				} catch (SQLException e) {		
					System.out.println(e);
					resultado = false;
				}
	        }	        
	        if (registros != null) {
	        	try {
	        		registros.close();
				} catch (SQLException e) {		
					System.out.println(e);
					resultado = false;
				}
	        }
		}
		    		
		return resultado;
	}
}
