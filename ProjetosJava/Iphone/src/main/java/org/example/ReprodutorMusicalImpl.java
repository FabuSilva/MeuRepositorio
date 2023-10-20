package org.example;

public class ReprodutorMusicalImpl implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("A musica esta tocando!");
    }

    @Override
    public void pausar() {
        System.out.println("A musica esta pausada!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecione a musica!\nExemplo 1\nExemplo2\nExemplo 3\n...");

    }
}
