package br.com.RafaelWillianSystemVagas.SystemVagas.modules.candidate.repositories;

import br.com.RafaelWillianSystemVagas.SystemVagas.modules.candidate.entities.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CandidateRepository extends JpaRepository<CandidateEntity, UUID> {

    Optional<CandidateEntity> findByUserNameOrEmail (String userName, String email);

}
