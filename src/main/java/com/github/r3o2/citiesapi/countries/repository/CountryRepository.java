package com.github.r3o2.citiesapi.countries.repository;

import com.github.r3o2.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
