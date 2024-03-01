package com.physiolink.backend.repository.tipoDocumento;

import com.physiolink.backend.model.prueba.Prueba;
import com.physiolink.backend.model.tipoDocumento.TipoDocumento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class TipoDocumentoRepository implements ITipoDocumentoRepository{

    @Autowired
    TipoDocumentoJpaSpring jpa;

    @Override
    public Optional<TipoDocumento> getById(int id) {
        return jpa.findById(id);
    }

    @Override
    public List<TipoDocumento> getAll() {
        return jpa.findAll();
    }

    @Override
    public boolean post(TipoDocumento tipoDocumento) {
        jpa.save(tipoDocumento);
        return true;
    }

    @Override
    public boolean put(TipoDocumento tipoDocumento) {
        jpa.save(tipoDocumento);
        return true;
    }

    @Override
    public boolean delete(int id) {
        jpa.deleteById(id);
        return true;
    }
}
