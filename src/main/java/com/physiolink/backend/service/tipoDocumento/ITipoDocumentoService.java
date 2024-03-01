package com.physiolink.backend.service.tipoDocumento;


import com.physiolink.backend.model.tipoDocumento.TipoDocumento;

import java.util.List;
import java.util.Optional;

public interface ITipoDocumentoService {
    Optional<TipoDocumento> getById(int id);
    List<TipoDocumento> getAll();
    boolean post(TipoDocumento tipoDocumento);
    boolean put(TipoDocumento tipoDocumento);
    boolean delete(int id);
}
