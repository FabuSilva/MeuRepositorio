package Aula2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
//Conhecendo os metodos Set
public class Atv2 {

	public static void main(String[] args) {
		System.out.println("Crie um conjunto de notas");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas);
		
		System.out.println("5 Existe? " + notas.contains(5d));
		
		System.out.println("Menor nota: " + Collections.min(notas));
		
		System.out.println("Maior nota: " + Collections.max(notas));
		
		// Estudar itaretor
		Iterator<Double> itarator = notas.iterator();
		Double soma = 0.0;
		while (itarator.hasNext()) {
			Double next = itarator.next();
			soma += next;
		}
		System.out.println("Soma total: " + soma);
		System.out.println("media: " + soma / notas.size());
		notas.remove(0d);
		System.out.println("Removendo a nota zero\n" + notas);
		System.out.println("Remover notas menores que 7");
		Iterator<Double> cursor = notas.iterator();
		while (cursor.hasNext()) {
			Double next = cursor.next();
			if (next < 7) {
				cursor.remove();
			}
		}
		System.out.println(notas);
		System.out.println("Mostrar notas na ordem em que foram informadas");
		Set<Double> notas2 = new LinkedHashSet<Double>() {{
			add(7d);
			add(8.5);
			add(9.3);
			add(5d);
			add(7d);
			add(0d);
			add(3.6);
		}};
		System.out.println(notas2);
		System.out.println("Notas em ordem crescente");
		Set<Double>notas3 = new TreeSet<Double>(notas2);
		System.out.println(notas3);
		System.out.println("Apagando conjunto");
		notas.clear();
		System.out.println("Contunto vazio? "+notas.isEmpty());
	}

}
