package br.com.RafaelWillianSystemVagas.SystemVagas.modules.candidate.controllers;

import br.com.RafaelWillianSystemVagas.SystemVagas.modules.candidate.CandidateEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidate")
public class CandidateController {


    @PostMapping("/")
    public void create(@Valid @RequestBody CandidateEntity candidate){
        System.out.println("Candidato");
        System.out.println(candidate.getEmail());
    }



}
