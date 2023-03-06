package br.com.dio.desafio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Js");
		curso2.setDescricao("Descrição curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição da mentoria Java");
		mentoria.setData(LocalDate.now());
		
		Conteudo conteudo = new Curso();
		Conteudo conteudo1 = new Mentoria();
		
		List<String> palavras = new ArrayList<>();
		

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Java developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		//bootcamp.getConteudos().add(curso3);
		bootcamp.getConteudos().add(mentoria);

		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos de "+devCamila.getNome()+": "+devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("Conteudos concluidos de "+devCamila.getNome()+": "+devCamila.getConteudosConcluidos());
		System.out.println("Conteudos inscritos de "+devCamila.getNome()+": "+devCamila.getConteudosInscritos());
		System.out.println(devCamila.calcularXp());
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos de "+devJoao.getNome()+": "+devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("Conteudos concluidos de "+devJoao.getNome()+": "+devJoao.getConteudosConcluidos());
		System.out.println("Conteudos inscritos de "+devJoao.getNome()+": "+devJoao.getConteudosInscritos());
		System.out.println(devJoao.calcularXp());

	}

}
