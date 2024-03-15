package com.physiolink.backend.repository.paciente;

import com.physiolink.backend.model.paciente.Paciente;
import com.physiolink.backend.model.tipoDocumento.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteJpaSpring extends JpaRepository<Paciente, Integer> {
}
