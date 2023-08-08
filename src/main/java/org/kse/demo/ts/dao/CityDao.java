package org.kse.demo.ts.dao;

import org.kse.demo.ts.entity.City;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class CityDao {
    @Inject
    EntityManager entityManager;

    public void persist(City city){
        entityManager.persist(city);
    }
}
