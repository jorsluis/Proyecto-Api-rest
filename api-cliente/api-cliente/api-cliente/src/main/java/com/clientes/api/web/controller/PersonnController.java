package com.clientes.api.web.controller;

import com.clientes.api.domain.Personn;
import com.clientes.api.domain.service.PersonnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/persons")
public class PersonnController {

    @Autowired
    private PersonnService personnService;

    @GetMapping("/all")
    public ResponseEntity<List<Personn>> getAll(){

        return new ResponseEntity<>(personnService.getAll(), HttpStatus.OK);
    }


}
