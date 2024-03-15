package com.physiolink.backend.repository.doctor;

import com.physiolink.backend.model.doctor.Doctor;
import com.physiolink.backend.model.paciente.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorJpaSpring extends JpaRepository<Doctor, Integer> {
}
