package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Exemplo1 {

    public static double calcularMedia(ArrayList<Double> notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas notas deseja inserir? ");
        int quantidade = scanner.nextInt();

        ArrayList<Double> notas = new ArrayList<>();
        int contador = 0;

        while (contador < quantidade) {
            System.out.println("Digite a nota " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            notas.add(nota);
            contador++;
        }

        double media = calcularMedia(notas);

        System.out.println("Média final: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 5) {
            System.out.println("Aluno em recuperação!");
        } else {
            System.out.println("Aluno reprovado!");
        }

    }

}
