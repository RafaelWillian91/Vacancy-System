package br.com.RafaelWillianSystemVagas.SystemVagas.modules.company.useCases;

import br.com.RafaelWillianSystemVagas.SystemVagas.exceptions.ErrorExist;
import br.com.RafaelWillianSystemVagas.SystemVagas.modules.company.repositories.CompanyRepository;
import br.com.RafaelWillianSystemVagas.SystemVagas.modules.company.entities.CompanyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCompanyUseCase {

    @Autowired
    CompanyRepository companyRepository;

    public void execute(CompanyEntity companyEntity){

        this.companyRepository.findByUserNameOrEmail(companyEntity.getUserName(), companyEntity.getEmail())
                        .ifPresent((user) -> {throw new ErrorExist();}
                        );

        companyRepository.save(companyEntity);
    }


}
