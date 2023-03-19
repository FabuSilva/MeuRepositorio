package Facade;

import Facade.subsistema2.Service2;
import Facade.subsitema1.Service1;

public class Facade {
	public void migrarCliente(String nome, String cep) {
		String cidade = Service2.getServise().recupararCidade(cep);
		String estado = Service2.getServise().recupararEstado(cep);
		Service1.gravarCliente(nome, cep,cidade,estado);
	}
}
