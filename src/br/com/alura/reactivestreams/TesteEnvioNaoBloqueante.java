package br.com.alura.reactivestreams;


import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

import br.com.alura.reactivestreams.model.NotaFiscal;
import br.com.alura.reactivestreams.subscriber.NotaFiscalSubscriber;;

public class TesteEnvioNaoBloqueante {

	public static void main(String[] args) {
		NotaFiscal primeiraNotaFiscal = new NotaFiscal("João", 39.99, LocalDate.now());
		
		NotaFiscal segundaNotaFiscal = new NotaFiscal("Rodrigo", 139.99, LocalDate.now());
		NotaFiscal terceiraNotaFiscal = new NotaFiscal("Dani", 239.99, LocalDate.now());
		
		SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<>();
		
		//Criado nosso próprio subscriber para processar uma nota por vez
		NotaFiscalSubscriber subscriber = new NotaFiscalSubscriber();
		publisher.subscribe(subscriber);	
		
		//Processamento em paralelo
		
		publisher.submit(primeiraNotaFiscal);
		System.out.println(primeiraNotaFiscal.getNome() + " irá receber a nota fiscal no seu e-mail");
		
		publisher.submit(segundaNotaFiscal);
		System.out.println(segundaNotaFiscal.getNome() + " irá receber a nota fiscal no seu e-mail");
		
		publisher.submit(terceiraNotaFiscal);
		System.out.println(terceiraNotaFiscal.getNome() + " irá receber a nota fiscal no seu e-mail");
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		scan.close();
		publisher.close();
		

	}
}
