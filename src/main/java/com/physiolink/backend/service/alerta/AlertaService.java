package com.physiolink.backend.service.alerta;

import com.physiolink.backend.model.alerta.Alerta;
import com.physiolink.backend.model.paciente.Paciente;
import com.physiolink.backend.repository.alerta.IAlertaRepository;
import com.physiolink.backend.repository.paciente.IPacienteRepository;
import com.physiolink.backend.service.paciente.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlertaService implements IAlertaService {
    @Autowired
    IAlertaRepository repository;

    @Override
    public Optional<Alerta> getById(int id) {
        return repository.getById(id);
    }

    @Override
    public List<Alerta> getAll() {
        return repository.getAll();
    }

    @Override
    public boolean post(Alerta alerta) {
        return repository.post(alerta);
    }

    @Override
    public boolean put(Alerta alerta) {
        return repository.put(alerta);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id);
    }

}
