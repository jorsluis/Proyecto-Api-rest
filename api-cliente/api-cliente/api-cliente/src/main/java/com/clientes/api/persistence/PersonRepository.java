package com.clientes.api.persistence;

import com.clientes.api.domain.Personn;
import com.clientes.api.domain.repository.PersonnRepository;
import com.clientes.api.persistence.crud.ClienteCrudRepository;
import com.clientes.api.persistence.entity.Person;
import com.clientes.api.persistence.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//Implementa PersonnRepository para definir nuestra API a terminos de dominio
@Repository // se denota con esta anotacion para indicarle a Spring que esta
// es una clase que se encarga de interactuar con nuestra base de datos
public class PersonRepository implements PersonnRepository {

    @Autowired
    private ClienteCrudRepository clienteCrudRepository;

    @Autowired
    private PersonMapper mapper;

    @Override
    public List<Personn> getAll(){
        List<Person> persons = (List<Person>) clienteCrudRepository.findAll();
        return mapper.toPersons(persons);
    }

}
