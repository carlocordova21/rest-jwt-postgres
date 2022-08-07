package com.cacoridev.restjwtpostgres.services;

import com.cacoridev.restjwtpostgres.entities.Country;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface CountryService {
    Page<Country> findAll(int page);

    Optional<Country> findById(Long id);

    Country save(Country country);

    Country update(Country country);

    void delete(Long id);
}
