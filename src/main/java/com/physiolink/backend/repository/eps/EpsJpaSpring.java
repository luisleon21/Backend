package com.physiolink.backend.repository.eps;

import com.physiolink.backend.model.eps.Eps;
import com.physiolink.backend.model.paciente.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpsJpaSpring extends JpaRepository<Eps, Integer> {


}
