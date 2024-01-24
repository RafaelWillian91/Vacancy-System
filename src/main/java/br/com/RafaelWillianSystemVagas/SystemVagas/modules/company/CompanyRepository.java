package br.com.RafaelWillianSystemVagas.SystemVagas.modules.company;

import br.com.RafaelWillianSystemVagas.SystemVagas.modules.company.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;
import java.util.UUID;

public interface CompanyRepository extends JpaRepository<CompanyEntity, UUID> {


    Optional<CompanyEntity> findByUserNameOrEmail(String Username, String email);
}
