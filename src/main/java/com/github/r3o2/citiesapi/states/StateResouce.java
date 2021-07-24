package com.github.r3o2.citiesapi.states;


import com.github.r3o2.citiesapi.countries.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/states")
public class StateResouce {

    private final StateRepository repository;

    public StateResouce(StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> states(){
        return repository.findAll();
    }

    @GetMapping("/{name}")
    public ResponseEntity getOne(@PathVariable String name){
        Optional<State> optional = repository.findByName(name);

        if(optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
