package org.example;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

public class Main {

    static void main() {

        HashMap<String, Paciente> pacientes = new HashMap<>();
        HashMap<String, Consulta> consultas = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println(
                    """
                            #### Menu ####
                            1 - Cadastrar Paciente
                            2 - Listar Pacientes
                            3 - Cadastrar Consulta
                            4 - Listar Consultas
                    """
            );
            String opcao = scanner.next();

            if (opcao.equals("1")) {
                System.out.println("Digite o nome");
                String nome = scanner.next();

                System.out.println("Digite o cpf");
                String cpf = scanner.next();

                System.out.println("Digite a idade");
                int idade = scanner.nextInt();

                if (pacientes.containsKey(cpf)) {
                    System.out.println("Paciente já existe");
                    continue;
                }

                if (nome == null || cpf == null || idade < 0) {
                    System.out.println("Dados inválidos");
                    continue;
                }

                Paciente paciente = new Paciente(nome, cpf, idade);
                pacientes.put(paciente.getCpf(), paciente);

            }

            if (opcao.equals("2")) {
                for (Paciente paciente : pacientes.values()) {
                    paciente.imprime();
                }
            }

            if (opcao.equals("3")) {

                System.out.println("Digite o cpf do paciente");
                String cpf = scanner.next();

                Paciente paciente = pacientes.get(cpf);
                if (paciente != null) {
                    Consulta consulta = new Consulta();
                    consulta.setPaciente(paciente);
                    consulta.setData(LocalDateTime.now().plusDays(5));
                    consulta.setId(UUID.randomUUID().toString());
                    consultas.put(consulta.getId(), consulta);
                    System.out.println("Consulta cadastrada com sucesso");
                }

            }

            if (opcao.equals("4")) {
                for (Consulta consulta : consultas.values()) {
                    consulta.imprime();
                }
            }


        }



    }

}
