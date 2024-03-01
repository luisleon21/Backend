package com.physiolink.backend.repository.tipoDocumento;

import com.physiolink.backend.model.tipoDocumento.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDocumentoJpaSpring extends JpaRepository<TipoDocumento, Integer> {
}
