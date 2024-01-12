package br.com.RafaelWillianSystemVagas.SystemVagas.modules.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
public class CandidateEntity {

    private UUID id;

    private String name;

    @NotBlank
    @Pattern(regexp = "^(?!\\s*$).+", message = "O campo [userName] não deve conter espaço!")
    private String userName;

    @Email(message = "O campo e-mail está inválido!!")
    private String email;

    @Length(min = 10, max = 100)
    private String password;

    private String description;

    private String curriculum;
}
