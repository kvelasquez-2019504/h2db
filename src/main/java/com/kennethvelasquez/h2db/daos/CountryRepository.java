package com.kennethvelasquez.h2db.daos;


import com.kennethvelasquez.h2db.models.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Integer> {
}
