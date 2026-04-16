package br.insper.curso.common;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ErrorDTO {

    private String mensagem;
    private Integer codigoHttp;
    private LocalDateTime data;
    private String path;
    private String codigoErro;

}
