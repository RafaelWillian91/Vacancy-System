package br.com.RafaelWillianSystemVagas.SystemVagas.modules.company.controllers;

import br.com.RafaelWillianSystemVagas.SystemVagas.modules.company.entities.CompanyEntity;
import br.com.RafaelWillianSystemVagas.SystemVagas.modules.company.entities.JobEntity;
import br.com.RafaelWillianSystemVagas.SystemVagas.modules.company.useCases.JobUseCases;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/createJob")
public class JobController {

    @Autowired
    private JobUseCases jobUseCases;

    @PostMapping("/")
    public JobEntity createJobs(@Valid @RequestBody JobEntity jobEntity){

        return jobUseCases.execute(jobEntity);
    }

}
