package br.com.exemplo.optional;

import java.util.Optional;

public class ExemploOptionalEstados {

	public static void main(String[] args) {
        //Optional resolver valores nulos
		Optional<String> optionalString = Optional.of("Valor presente");

		System.out.println("Valor optional est� presente");
		optionalString.ifPresent(presente -> System.out.println("presente"));
		optionalString.orElse("n�o est� presente");

		Optional<String> optionalNull = Optional.ofNullable(null);
		
		System.out.println("Valor optional n�o est� presente");
		optionalNull.ifPresent(naopresente-> System.out.println("n�o est� presente"));
		
		Optional<String> optionalVazio = Optional.empty();
		System.out.println("Valor opcional est� vazio");
		
		optionalVazio.ifPresent(vazio-> System.out.println("est� vazio"));

	}

}
