package com.physiolink.backend.repository.usuario;

import com.physiolink.backend.model.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioJpaSpring extends JpaRepository<Usuario, Integer> {
}
