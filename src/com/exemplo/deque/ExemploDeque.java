package com.exemplo.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExemploDeque {

	public static void main(String[] args) {

		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Bruno");
		deque.add("Matheus");
		deque.add("Marcos");

		deque.forEach(fila -> System.out.println("for each: " + fila));

		System.out.println("primeiro elemento: " + deque.pollFirst());

		System.out.println("ultimo elemento: " + deque.pollLast());

	}

}
