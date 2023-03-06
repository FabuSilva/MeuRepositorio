package Aula3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Atv5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Livro>livros = new HashMap<>() {{
			put("HS",new Livro("uma breve historia sobre o tempo",256));
			put("DC",new Livro("o poder do habito",408));
			put("HYN",new Livro("21 lições para o seculo 21",432));
		}};
		System.out.println("Ordem aleatoria");
		for(Map.Entry<String, Livro> livro: livros.entrySet()) {
			System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
		}
		
		System.out.println("\nOrdem de inserção");
		Map<String,Livro> insecao = new LinkedHashMap<>() {{
			put("HS",new Livro("uma breve historia sobre o tempo",256));
			put("DC",new Livro("o poder do habito",408));
			put("HYN",new Livro("21 lições para o seculo 21",432));
		}};
		for(Map.Entry<String, Livro> i: insecao.entrySet()) {
			System.out.println(i.getKey()+" - "+i.getValue().getNome());
		}
		
		System.out.println("\nOrdem autor");
		Map<String,Livro>autor = new TreeMap<>(insecao);
		for(Map.Entry<String, Livro>a:autor.entrySet()) {
			System.out.println(a.getKey()+" - "+a.getValue().getNome());
		}
		
		System.out.println("\nOrdem livros");
		Set<Map.Entry<String,Livro>> oLivro = new TreeSet<>(new comparetorNome());
		oLivro.addAll(livros.entrySet());
		for(Map.Entry<String, Livro> ol: oLivro) {
			System.out.println(ol.getValue().getNome()+" - "+ol.getKey());
		}
		
		System.out.println("\nOrdem pag");
		Set<Map.Entry<String, Livro>> pag = new TreeSet<>(new comparetorPag());
		pag.addAll(livros.entrySet());
		pag.forEach(p ->{
			System.out.println(p.getValue().getPag()+" - "+p.getValue().getNome()+" - "+p.getKey());
			});
	}

}

class Livro{
	private String nome;
	private Integer pag;
	
	public Livro(String nome, Integer pag) {
		this.nome = nome;
		this.pag = pag;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPag() {
		return pag;
	}

	public void setPag(Integer pag) {
		this.pag = pag;
	}

	@Override
	public String toString() {
		return "nome: " + nome + ", pag: " + pag;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, pag);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(pag, other.pag);
	}
	
}

class comparetorNome implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
		return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
	}
	
}

class comparetorPag implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
		return Integer.compare(l1.getValue().getPag(), l2.getValue().getPag());
	}
	
}