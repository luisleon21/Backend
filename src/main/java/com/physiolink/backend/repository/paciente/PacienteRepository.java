package com.physiolink.backend.repository.paciente;

import com.physiolink.backend.model.paciente.Paciente;
import com.physiolink.backend.model.tipoDocumento.TipoDocumento;
import com.physiolink.backend.repository.tipoDocumento.TipoDocumentoJpaSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PacienteRepository implements IPacienteRepository{

    @Autowired
    PacienteJpaSpring jpa;

    @Override
    public Optional<Paciente> getById(int id) {
        return jpa.findById(id);
    }

    @Override
    public List<Paciente> getAll() {
        return jpa.findAll();
    }

    @Override
    public boolean post(Paciente paciente) {
        jpa.save(paciente);
        return true;
    }

    @Override
    public boolean put(Paciente paciente) {
        jpa.save(paciente);
        return true;
    }

    @Override
    public boolean delete(int id) {
        jpa.deleteById(id);
        return true;
    }
}
