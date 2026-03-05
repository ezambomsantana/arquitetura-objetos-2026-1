package org.example;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

public class Main {

    static void main() {

        PacienteService pacienteService = new PacienteService();
        ConsultaService consultaService = new ConsultaService();

        Scanner scanner = new Scanner(System.in);

        String opcao = "";
        while (!opcao.equals("5")) {

            System.out.println(
                    """
                            #### Menu ####
                            1 - Cadastrar Paciente
                            2 - Listar Pacientes
                            3 - Cadastrar Consulta
                            4 - Listar Consultas
                            5 - Sair
                    """
            );
            opcao = scanner.next();

            if (opcao.equals("1")) {
                System.out.println("Digite o nome");
                String nome = scanner.next();

                System.out.println("Digite o cpf");
                String cpf = scanner.next();

                System.out.println("Digite a idade");
                int idade = scanner.nextInt();

                pacienteService.cadastrarPaciente(nome, cpf, idade, null);

            }

            if (opcao.equals("2")) {
                pacienteService.listarPacientes();
            }

            if (opcao.equals("3")) {

                System.out.println("Digite o cpf do paciente");
                String cpf = scanner.next();

                Paciente paciente = pacienteService.buscarPaciente(cpf);

                consultaService.cadastrarConsulta(paciente);

            }

            if (opcao.equals("4")) {
                consultaService.listarConsultas();
            }


        }



    }

}
