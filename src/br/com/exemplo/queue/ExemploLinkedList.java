package br.com.exemplo.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

	public static void main(String[] args) {
        //Garante ordem de inserção
		Queue<String> filaBanco = new LinkedList<>();

		filaBanco.add("Roberto");
		filaBanco.add("Flávio");
		filaBanco.add("Pamela");
		filaBanco.add("Anderson");
		filaBanco.add("Patrícia");

		System.out.println(filaBanco);

		String clienteASerAtendido = filaBanco.poll();

		System.out.println(clienteASerAtendido);

		//Limpar fila
		filaBanco.clear();

		String primeiroCliente = filaBanco.peek();

		System.out.println(primeiroCliente);

	}

}
