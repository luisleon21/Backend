package com.physiolink.backend.model.tipoDocumento;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tipo_documento")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TipoDocumento {

    @Id
    @Column(name = "id")
    private Integer id;
}
