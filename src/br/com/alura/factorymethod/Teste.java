package br.com.alura.factorymethod;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teste {

	//Novidade do Java 9 - Factory Mathod
	public static void main(String[] args) {
		List<String> nomes = List.of("primeiroNome", "segundoNome", "terceiroNome");
		System.out.println(nomes);
		
		Set<String> nomes2 = Set.of("primeiro","segundo", "terceiro");
		System.out.println(nomes2);
		
		Map<String, String> nomes3 = Map.of("nome","Joao", "sobrenome", "Silva=");
		System.out.println(nomes3);
				
		
		/* Maneira antiga
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("primeiroNome");
		nomes.add("segundoNome");
		nomes.add("terceiroNome");
		List<String> nomesImutavel = Collections.unmodifiableList(nomes);
		System.out.println(nomesImutavel);
		*/
		
	}
}
