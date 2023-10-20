package org.example;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico{
    @Override
    public void ligar() {
        System.out.println("Iniciando chamada");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");

    }
}
