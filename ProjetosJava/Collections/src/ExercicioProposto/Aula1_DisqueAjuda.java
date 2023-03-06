package ExercicioProposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula1_DisqueAjuda {
	/*
	 * Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa
	 * sobre um crime. As perguntas são: "Telefonou para a vítima?"
	 * "Esteve no local do crime?" "Mora perto da vítima?" "Devia para a vítima?"
	 * "Já trabalhou com a vítima?".
	 *  Se a pessoa responder positivamente a 2 questões
	 * ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
	 * como "Assassina". Caso contrário, ela será classificado como "Inocente".
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> respostas = new ArrayList<String>();
		String res;

		System.out.println("Telefonou para a vítima?");
		res = sc.next();
		respostas.add(res);
		System.out.println("Esteve no local do crime?");
		res = sc.next();
		respostas.add(res);
		System.out.println("Mora perto da vítima?");
		res = sc.next();
		respostas.add(res);
		System.out.println("Devia para a vítima?");
		res = sc.next();
		respostas.add(res);
		System.out.println("Já trabalhou para a vítima?");
		res = sc.next();
		respostas.add(res);
		System.out.println(respostas);
		// respostas.forEach(lista ->{System.out.println(lista);});

	}

}
