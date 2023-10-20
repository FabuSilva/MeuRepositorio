package org.example;

public class NavegadorInternetImpl implements NavegadorInternet{
    @Override
    public void exibirPagina() {
        System.out.println("Pagina abertas");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba criada");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");

    }
}
