package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Exemplo3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<ContaBancaria> contas = new ArrayList<>();

        while (true) {
            System.out.print("Nome do titular (ou 'sair'): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            ContaBancaria conta = new ContaBancaria();
            conta.titular = nome;
            contas.add(conta);
        }

        for (ContaBancaria conta : contas) {
            conta.depositar(1000);
            conta.sacar(250);
            conta.exibirSaldo();
        }

    }
}
