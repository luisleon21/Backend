package com.physiolink.backend.service.doctor;

import com.physiolink.backend.model.doctor.Doctor;
import com.physiolink.backend.model.paciente.Paciente;
import com.physiolink.backend.repository.doctor.IDoctorRepository;
import com.physiolink.backend.repository.paciente.IPacienteRepository;
import com.physiolink.backend.service.paciente.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService implements IDoctorService {
    @Autowired
    IDoctorRepository repository;

    @Override
    public Optional<Doctor> getById(int id) {
        return repository.getById(id);
    }

    @Override
    public List<Doctor> getAll() {
        return repository.getAll();
    }

    @Override
    public boolean post(Doctor doctor) {
        return repository.post(doctor);
    }

    @Override
    public boolean put(Doctor doctor) {
        return repository.put(doctor);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id);
    }
}
