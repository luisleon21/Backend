package com.physiolink.backend.service.prueba;

//import com.physiolink.backend.dto.prueba.PruebaGetDto;
//import com.physiolink.backend.mapper.PruebaMapper;
import com.physiolink.backend.model.prueba.Prueba;
import com.physiolink.backend.repository.prueba.IPruebaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PruebaService implements IPruebaService{

    @Autowired
    IPruebaRepository repository;
    @Override
    public Optional<Prueba> getById(int id) {
        return repository.getById(id);
    }

    @Override
    public List<Prueba> getAll() {
        return repository.getAll();
    }

    @Override
    public boolean post(Prueba prueba) {
        return repository.post(prueba);
    }

    @Override
    public boolean put(Prueba prueba) {
        return repository.put(prueba);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id);
    }

}
