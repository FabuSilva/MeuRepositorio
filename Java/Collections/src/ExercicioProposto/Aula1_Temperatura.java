package ExercicioProposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aula1_Temperatura {
	/*
	 * Faça um programa que receba a temperatura média dos 6 primeiros meses do ano
	 * e armazene-as em uma lista. Após isto, calcule a média semestral das
	 * temperaturas e mostre todas as temperaturas acima desta média, e em que mês
	 * elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 evereiro e etc).
	 */
	public static void main(String[] args) {
		Random t = new Random();
		double soma = 0;
		List<Tempo> lista = new ArrayList<Tempo>() {
			{
				add(new Tempo("Janeiro", t.nextDouble(41)));
				add(new Tempo("Fevereiro", t.nextDouble(41)));
				add(new Tempo("Março", t.nextDouble(41)));
				add(new Tempo("Abril", t.nextDouble(41)));
				add(new Tempo("Maio", t.nextDouble(41)));
				add(new Tempo("Junho", t.nextDouble(41)));
			}
		};
		System.out.println(lista);

		for (Tempo tempo : lista) {
			soma += (tempo.getTemperatura() / lista.size());
		}
		System.out.println("Media das temperaturas é: " + soma);
		final double media = soma;
		lista.forEach(tempo -> {
			if (tempo.getTemperatura() >= media)
				System.out.println(tempo);
		});
	}

}

class Tempo {
	private String mes;
	private double temperatura;

	public Tempo(String mes, double temperatura) {
		this.setMes(mes);
		this.setTemperatura(temperatura);
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "(mês do ano: " + mes + ", temperatura: " + temperatura + ");\n";
	}

}
