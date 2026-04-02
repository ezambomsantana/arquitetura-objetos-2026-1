package org.example;

import java.time.LocalDate;

public class CartaoCredito extends MeioPagamento implements Parcelavel {

    private String numeroCartao;
    private LocalDate expiracao;
    private String cvv;
    private String bandeira;

    public void divideParcelas(int numeroParcelas) {
        System.out.println(getValor() / numeroParcelas);
    }

    @Override
    public void efetuarPagamento(String nome) {
        System.out.println("Pagamento com cartao efetuado!");
    }


    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public LocalDate getExpiracao() {
        return expiracao;
    }

    public void setExpiracao(LocalDate expiracao) {
        this.expiracao = expiracao;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
}
