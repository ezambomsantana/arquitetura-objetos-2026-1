package org.example;

package campeonato;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Campeonato {

    public static void main(String[] args) {

        ArrayList<String[]> partidas = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("partidas.csv"));
            String linha;

            br.readLine();

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                partidas.add(dados);
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo.");
            return;
        }

        HashMap<String, Integer> pontos = new HashMap<>();
        HashMap<String, Integer> golsMarcados = new HashMap<>();
        HashMap<String, Integer> golsSofridos = new HashMap<>();
        HashMap<String, Integer> vitorias = new HashMap<>();
        HashMap<String, Integer> empates = new HashMap<>();
        HashMap<String, Integer> derrotas = new HashMap<>();

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

            pontos.putIfAbsent(mandante, 0);
            pontos.putIfAbsent(visitante, 0);
            golsMarcados.putIfAbsent(mandante, 0);
            golsMarcados.putIfAbsent(visitante, 0);
            golsSofridos.putIfAbsent(mandante, 0);
            golsSofridos.putIfAbsent(visitante, 0);
            vitorias.putIfAbsent(mandante, 0);
            vitorias.putIfAbsent(visitante, 0);
            empates.putIfAbsent(mandante, 0);
            empates.putIfAbsent(visitante, 0);
            derrotas.putIfAbsent(mandante, 0);
            derrotas.putIfAbsent(visitante, 0);

            golsMarcados.put(mandante, golsMarcados.get(mandante) + golsMandante);
            golsMarcados.put(visitante, golsMarcados.get(visitante) + golsVisitante);

            golsSofridos.put(mandante, golsSofridos.get(mandante) + golsVisitante);
            golsSofridos.put(visitante, golsSofridos.get(visitante) + golsMandante);

            totalGolsCampeonato += golsMandante + golsVisitante;

            if (golsMandante > golsVisitante) {
                pontos.put(mandante, pontos.get(mandante) + 3);
                vitorias.put(mandante, vitorias.get(mandante) + 1);
                derrotas.put(visitante, derrotas.get(visitante) + 1);
            } else if (golsMandante < golsVisitante) {
                pontos.put(visitante, pontos.get(visitante) + 3);
                vitorias.put(visitante, vitorias.get(visitante) + 1);
                derrotas.put(mandante, derrotas.get(mandante) + 1);
            } else {
                pontos.put(mandante, pontos.get(mandante) + 1);
                pontos.put(visitante, pontos.get(visitante) + 1);
                empates.put(mandante, empates.get(mandante) + 1);
                empates.put(visitante, empates.get(visitante) + 1);
                totalEmpates++;
            }

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

        String lider = "";
        int maxPontos = -1;

        for (String time : pontos.keySet()) {
            if (pontos.get(time) > maxPontos) {
                maxPontos = pontos.get(time);
                lider = time;
            }
        }

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

