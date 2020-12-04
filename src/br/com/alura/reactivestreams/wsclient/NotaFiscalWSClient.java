package br.com.alura.reactivestreams.wsclient;

import br.com.alura.reactivestreams.model.NotaFiscal;

public class NotaFiscalWSClient {

	public void enviar(NotaFiscal nf) {
		try {
			System.out.println("Emitindo nota fiscal");
			System.out.println("A thread do TesteEnvioNaoBloqueante é: " + Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.format("Nota fiscal emitida em nome de %s, na data de %s %n", 
					nf.getNome(), nf.getData());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
