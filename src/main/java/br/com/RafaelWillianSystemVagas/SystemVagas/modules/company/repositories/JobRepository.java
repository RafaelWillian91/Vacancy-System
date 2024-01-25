package br.com.RafaelWillianSystemVagas.SystemVagas.modules.company.repositories;

import br.com.RafaelWillianSystemVagas.SystemVagas.modules.company.entities.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobRepository extends JpaRepository<JobEntity, UUID> {
}
