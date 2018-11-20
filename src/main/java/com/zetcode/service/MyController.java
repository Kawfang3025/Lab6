package com.zetcode.service;

import com.zetcode.bean.Country;
import com.zetcode.service.ICountryService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private ICountryService countryService;

    @RequestMapping("/countries")
    public List<Country> listCountries() {
        return countryService.findAll();
    }
    @RequestMapping("/continent/{id}")
    public List<Country> findByContinent(@PathVariable("id") String id) {
        return countryService.findByContinent(id);
    }
    @RequestMapping("/country/{id}")
    public List<Country> findByCountry(@PathVariable("id") String id) {
        return countryService.findByCountry(id);
    }
}