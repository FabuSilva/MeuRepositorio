package Facade.subsistema2;

public class Service2 {
	
	private static Service2 servise = new Service2();
	
	private Service2() {
		super();
	}
	
	public static Service2 getServise() {
		return servise;
	}
	
	public static String recupararCidade(String cep) {
		return "Cidade recuperada";
	}

	public static String recupararEstado(String cep) {
		return "Estado recuperado";
	}
}
