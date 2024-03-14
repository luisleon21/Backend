package com.physiolink.backend.repository.usuario;

import com.physiolink.backend.model.usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UsuarioRepository implements IUsuarioRepository{

    @Autowired
    UsuarioJpaSpring jpa;

    @Override
    public Optional<Usuario> getById(int id) {
        return jpa.findById(id);
    }

    @Override
    public List<Usuario> getAll() {
        return jpa.findAll();
    }

    @Override
    public boolean post(Usuario usuario) {
        jpa.save(usuario);
        return true;
    }

    @Override
    public boolean put(Usuario usuario) {
        jpa.save(usuario);
        return true;
    }

    @Override
    public boolean delete(int id) {
        jpa.deleteById(id);
        return true;
    }
}
