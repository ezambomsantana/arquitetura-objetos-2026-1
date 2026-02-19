package org.example;

import java.util.HashMap;

public class Time {

    public String nome;
    public int pontos;
    public int golsMarcados;
    public int golsSofridos;
    public int vitorias;
    public int empates;
    public int derrotas;

    public void registro(String nome, int golsMarcados, int golsSofridos) {
        this.nome = nome;
        this.golsMarcados += golsMarcados;
        this.golsSofridos += golsSofridos;
    }

    public void registroResultado(int pontosPartida) {
        this.pontos += pontosPartida;
        if (pontosPartida == 3) {
            this.vitorias += 1;
        } else if (pontosPartida == 1) {
            this.empates += 1;
        } else {
            this.derrotas += 1;
        }

    }


}