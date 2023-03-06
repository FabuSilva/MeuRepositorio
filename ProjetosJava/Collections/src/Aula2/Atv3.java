package Aula2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Atv3 {
//Ordenação de Listas
	public static void main(String[] args) {
		
		Set<Serie> series = new HashSet<Serie>() {{
			add(new Serie("GOT","Fantasia",60));
			add(new Serie("Darck","Drama",60));
			add(new Serie("That '70s show'","Comedia",25));
		}};
		System.out.println("Ordem aleatoria");
		series.forEach(s ->{System.out.println(s);});
		
		System.out.println("\nOrdem de inserção");
		Set<Serie>insercao = new LinkedHashSet<Serie>() {{
			add(new Serie("GOT","Fantasia",60));
			add(new Serie("Darck","Drama",60));
			add(new Serie("That '70s show'","Comedia",25));
		}};
		insercao.forEach(i ->{System.out.println(i);});
		
		System.out.println("\nOrdem por tempo de ep");
		Set<Serie>tempo = new TreeSet<>(insercao);
		tempo.forEach(t ->{System.out.println(t);});
		
		System.out.println("\nOrdem Nome/Genero/Tempo");
		Set<Serie>ordem = new TreeSet<>(new ComparatorTotal());
		ordem.addAll(series);
		ordem.forEach(o ->{System.out.println(o);});

	}

}

class Serie implements Comparable<Serie>{
	private String nome;
	private String genero;
	private Integer duracaoEp;
	public Serie(String nome, String genero, Integer duracaoEp) {
		this.nome = nome;
		this.genero = genero;
		this.duracaoEp = duracaoEp;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Integer getDuracaoEp() {
		return duracaoEp;
	}
	public void setDuracaoEp(Integer duracaoEp) {
		this.duracaoEp = duracaoEp;
	}
	@Override
	public String toString() {
		return "nome: " + nome + ", genero: " + genero + ", duracaoEp: " + duracaoEp;
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
	public int compareTo(Serie s) {
		int tep = Integer.compare(this.getDuracaoEp(),s.getDuracaoEp());
		if(tep !=0) {
			return tep;
		}
		return this.getGenero().compareTo(s.getGenero());
	}
}

class ComparatorTotal implements Comparator<Serie>{

	@Override
	public int compare(Serie s1, Serie s2) {
		int nome = s1.getNome().compareTo(s2.getNome());
		if(nome != 0) {
			return nome;
		}
		int genero = s1.getGenero().compareTo(s2.getGenero());
		if(genero != 0) {
			return genero;
		}
		return Integer.compare(s1.getDuracaoEp(), s2.getDuracaoEp());
	}
	
}
