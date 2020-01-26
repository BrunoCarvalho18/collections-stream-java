package br.com.exemplo.stream;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploStreamToSet {
	
	public static void main(String[] args) {
		
		//Criando uma stream de strings
		Stream<String> stream = Stream.of("Bruno", "Carvalho", "Sa");
		
		Set<String> meuSet = stream.collect(Collectors.toSet());
		
		System.out.println(meuSet);
	}

}
