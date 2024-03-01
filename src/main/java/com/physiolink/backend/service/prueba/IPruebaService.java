package com.physiolink.backend.service.prueba;

//import com.physiolink.backend.dto.prueba.PruebaGetDto;

import com.physiolink.backend.model.prueba.Prueba;

import java.util.List;
import java.util.Optional;

public interface IPruebaService {

    Optional<Prueba> getById(int id);
    List<Prueba> getAll();
    boolean post(Prueba prueba);
    boolean put(Prueba prueba);
    boolean delete(int id);
}
