package br.com.alura.reactivestreams;

import java.time.LocalDate;
import java.util.List;

import br.com.alura.reactivestreams.model.*;
import br.com.alura.reactivestreams.wsclient.*;

public class TesteEnvioBloqueante {

	public static void main(String[] args) {

		List<NotaFiscal> notasFiscais = List.of(new NotaFiscal("João", 39.99, LocalDate.now()),
				new NotaFiscal("Renata", 41.20, LocalDate.now()), new NotaFiscal("Paulo", 32.10, LocalDate.now()),
				new NotaFiscal("Feranda", 15.00, LocalDate.now()));

		NotaFiscalWSClient nfwsc = new NotaFiscalWSClient();
		notasFiscais.forEach(nf -> {
			nfwsc.enviar(nf);
			System.out.println("Parabéns pela compra!!");
		});
	}
}
