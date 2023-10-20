package org.example;

public class IphoneModel {
    ReprodutorMusical reprodutorMusical;
    AparelhoTelefonico aparelhoTelefonico;
    NavegadorInternet navegadorInternet;

    public IphoneModel() {
        reprodutorMusical = new ReprodutorMusicalImpl();
        aparelhoTelefonico = new AparelhoTelefonicoImpl();
        navegadorInternet = new NavegadorInternetImpl();
    }
}
