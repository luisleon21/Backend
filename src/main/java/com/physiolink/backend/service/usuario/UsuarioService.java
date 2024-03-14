package com.physiolink.backend.service.usuario;

import com.physiolink.backend.model.usuario.Usuario;
import com.physiolink.backend.repository.usuario.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    IUsuarioRepository repository;

    @Override
    public Optional<Usuario> getById(int id) {
        return repository.getById(id);
    }

    @Override
    public List<Usuario> getAll() {
        return repository.getAll();
    }

    @Override
    public boolean post(Usuario usuario) {
        return repository.post(usuario);
    }

    @Override
    public boolean put(Usuario usuario) {
        return repository.put(usuario);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id);
    }
}
