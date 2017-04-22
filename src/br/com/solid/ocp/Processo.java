package br.com.solid.ocp;

public enum Processo {

	RELATORIO("relatorio", new RelatorioFaturametoBatch()), EXPURGO("expurgo", new ExpurgoBatch()), INCLUSAO_CLIENTE(
			"inclusao", new InclusaoClientesBatch()), INCLUSAO_TELEFONE("telefone", new InclusaoTelefoneBatch());

	private String nome;
	private Batch batch;

	private Processo(String nome, Batch batch) {
		this.nome = nome;
		this.batch = batch;
	}

	public static Batch getBatch(String nome) {
		for (Processo processo : Processo.values())
			if (processo.nome.equals(nome))
				return processo.batch;

		return null;
	}

}
