package com.physiolink.backend.repository.doctor;

import com.physiolink.backend.model.doctor.Doctor;
import com.physiolink.backend.model.paciente.Paciente;
import com.physiolink.backend.repository.paciente.IPacienteRepository;
import com.physiolink.backend.repository.paciente.PacienteJpaSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DoctorRepository implements IDoctorRepository {

    @Autowired
    DoctorJpaSpring jpa;

    @Override
    public Optional<Doctor> getById(int id) {
        return jpa.findById(id);
    }

    @Override
    public List<Doctor> getAll() {
        return jpa.findAll();
    }

    @Override
    public boolean post(Doctor doctor) {
        jpa.save(doctor);
        return true;
    }

    @Override
    public boolean put(Doctor doctor) {
        jpa.save(doctor);
        return true;
    }

    @Override
    public boolean delete(int id) {
        jpa.deleteById(id);
        return true;
    }
}
