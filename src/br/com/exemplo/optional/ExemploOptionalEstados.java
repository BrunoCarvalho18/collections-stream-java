package br.com.exemplo.optional;

import java.util.Optional;

public class ExemploOptionalEstados {

	public static void main(String[] args) {
        //Optional resolver valores nulos
		Optional<String> optionalString = Optional.of("Valor presente");

		System.out.println("Valor optional está presente");
		optionalString.ifPresent(presente -> System.out.println("presente"));
		optionalString.orElse("não está presente");

		Optional<String> optionalNull = Optional.ofNullable(null);
		
		System.out.println("Valor optional não está presente");
		optionalNull.ifPresent(naopresente-> System.out.println("não está presente"));
		
		Optional<String> optionalVazio = Optional.empty();
		System.out.println("Valor opcional está vazio");
		
		optionalVazio.ifPresent(vazio-> System.out.println("está vazio"));

	}

}
