package com.cacoridev.restjwtpostgres.repositories;

import com.cacoridev.restjwtpostgres.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    //Write the rest of the methods here
}

