package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> alunos = new ArrayList<>();

        while (true) {
            System.out.print("Nome do aluno (ou 'sair'): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Idade: ");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.print("Nota final: ");
            double nota = Double.parseDouble(scanner.nextLine());

            HashMap<String, Object> aluno = new HashMap<>();
            aluno.put("nome", nome);
            aluno.put("idade", idade);
            aluno.put("nota", nota);

            alunos.add(aluno);
        }

        System.out.println("\nLista de alunos:");
        for (HashMap<String, Object> aluno : alunos) {
            System.out.println(aluno.get("nome") + " - Nota: " + aluno.get("nota"));
        }

        double soma = 0;

        for (HashMap<String, Object> aluno : alunos) {
            soma += (double) aluno.get("nota");
        }

        if (!alunos.isEmpty()) {
            double media = soma / alunos.size();
            System.out.println("\nMédia geral da turma: " + media);
        } else {
            System.out.println("\nNenhum aluno cadastrado.");
        }

    }
}
