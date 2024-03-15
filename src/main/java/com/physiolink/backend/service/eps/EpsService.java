package com.physiolink.backend.service.eps;

import com.physiolink.backend.model.eps.Eps;
import com.physiolink.backend.model.paciente.Paciente;
import com.physiolink.backend.repository.eps.IEpsRepository;
import com.physiolink.backend.repository.paciente.IPacienteRepository;
import com.physiolink.backend.service.paciente.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EpsService implements IEpsService {
    @Autowired
    IEpsRepository repository;

    @Override
    public Optional<Eps> getById(int id) {
        return repository.getById(id);
    }

    @Override
    public List<Eps> getAll() {
        return repository.getAll();
    }

    @Override
    public boolean post(Eps eps) {
        return repository.post(eps);
    }

    @Override
    public boolean put(Eps eps) {
        return repository.put(eps);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id);
    }

}
