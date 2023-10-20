package org.example;

public class Main {
    public static void main(String[] args) {
        IphoneModel iphone = new IphoneModel();
        iphone.reprodutorMusical.tocar();
        iphone.reprodutorMusical.pausar();
        iphone.reprodutorMusical.selecionarMusica();
        System.out.println("__________________________");
        iphone.aparelhoTelefonico.ligar();
        iphone.aparelhoTelefonico.atender();
        iphone.aparelhoTelefonico.iniciarCorreioVoz();
        System.out.println("__________________________");
        iphone.navegadorInternet.adicionarNovaAba();
        iphone.navegadorInternet.atualizarPagina();
        iphone.navegadorInternet.exibirPagina();
        System.out.println("__________________________");
    }
}