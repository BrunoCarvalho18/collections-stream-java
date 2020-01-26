package br.com.exemplo.optional;

import java.util.Optional;


public class ExemploOptional {
	
	public static void main(String[] args) {
		
		Optional<String> optionalString = Optional.of("Valor opcional");
		
		System.out.println(optionalString.isPresent());
		
		optionalString.ifPresent(System.out::println);
		
		if(optionalString.isPresent()) {
			String valor = optionalString.get();
			System.out.println(valor);
		}
		
		//Concaternar valor
		optionalString.map((valor)-> valor.concat("****")).ifPresent(System.out::println);
		
		optionalString.orElseThrow(IllegalStateException::new);
		
	}

}
