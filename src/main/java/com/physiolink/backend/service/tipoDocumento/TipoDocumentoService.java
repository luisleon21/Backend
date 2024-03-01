package com.physiolink.backend.service.tipoDocumento;

import com.physiolink.backend.model.tipoDocumento.TipoDocumento;
import com.physiolink.backend.repository.tipoDocumento.ITipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TipoDocumentoService implements ITipoDocumentoService{

    @Autowired
    ITipoDocumentoRepository repository;

    @Override
    public Optional<TipoDocumento> getById(int id) {
        return repository.getById(id);
    }

    @Override
    public List<TipoDocumento> getAll() {
        return repository.getAll();
    }

    @Override
    public boolean post(TipoDocumento tipoDocumento) {
        return repository.post(tipoDocumento);
    }

    @Override
    public boolean put(TipoDocumento tipoDocumento) {
        return repository.put(tipoDocumento);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id);
    }
}
