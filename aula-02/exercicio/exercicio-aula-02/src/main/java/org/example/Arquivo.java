package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Arquivo {

    public static ArrayList<String[]> abrirArquivo(String nomeArquivo) {

        ArrayList<String[]> partidas = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
            String linha;

            br.readLine();

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                partidas.add(dados);
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao ler arquivo.");
        }
        return partidas;

    }

}
