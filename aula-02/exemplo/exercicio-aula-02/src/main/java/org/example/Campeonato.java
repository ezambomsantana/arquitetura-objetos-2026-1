package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Campeonato {

    public static void main(String[] args) {

        ArrayList<Partida> partidas = Arquivo.abrirArquivo("partidas.csv");

        Tabela tabela = new Tabela();

        int totalGolsCampeonato = 0;
        int totalEmpates = 0;
        double rendaTotal = 0;

        String maiorPublicoPartida = "";
        int maiorPublico = 0;

        String maiorRendaPartida = "";
        double maiorRenda = 0;

        System.out.println("=== LISTA DE PARTIDAS ===");

        for (Partida p : partidas) {

            System.out.println(p.mandante + " " + p.golsMandante + " x " + p.golsVisitante + " " + p.visitante);

            tabela.registroTime(p.mandante, p.golsMandante, p.golsVisitante);
            tabela.registroTime(p.visitante, p.golsVisitante, p.golsMandante);

            tabela.verificaPartida(p.mandante, p.visitante, p.golsMandante, p.golsVisitante);

            totalGolsCampeonato += p.golsMandante + p.golsVisitante;

            double renda = p.publico * p.preco;
            rendaTotal += renda;

            if (p.publico > maiorPublico) {
                maiorPublico = p.publico;
                maiorPublicoPartida = p.mandante + " x " + p.visitante;
            }

            if (renda > maiorRenda) {
                maiorRenda = renda;
                maiorRendaPartida = p.mandante + " x " + p.visitante;
            }
        }

        double mediaGols = (double) totalGolsCampeonato / partidas.size();

        System.out.println("\n=== ESTATISTICAS DO CAMPEONATO ===");
        System.out.println("Total de gols: " + totalGolsCampeonato);
        System.out.println("Media de gols por partida: " + mediaGols);
        System.out.println("Total de empates: " + totalEmpates);
        System.out.println("Renda total: R$ " + rendaTotal);

        System.out.println("\n=== DESTAQUES ===");
        tabela.verificaLider();
        tabela.melhorAtaque();
        tabela.melhorSaldo();
        System.out.println("Maior publico: " + maiorPublico + " na partida " + maiorPublicoPartida);
        System.out.println("Maior renda: R$ " + maiorRenda + " na partida " + maiorRendaPartida);
    }
}
