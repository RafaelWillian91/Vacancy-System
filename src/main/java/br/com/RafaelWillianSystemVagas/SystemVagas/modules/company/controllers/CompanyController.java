package br.com.RafaelWillianSystemVagas.SystemVagas.modules.company.controllers;

import br.com.RafaelWillianSystemVagas.SystemVagas.modules.company.entities.CompanyEntity;
import br.com.RafaelWillianSystemVagas.SystemVagas.modules.company.useCases.CreateCompanyUseCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/createCompany")
public class CompanyController {

    @Autowired
    private CreateCompanyUseCase createCandidateUseCase;

    @PostMapping("/")
    public ResponseEntity<Object> createCompany(@Valid @RequestBody CompanyEntity companyEntity){
        System.out.println(companyEntity);
        try {
            createCandidateUseCase.execute(companyEntity);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body(companyEntity);

    }



}
