package org.example;

import java.util.ArrayList;

public class Compra {

    private ArrayList<String> produtos;
    private Double valor;
    private MeioPagamento meioPagamento;


    public ArrayList<String> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<String> produtos) {
        this.produtos = produtos;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public MeioPagamento getMeioPagamento() {
        return meioPagamento;
    }

    public void setMeioPagamento(MeioPagamento meioPagamento) {
        this.meioPagamento = meioPagamento;
    }

    public void finalizarCompra() {
        meioPagamento.efetuarPagamento();
    }

}
