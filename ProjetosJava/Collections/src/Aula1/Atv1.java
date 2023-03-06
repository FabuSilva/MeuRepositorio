package Aula1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Atv1 {
//Conhecendo os metodos Collections
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Gato> meusGatos = new ArrayList<>() {{
			add(new Gato("gato2",18,"preto"));
			add(new Gato("gato2",6,"tigrado"));
			add(new Gato("gato3",12,"amarelo"));
		}};
		System.out.println("--\tOrdem de insersão\t--");
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem de aleatoria\t--");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem natural (Nome)\t--");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem idade\t--");
		Collections.sort(meusGatos, new ComparaIdade());
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem cor\t--");
		Collections.sort(meusGatos,new ComparaCor());
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem cor/nome/idade\t--");
		Collections.sort(meusGatos, new ComparaCorNomeIdade());
		System.out.println(meusGatos);
		
	}

}
// Estudar o comparable
class Gato implements Comparable<Gato>{
	private String nome;
	private int idade;
	private String cor;
	
	public Gato(String nome, int idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "{Nome: "+nome+" Idade: "+idade+" Cor: "+cor+"}";
	}

	@Override
	public int compareTo(Gato gato) {
		// TODO Auto-generated method stub
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
}

class ComparaIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		// TODO Auto-generated method stub
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
}

class ComparaCor implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
	
}

class ComparaCorNomeIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if(nome != 0) return nome;
		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		if(cor != 0) return cor;
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
}
