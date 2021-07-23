package com.github.r3o2.citiesapi.states;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
