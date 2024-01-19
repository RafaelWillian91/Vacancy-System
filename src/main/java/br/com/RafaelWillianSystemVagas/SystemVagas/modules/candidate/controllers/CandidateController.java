package br.com.RafaelWillianSystemVagas.SystemVagas.modules.candidate.controllers;

import br.com.RafaelWillianSystemVagas.SystemVagas.exception.ErrorExist;
import br.com.RafaelWillianSystemVagas.SystemVagas.modules.candidate.CandidateEntity;
import br.com.RafaelWillianSystemVagas.SystemVagas.modules.candidate.CandidateRepository;
import br.com.RafaelWillianSystemVagas.SystemVagas.modules.candidate.useCases.CreateCandidateUseCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.function.Consumer;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CreateCandidateUseCase createCandidateUseCase;
    @PostMapping("/")
    public ResponseEntity<Object> create(@Valid @RequestBody CandidateEntity candidateEntity){

        try {
            createCandidateUseCase.execute(candidateEntity);
            return ResponseEntity.ok(candidateEntity);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }



}
