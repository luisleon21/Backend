package com.physiolink.backend.dto.prueba;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class PruebaGetDto implements Serializable {

    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;

}
