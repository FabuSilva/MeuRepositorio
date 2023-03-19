package Facade.subsitema1;

public class Service1 {
	
	private Service1() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep,String cidade ,String estado) {
		System.out.println("Cliente salvo\n");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
	}
}
