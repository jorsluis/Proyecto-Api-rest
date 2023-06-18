package com.clientes.api.domain.service;

import com.clientes.api.domain.Personn;
import com.clientes.api.domain.repository.PersonnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PersonnService {

    @Autowired
    private PersonnRepository personnRepository;

    public List<Personn> getAll(){

        return personnRepository.getAll();
    }

}
