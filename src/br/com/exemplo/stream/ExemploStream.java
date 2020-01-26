package br.com.exemplo.stream;

import java.util.*;
import java.util.stream.*;

public class ExemploStream {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("Bruno", "Carvalho", "Sa");

		Collection<String> nomes = stream.collect(Collectors.toCollection(TreeSet::new));

		System.out.println(nomes);
	}

}
