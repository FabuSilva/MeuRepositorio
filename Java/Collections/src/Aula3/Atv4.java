package Aula3;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Atv4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Double> carrosPopulares = new HashMap<>(){{
			put("gol",14.5);
			put("uno",15.6);
			put("mobi",16.1);
			put("hb20",14.5);
			put("kwid",15.1);
		}};
		System.out.println(carrosPopulares);
		
		System.out.print("\nSubstituir o consumo do gol p/15.2: ");
		carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares);
		
		System.out.println("\nModelo tucson existe? "+ carrosPopulares.containsKey("tucson"));
		
		System.out.println("\nconsumo do uno: "+carrosPopulares.get("uno"));
		
		System.out.print("\nImprimir  os modelos(Keys): ");
		Set<String> modelos = carrosPopulares.keySet();
		System.out.println(modelos);
//		System.out.println(carrosPopulares.keySet());
		
		System.out.print("\nImprimir os consumos(Value): ");
		Collection<Double> consumo = carrosPopulares.values();
		System.out.println(consumo);
		//System.out.println(carrosPopulares.values());
		
		System.out.print("\nModelo mais economico: ");
		Double maisEco =Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>>entries = carrosPopulares.entrySet();
		String lista = "";
		for(Map.Entry<String, Double>entry:entries) {
			if(entry.getValue().equals(maisEco)) {
				lista = entry.getKey();
				System.out.print(lista+"-"+maisEco+" ");
			}
		}
		System.out.println();
		
		System.out.print("\nMenos economico: ");
		Double menorEco = Collections.min(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries2 = carrosPopulares.entrySet();
		String lista2 = "";
		for(Map.Entry<String, Double> entry2:entries2) {
			if(entry2.getValue().equals(menorEco)) {
				lista2 = entry2.getKey();
				System.out.print(lista2+"-"+menorEco+" ");
			}
		}
		System.out.println();

		System.out.print("\nSoma dos consumos: ");
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println(soma);
		
		System.out.println("\nMedia dos consumos: "+soma/carrosPopulares.size());
		
		System.out.println("\nRemover consumo 15.6");
		Iterator<Double> iterator2 = carrosPopulares.values().iterator();
		while(iterator2.hasNext()) {
			if(iterator2.next().equals(15.6)) {
				iterator2.remove();
			}
		}
		System.out.println(carrosPopulares);
		
		System.out.print("\nOrdem de insersão: ");
		Map<String,Double> carrosPopulares1 = new LinkedHashMap<>(){{
			put("gol",14.5);
			put("uno",15.6);
			put("mobi",16.1);
			put("hb20",14.5);
			put("kwid",15.1);
		}};
		System.out.println(carrosPopulares1);
		
		System.out.print("\nOrdem de modelo: ");
		Map<String,Double> modelo = new TreeMap<String, Double>(carrosPopulares1);
		System.out.println(modelo);
		
		System.out.print("\nApagando tudo: ");
		carrosPopulares.clear();
		System.out.println(carrosPopulares.isEmpty());
	}

}
