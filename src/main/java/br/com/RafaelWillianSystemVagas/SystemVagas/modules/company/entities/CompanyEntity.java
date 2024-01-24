package br.com.RafaelWillianSystemVagas.SystemVagas.modules.company.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "company")
@Data
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    @NotBlank
    @Pattern(regexp = "^(?!\\s*$).+", message = "O campo não pode ser branco")
    private String userName;
    @Length(min = 10, max = 100)
    private String password;
    private String webSite;
    @Email(message = "O campo e-email está inválido")
    private String email;
    private String description;

    @CreationTimestamp
    @Column(name = "CreationDateTime")
    private LocalDateTime localDateTime;


}
