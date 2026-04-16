package br.insper.curso.common;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalErrorHandling {


    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorDTO handleMethodArgumentNotValidException(MethodArgumentNotValidException ex,
                                                          HttpServletRequest request) {

        String mensagem = ex
                .getBindingResult()
                .getFieldErrors()
                .stream()
                .map(e -> e.getDefaultMessage())
                .collect(Collectors.joining(","));


        ErrorDTO errorDTO =  new ErrorDTO();
        errorDTO.setMensagem(mensagem);
        errorDTO.setData(LocalDateTime.now());
        errorDTO.setCodigoHttp(HttpStatus.BAD_REQUEST.value());
        errorDTO.setCodigoErro("INPUT_ERROR");
        errorDTO.setPath(request.getRequestURI());
        return  errorDTO;
    }
}
