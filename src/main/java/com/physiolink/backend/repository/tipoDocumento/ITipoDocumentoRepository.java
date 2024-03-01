package com.physiolink.backend.repository.tipoDocumento;

import com.physiolink.backend.model.tipoDocumento.TipoDocumento;

import java.util.List;
import java.util.Optional;

public interface ITipoDocumentoRepository {
    Optional<TipoDocumento> getById(int id);
    List<TipoDocumento> getAll();
    boolean post(TipoDocumento tipoDocumento);
    boolean put(TipoDocumento tipoDocumento);
    boolean delete(int id);
}
