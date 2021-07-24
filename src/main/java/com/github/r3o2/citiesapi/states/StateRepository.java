package com.github.r3o2.citiesapi.states;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StateRepository  extends JpaRepository<State, Long> {
    Optional<State> findByName(String name);
}
