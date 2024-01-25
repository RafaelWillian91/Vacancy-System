package br.com.RafaelWillianSystemVagas.SystemVagas.modules.company.useCases;

import br.com.RafaelWillianSystemVagas.SystemVagas.modules.company.entities.JobEntity;
import br.com.RafaelWillianSystemVagas.SystemVagas.modules.company.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobUseCases {

    @Autowired
    private JobRepository jobRepository;

    public JobEntity execute(JobEntity jobEntity){

         jobRepository.save(jobEntity);

         return jobEntity;
    }

}
