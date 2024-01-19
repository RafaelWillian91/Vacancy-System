package br.com.RafaelWillianSystemVagas.SystemVagas.exception;

public class ErrorExist extends RuntimeException{

    public ErrorExist() {
        super("Usuário já existe");
    }
}
