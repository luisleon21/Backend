package com.physiolink.backend.model.alerta;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "eps")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Alerta {

    @jakarta.persistence.Id
    @Column(name = "id")
    private Integer Id;

    @Column(name = "paciente")
    private String paciente;

    @Column(name = "doctor")
    private String doctor;

}
