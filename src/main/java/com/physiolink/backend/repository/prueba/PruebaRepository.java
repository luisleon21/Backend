package com.physiolink.backend.repository.prueba;

import com.physiolink.backend.model.prueba.Prueba;
import com.physiolink.backend.repository.abstracRespository.AbstractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PruebaRepository implements IPruebaRepository {

    @Autowired
    PruebaJpaSpring pruebaJpaSpring;

    @Override
    public Optional<Prueba> getById(int id) {
        return pruebaJpaSpring.findById(id);
    }

    @Override
    public List<Prueba> getAll() {
        return pruebaJpaSpring.findAll();
    }

    @Override
    public boolean post(Prueba prueba) {
        pruebaJpaSpring.save(prueba);
        return true;
    }

    @Override
    public boolean put(Prueba prueba) {
        pruebaJpaSpring.save(prueba);
        return true;
    }

    @Override
    public boolean delete(int id) {
        pruebaJpaSpring.deleteById(id);
        return true;
    }

}
