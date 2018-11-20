package com.zetcode.service;

import com.zetcode.bean.Country;
import java.util.ArrayList;
import java.util.List;

public interface ICountryService {
    
    public ArrayList<Country> findAll();
    public ArrayList<Country> findByContinent(String continent);
    public ArrayList<Country> findByCountry(String country);
}