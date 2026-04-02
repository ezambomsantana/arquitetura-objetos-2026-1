package org.example;

public class Pix extends MeioPagamento implements Parcelavel {

    private String chaveOrigem;
    private String chaveDestino;
    private String qrCode;

    public void efetuarPagamento() {
        System.out.println("Pagamento Pix efetuado!");
    }

    public void divideParcelas(int numeroParcelas) {
        System.out.println(getValor() / numeroParcelas);
    }

    public String getChaveOrigem() {
        return chaveOrigem;
    }

    public void setChaveOrigem(String chaveOrigem) {
        this.chaveOrigem = chaveOrigem;
    }

    public String getChaveDestino() {
        return chaveDestino;
    }

    public void setChaveDestino(String chaveDestino) {
        this.chaveDestino = chaveDestino;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }
}
