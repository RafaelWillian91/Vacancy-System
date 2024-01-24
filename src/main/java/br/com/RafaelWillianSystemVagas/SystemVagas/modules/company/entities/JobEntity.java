package br.com.RafaelWillianSystemVagas.SystemVagas.modules.company.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "job")
@Data
public class JobEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String description;

    private String level;

    private String benefits;

    @ManyToOne
    @JoinColumn(name = "company_Id",insertable=false, updatable=false)
    private CompanyEntity companyEntity;

    @Column(name = "company_Id")
    private UUID companyId;

    @CreationTimestamp
    private LocalDateTime localDateTime;
}

