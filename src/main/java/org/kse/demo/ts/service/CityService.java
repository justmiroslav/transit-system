package org.kse.demo.ts.service;

import org.kse.demo.ts.dao.CityDao;
import org.kse.demo.ts.entity.City;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
@ApplicationScoped
public class CityService {
    @Inject
    CityDao dao;
    public City createCity(String name){
        City city = new City(null, name);
        dao.persist(city);
        return city;
    }
}
