package br.com.RafaelWillianSystemVagas.SystemVagas.modules.candidate.useCases;

import br.com.RafaelWillianSystemVagas.SystemVagas.exceptions.ErrorExist;
import br.com.RafaelWillianSystemVagas.SystemVagas.modules.candidate.entities.CandidateEntity;
import br.com.RafaelWillianSystemVagas.SystemVagas.modules.candidate.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCandidateUseCase {

    @Autowired
    CandidateRepository candidateRepository;
    public CandidateEntity execute(CandidateEntity candidateEntity){

        candidateRepository.findByUserNameOrEmail(candidateEntity.getUserName(), candidateEntity.getEmail())
                .ifPresent( (error) -> {
                    throw new ErrorExist();
                });

        candidateRepository.save(candidateEntity);
        return candidateEntity;
    }


}
