package ExercicioProposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula1_DisqueAjuda {
	/*
	 * Utilizando listas, fa�a um programa que fa�a 5 perguntas para uma pessoa
	 * sobre um crime. As perguntas s�o: "Telefonou para a v�tima?"
	 * "Esteve no local do crime?" "Mora perto da v�tima?" "Devia para a v�tima?"
	 * "J� trabalhou com a v�tima?".
	 *  Se a pessoa responder positivamente a 2 quest�es
	 * ela deve ser classificada como "Suspeita", entre 3 e 4 como "C�mplice" e 5
	 * como "Assassina". Caso contr�rio, ela ser� classificado como "Inocente".
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> respostas = new ArrayList<String>();
		String res;

		System.out.println("Telefonou para a v�tima?");
		res = sc.next();
		respostas.add(res);
		System.out.println("Esteve no local do crime?");
		res = sc.next();
		respostas.add(res);
		System.out.println("Mora perto da v�tima?");
		res = sc.next();
		respostas.add(res);
		System.out.println("Devia para a v�tima?");
		res = sc.next();
		respostas.add(res);
		System.out.println("J� trabalhou para a v�tima?");
		res = sc.next();
		respostas.add(res);
		System.out.println(respostas);
		// respostas.forEach(lista ->{System.out.println(lista);});

	}

}
