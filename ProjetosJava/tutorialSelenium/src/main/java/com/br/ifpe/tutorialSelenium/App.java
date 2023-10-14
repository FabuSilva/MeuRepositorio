package com.br.ifpe.tutorialSelenium;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
public class App {
    
    public static void main(String[] args) {
    	try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File("src/test/resources/Dados.xml"));

            // Encontre o elemento "subtracao" no documento
            NodeList subtracaoList = doc.getElementsByTagName("exponecicao");

            for (int i = 0; i < subtracaoList.getLength(); i++) {
                Element subtracao = (Element) subtracaoList.item(i);

                // Encontre todos os elementos "caso" dentro do elemento "subtracao"
                NodeList casosList = subtracao.getElementsByTagName("caso");

                for (int j = 0; j < casosList.getLength(); j++) {
                    Element caso = (Element) casosList.item(j);

                    // Leitura dos dados dentro do elemento "caso"
                    String primeiroNumero = caso.getElementsByTagName("xn").item(0).getTextContent();
                    String operacao = caso.getElementsByTagName("primeiroNumero").item(0).getTextContent();
                    String abrindoParenteses = caso.getElementsByTagName("segundoNumero").item(0).getTextContent();
                    String segundoNumero = caso.getElementsByTagName("botaoCalculo").item(0).getTextContent();
                    String fechandoParenteses = caso.getElementsByTagName("resultadoEsperado").item(0).getTextContent();
                    //String igualdade = caso.getElementsByTagName("igualdade").item(0).getTextContent();
                    //String resultadoEsperado = caso.getElementsByTagName("resultadoEsperado").item(0).getTextContent();

                    System.out.println("Caso " + j + ":");
                    System.out.println("Primeiro Número: " + primeiroNumero);
                    System.out.println("Operação: " + operacao);
                    System.out.println(abrindoParenteses);
                    System.out.println("Segundo Número: " + segundoNumero);
                    System.out.println(fechandoParenteses);
                    //System.out.println("Igualdade: " + igualdade);
                    //System.out.println("Resultado Esperado: " + resultadoEsperado);
                    System.out.println();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
