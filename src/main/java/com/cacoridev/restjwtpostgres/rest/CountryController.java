package com.cacoridev.restjwtpostgres.rest;

import com.cacoridev.restjwtpostgres.entities.Country;
import com.cacoridev.restjwtpostgres.services.CountryService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/countries")
public class CountryController {
    private CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public Page<Country> findAll(@RequestParam(defaultValue = "0") int page){
        return countryService.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> findOneById(@PathVariable Long id){
        Optional<Country> optCountry = countryService.findById(id);
        if(optCountry.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(optCountry.get());
    }
}
