package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Pix pix = new Pix();
        pix.setCpf("123");
        pix.setValor(500d);
        pix.setDataPagamento(LocalDateTime.now());
        pix.setChaveOrigem("123");
        pix.setChaveDestino("234");
        pix.setDescricao("pix");

        CartaoCredito cartaoCredito = new CartaoCredito();
        cartaoCredito.setCpf("123");
        cartaoCredito.setNumeroCartao("1234");
        cartaoCredito.setDescricao("credito");

        Boleto boleto = new Boleto();


        Compra compra = new Compra();
        compra.setValor(500d);
        compra.setMeioPagamento(pix);

        compra.finalizarCompra();

        List<MeioPagamento> meioPagamentos =
                new LinkedList<>();
        meioPagamentos.add(pix);
        meioPagamentos.add(cartaoCredito);

        for (MeioPagamento m : meioPagamentos) {
            m.efetuarPagamento();
        }


    }
}
