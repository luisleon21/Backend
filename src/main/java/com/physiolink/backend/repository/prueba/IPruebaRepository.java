package com.physiolink.backend.repository.prueba;

import com.physiolink.backend.model.prueba.Prueba;
import com.physiolink.backend.repository.abstracRespository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IPruebaRepository{
    Optional<Prueba> getById(int id);
    List<Prueba> getAll();
    boolean post(Prueba prueba);
    boolean put(Prueba prueba);
    boolean delete(int id);
}
