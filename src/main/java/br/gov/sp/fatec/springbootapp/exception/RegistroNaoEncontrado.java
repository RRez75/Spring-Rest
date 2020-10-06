package br.gov.sp.fatec.springbootapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RegistroNaoEncontrado extends RuntimeException{
    
    private static final long serialVersionUID = 1L;

    public RegistroNaoEncontrado() {
        super();
    }

    public RegistroNaoEncontrado(String message){
        super(message);
    }

    public RegistroNaoEncontrado(Throwable cause){
        super(cause);
    }

    public RegistroNaoEncontrado(String message, Throwable cause){
        super(message, cause);
    }
    
}