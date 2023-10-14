package com.br.ifpe.tutorialSelenium;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
class ProjetoUnidade {
	static WebDriver driver;
	private static Document doc;
	private static NodeList listaOperacoes;
	private static NodeList listaCasos;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\OneDrive\\Documentos\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		try {
			File inputFile = new File("src/test/resources/Dados.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			
			listaOperacoes = doc.getElementsByTagName("operacoes");
		}catch(Exception e) {
			System.out.println("Erro na leitura do documento");
		}
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		driver.get("https://www.calculadoraonline.com.br/basica");
	}

	@AfterEach
	void tearDown() throws Exception {

	}
	public NodeList buscandoCasoXml(String operacao) {
		NodeList listaXml = doc.getElementsByTagName(operacao);
		NodeList casos = null;
		for(int i=0;i < listaXml.getLength();i++) {
			Element elementoXml = (Element) listaXml.item(i);
			casos = elementoXml.getElementsByTagName("caso");
		}
		return casos;
	}
	
	@Test
	void testDataDrivenAdicao() {
		listaCasos = buscandoCasoXml("adicao");
				for(int j = 0; j < listaCasos.getLength();j++) {
					Element casos = (Element) listaCasos.item(j);
					driver.findElement(By.cssSelector("#TIExp")).sendKeys(casos.getElementsByTagName("primeiroNumero").item(0).getTextContent());
					driver.findElement(By.id("b4")).click();
					driver.findElement(By.cssSelector("#TIExp")).sendKeys(casos.getElementsByTagName("abrindoParenteses").item(0).getTextContent());//abrindo parenteses 
					driver.findElement(By.cssSelector("#TIExp")).sendKeys(casos.getElementsByTagName("sinalNumero").item(0).getTextContent());
					driver.findElement(By.id(casos.getElementsByTagName("segundoNumero").item(0).getTextContent())).click();
					driver.findElement(By.cssSelector("#TIExp")).sendKeys(casos.getElementsByTagName("fechandoParenteses").item(0).getTextContent());//fechando parenteses
					driver.findElement(By.id("b27")).click();
					assertEquals(casos.getElementsByTagName("resultadoEsperado").item(0).getTextContent(),driver.findElement(By.cssSelector("#TIExp")).getAttribute("value"));
					driver.findElement(By.xpath("//*[@id=\"jp-right\"]/div[2]/div/main/article/div[7]/table/tbody/tr/td[2]")).click();
				}
	}
	
	@Test
	void testDataDrivenSubtracao() {
		listaCasos = buscandoCasoXml("subtracao");
		for(int j = 0; j < listaCasos.getLength();j++) {
			Element casos = (Element) listaCasos.item(j);
			driver.findElement(By.cssSelector("#TIExp")).sendKeys(casos.getElementsByTagName("primeiroNumero").item(0).getTextContent());
			driver.findElement(By.id("b12")).click();
			driver.findElement(By.cssSelector("#TIExp")).sendKeys(casos.getElementsByTagName("abrindoParenteses").item(0).getTextContent());//abrindo parenteses 
			driver.findElement(By.cssSelector("#TIExp")).sendKeys(casos.getElementsByTagName("sinalNumero").item(0).getTextContent());
			driver.findElement(By.id(casos.getElementsByTagName("segundoNumero").item(0).getTextContent())).click();
			driver.findElement(By.cssSelector("#TIExp")).sendKeys(casos.getElementsByTagName("fechandoParenteses").item(0).getTextContent());//fechando parenteses
			driver.findElement(By.id("b27")).click();
			assertEquals(casos.getElementsByTagName("resultadoEsperado").item(0).getTextContent(),driver.findElement(By.cssSelector("#TIExp")).getAttribute("value"));
			driver.findElement(By.xpath("//*[@id=\"jp-right\"]/div[2]/div/main/article/div[7]/table/tbody/tr/td[2]")).click();
		}
	}
	
	@Test
	 void testDataDrivenMultiplicacao() {
		listaCasos = buscandoCasoXml("multiplicacao");
		for(int i=0; i < listaCasos.getLength();i++) {
			Element casos = (Element) listaCasos.item(i);
			driver.findElement(By.cssSelector("#TIExp")).sendKeys(casos.getElementsByTagName("sinalNumero").item(0).getTextContent());
			driver.findElement(By.id(casos.getElementsByTagName("primeiroDigitoNumero").item(0).getTextContent())).click();
			driver.findElement(By.id(casos.getElementsByTagName("segundoDigitoNumero").item(0).getTextContent())).click();
			driver.findElement(By.id("b20")).click();
			driver.findElement(By.cssSelector("#TIExp")).sendKeys(casos.getElementsByTagName("segundoNumero").item(0).getTextContent());
			driver.findElement(By.id("b27")).click(); 
			assertEquals(casos.getElementsByTagName("resultadoEsperado").item(0).getTextContent(),driver.findElement(By.cssSelector("#TIExp")).getAttribute("value"));
			driver.findElement(By.xpath("//*[@id=\"jp-right\"]/div[2]/div/main/article/div[7]/table/tbody/tr/td[2]")).click();
		}
	}
	
	@Test
	 void testDataDrivenDivisao() {
		listaCasos = buscandoCasoXml("divisao");
		for(int i=0; i < listaCasos.getLength();i++) {
			Element casos = (Element) listaCasos.item(i);
			driver.findElement(By.cssSelector("#TIExp")).sendKeys(casos.getElementsByTagName("sinalNumero").item(0).getTextContent());
			driver.findElement(By.id(casos.getElementsByTagName("primeiroDigitoNumero").item(0).getTextContent())).click();
			driver.findElement(By.id(casos.getElementsByTagName("segundoDigitoNumero").item(0).getTextContent())).click();
			driver.findElement(By.id("b28")).click();
			driver.findElement(By.cssSelector("#TIExp")).sendKeys(casos.getElementsByTagName("segundoNumero").item(0).getTextContent());
			driver.findElement(By.id("b27")).click();
			assertEquals(casos.getElementsByTagName("resultadoEsperado").item(0).getTextContent(),driver.findElement(By.cssSelector("#TIExp")).getAttribute("value"));
			driver.findElement(By.xpath("//*[@id=\"jp-right\"]/div[2]/div/main/article/div[7]/table/tbody/tr/td[2]")).click();
			}
		}
		
	@Test 
	void testDataDrivenExponenciacao() throws InterruptedException { 
		listaCasos = buscandoCasoXml("exponecicao");
		for(int i=0; i < listaCasos.getLength();i++) {
			Element casos = (Element) listaCasos.item(i);
			driver.findElement(By.id("b31")).click();
			driver.findElement(By.id("cx31_0")).sendKeys(casos.getElementsByTagName("primeiroNumero").item(0).getTextContent());
			driver.findElement(By.id("cx31_1")).sendKeys(casos.getElementsByTagName("segundoNumero").item(0).getTextContent());
			driver.findElement(By.xpath("//*[@id=\"dpb31\"]/button")).click();
			assertEquals(casos.getElementsByTagName("resultadoEsperado").item(0).getTextContent(),driver.findElement(By.cssSelector("#TIExp")).getAttribute("value"));
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id=\"jp-right\"]/div[2]/div/main/article/div[7]/table/tbody/tr/td[2]")).click();
		}
	}
	
}
