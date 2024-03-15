package com.physiolink.backend.repository.doctor;

import com.physiolink.backend.model.doctor.Doctor;
import com.physiolink.backend.model.paciente.Paciente;

import java.util.List;
import java.util.Optional;

public interface IDoctorRepository {
    Optional<Doctor> getById(int id);
    List<Doctor> getAll();
    boolean post(Doctor doctor);
    boolean put(Doctor doctor);
    boolean delete(int id);
}
