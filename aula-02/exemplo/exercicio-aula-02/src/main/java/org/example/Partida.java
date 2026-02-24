package org.example;

public class Partida {

    String mandante;
    String visitante;
    int golsMandante;
    int golsVisitante;
    String estadio;
    int publico;
    double preco;

    public void registraPartida(String[] dados) {

        mandante = dados[0];
        visitante = dados[1];
        golsMandante = Integer.parseInt(dados[2]);
        golsVisitante = Integer.parseInt(dados[3]);
        estadio = dados[4];
        publico = Integer.parseInt(dados[5]);
        preco = Double.parseDouble(dados[6]);
    }
}
