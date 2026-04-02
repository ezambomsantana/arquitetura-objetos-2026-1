package org.example;

public class Boleto extends MeioPagamento {

    @Override
    public void efetuarPagamento() {
        System.out.println("Pagamento com boleto efetuado!");
    }

}
