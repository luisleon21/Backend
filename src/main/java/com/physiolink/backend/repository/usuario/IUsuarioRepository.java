package com.physiolink.backend.repository.usuario;


import com.physiolink.backend.model.usuario.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioRepository {
    Optional<Usuario> getById(int id);
    List<Usuario> getAll();
    boolean post(Usuario usuario);
    boolean put(Usuario usuario);
    boolean delete(int id);
}
