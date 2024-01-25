package br.com.RafaelWillianSystemVagas.SystemVagas.exceptions;

public class ErrorExist extends RuntimeException{

    public ErrorExist() {
        super("Usuário já existe");
    }
}
