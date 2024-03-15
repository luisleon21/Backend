package com.physiolink.backend.repository.alerta;

import com.physiolink.backend.model.alerta.Alerta;
import com.physiolink.backend.model.eps.Eps;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertaJpaSpring extends JpaRepository<Alerta, Integer> {
}
