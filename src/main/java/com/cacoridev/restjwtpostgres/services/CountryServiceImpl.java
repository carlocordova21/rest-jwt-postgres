package com.cacoridev.restjwtpostgres.services;

import com.cacoridev.restjwtpostgres.entities.Country;
import com.cacoridev.restjwtpostgres.repositories.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {
    private static final int PAGE_SIZE = 10;
    private final Logger logger = LoggerFactory.getLogger(CountryServiceImpl.class);
    private CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Page<Country> findAll(int page) {
        logger.info("Executing findAll Countries");
        return countryRepository.findAll(PageRequest.of(page-1, PAGE_SIZE));
    }

    @Override
    public Optional<Country> findById(Long id) {
        logger.info("Executing findOneById Country with id " + id);
        return countryRepository.findById(id);
    }

    @Override
    public Country save(Country country) {
        return null;
    }

    @Override
    public Country update(Country country) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
