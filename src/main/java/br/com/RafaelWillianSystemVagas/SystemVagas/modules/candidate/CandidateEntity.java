package br.com.RafaelWillianSystemVagas.SystemVagas.modules.candidate;

import jakarta.validation.constraints.Email;
import lombok.Data;

import java.util.UUID;

@Data
public class CandidateEntity {

    private UUID id;
    private String name;

    @Email(message = "O campo e-mail está inválido!!")
    private String email;
    private String password;

    private String description;

    private String curriculum;
}
