package org.example;

import java.util.HashMap;

public class Tabela {

    HashMap<String, Time> times = new HashMap<>();

    public void registroTime(String chave, int golsFeitos, int golsSofridos) {
        Time time = times.get(chave);
        if (time == null) {
            time = new Time();
            times.put(chave, time);
        }
        time.registro(chave, golsFeitos, golsSofridos);
    }

    public void verificaPartida(String mandante,  String visitante, int golsMandante, int golsVisitante) {

        Time timeMandante = times.get(mandante);
        Time timeVisitante = times.get(visitante);

        if (golsMandante > golsVisitante) {
            timeMandante.registroResultado(3);
            timeVisitante.registroResultado(0);
        } else if (golsMandante < golsVisitante) {
            timeMandante.registroResultado(0);
            timeVisitante.registroResultado(3);
        } else {
            timeMandante.registroResultado(1);
            timeVisitante.registroResultado(1);
        }
    }

    public void verificaLider() {
        String lider = "";
        int maxPontos = -1;

        for (Time time : times.values()) {
            if (time.pontos > maxPontos) {
                maxPontos = time.pontos;
                lider = time.nome;
            }
        }
        System.out.println(lider);
    }


}
