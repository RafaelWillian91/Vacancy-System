package br.com.RafaelWillianSystemVagas.SystemVagas.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessageDTO {

    public ErrorMessageDTO(){};
    private String message;
    private String fiel;
}
