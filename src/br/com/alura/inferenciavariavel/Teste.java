package br.com.alura.inferenciavariavel;

import java.util.HashMap;

public class Teste {

	//Novidade do Java 10 - Inferencia de Variavel
	public static void main(String[] args) {
		var cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("João", "04813189");

		System.out.println(cpfPorNomes);
		
		/* Maneira Antiga
		HashMap<String, String> cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("João", "04813189");
		System.out.println(cpfPorNomes);
		*/
	}
}
