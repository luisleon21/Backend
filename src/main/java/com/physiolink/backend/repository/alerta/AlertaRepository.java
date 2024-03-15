package com.physiolink.backend.repository.alerta;

import com.physiolink.backend.model.alerta.Alerta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AlertaRepository implements IAlertaRepository {


    @Autowired
    AlertaJpaSpring jpa;

    @Override
    public Optional<Alerta> getById(int id) {
        return jpa.findById(id);
    }

    @Override
    public List<Alerta> getAll() {
        return jpa.findAll();
    }

    @Override
    public boolean post(Alerta alerta) {
        jpa.save(alerta);
        return true;
    }

    @Override
    public boolean put(Alerta alerta) {
        jpa.save(alerta);
        return true;
    }

    @Override
    public boolean delete(int id) {
        jpa.deleteById(id);
        return true;
    }
}
