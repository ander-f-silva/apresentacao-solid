package envio;

import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.mail.SimpleEmail;

import br.com.solid.srp.RelatorioLancamentoHoras;

public class Email {

	public void enviar() {

		Properties propriedades = new Properties();
		InputStream strean = null;

		strean = RelatorioLancamentoHoras.class.getResourceAsStream("config.properties");

		if (strean == null) {
			throw new IllegalAccessError();
		}

		try {
			propriedades.load(strean);

			SimpleEmail email = new SimpleEmail();
			email.setHostName(propriedades.getProperty("server.host"));
			email.setSmtpPort(new Integer(propriedades.getProperty("server.port")).intValue());
			email.setFrom(propriedades.getProperty("email.from"), propriedades.getProperty("user.from"));
			email.addTo(propriedades.getProperty("email.to"), propriedades.getProperty("user.to"));
			email.setSubject(propriedades.getProperty("emai.title"));
			email.setMsg(propriedades.getProperty("email.msg"));
			email.setSSL(Boolean.valueOf(propriedades.getProperty("habilita.ssl")));
			email.setAuthentication(propriedades.getProperty("authentication.login"),
					propriedades.getProperty("authentication.password"));
			email.send();
		} catch (Exception e) {
			throw new IllegalAccessError();
		}
	}

}
