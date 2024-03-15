package com.physiolink.backend.repository.eps;

import com.physiolink.backend.model.eps.Eps;
import com.physiolink.backend.model.paciente.Paciente;
import com.physiolink.backend.repository.paciente.PacienteJpaSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EpsRepository implements IEpsRepository{

    @Autowired
    EpsJpaSpring jpa;

    @Override
    public Optional<Eps> getById(int id) {
        return jpa.findById(id);
    }

    @Override
    public List<Eps> getAll() {
        return jpa.findAll();
    }

    @Override
    public boolean post(Eps eps) {
        jpa.save(eps);
        return true;
    }

    @Override
    public boolean put(Eps eps) {
        jpa.save(eps);
        return true;
    }

    @Override
    public boolean delete(int id) {
        jpa.deleteById(id);
        return true;
    }

}
