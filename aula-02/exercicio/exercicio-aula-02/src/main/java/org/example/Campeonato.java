package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Campeonato {

    public static void main(String[] args) {

        ArrayList<String[]> partidas = Arquivo.abrirArquivo("partidas.csv");

        Tabela tabela = new Tabela();

        int totalGolsCampeonato = 0;
        int totalEmpates = 0;
        double rendaTotal = 0;

        String maiorPublicoPartida = "";
        int maiorPublico = 0;

        String maiorRendaPartida = "";
        double maiorRenda = 0;

        System.out.println("=== LISTA DE PARTIDAS ===");

        for (String[] p : partidas) {

            String mandante = p[0];
            String visitante = p[1];
            int golsMandante = Integer.parseInt(p[2]);
            int golsVisitante = Integer.parseInt(p[3]);
            String estadio = p[4];
            int publico = Integer.parseInt(p[5]);
            double preco = Double.parseDouble(p[6]);

            System.out.println(mandante + " " + golsMandante + " x " + golsVisitante + " " + visitante);

            tabela.registroTime(mandante, golsMandante, golsVisitante);
            tabela.registroTime(visitante, golsVisitante, golsMandante);

            tabela.verificaPartida(mandante, visitante, golsMandante, golsVisitante);

            totalGolsCampeonato += golsMandante + golsVisitante;

            double renda = publico * preco;
            rendaTotal += renda;

            if (publico > maiorPublico) {
                maiorPublico = publico;
                maiorPublicoPartida = mandante + " x " + visitante;
            }

            if (renda > maiorRenda) {
                maiorRenda = renda;
                maiorRendaPartida = mandante + " x " + visitante;
            }
        }

        tabela.verificaLider();

        String melhorAtaque = "";
        int maxGols = -1;

        for (String time : golsMarcados.keySet()) {
            if (golsMarcados.get(time) > maxGols) {
                maxGols = golsMarcados.get(time);
                melhorAtaque = time;
            }
        }

        String melhorSaldo = "";
        int maxSaldo = -9999;

        for (String time : golsMarcados.keySet()) {
            int saldo = golsMarcados.get(time) - golsSofridos.get(time);
            if (saldo > maxSaldo) {
                maxSaldo = saldo;
                melhorSaldo = time;
            }
        }

        double mediaGols = (double) totalGolsCampeonato / partidas.size();

        System.out.println("\n=== ESTATISTICAS DO CAMPEONATO ===");
        System.out.println("Total de gols: " + totalGolsCampeonato);
        System.out.println("Media de gols por partida: " + mediaGols);
        System.out.println("Total de empates: " + totalEmpates);
        System.out.println("Renda total: R$ " + rendaTotal);

        System.out.println("\n=== DESTAQUES ===");
        System.out.println("Lider do campeonato: " + lider + " (" + maxPontos + " pontos)");
        System.out.println("Melhor ataque: " + melhorAtaque + " (" + maxGols + " gols)");
        System.out.println("Melhor saldo de gols: " + melhorSaldo + " (" + maxSaldo + ")");
        System.out.println("Maior publico: " + maiorPublico + " na partida " + maiorPublicoPartida);
        System.out.println("Maior renda: R$ " + maiorRenda + " na partida " + maiorRendaPartida);
    }
}
