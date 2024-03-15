package com.physiolink.backend.service.eps;

import com.physiolink.backend.model.eps.Eps;
import com.physiolink.backend.model.paciente.Paciente;

import java.util.List;
import java.util.Optional;

public interface IEpsService {
    Optional<Eps> getById(int id);
    List<Eps> getAll();
    boolean post(Eps eps);
    boolean put(Eps eps);
    boolean delete(int id);
}
