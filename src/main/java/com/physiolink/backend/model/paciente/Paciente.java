package com.physiolink.backend.model.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "paciente")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Paciente {

    @jakarta.persistence.Id
    @Column(name = "id")
    private Integer Id;

    @Column(name = "doctor")
    private Integer doctor;

    @Column(name = "eps")
    private Integer eps;

    @Column(name = "tipo_documento")
    private Integer tipoDocumento;

    @Column(name = "numero_documento")
    private Integer numeroDocumento;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "edad")
    private Integer edad;
}
