package com.physiolink.backend.model.doctor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "doctor")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Doctor {

    @jakarta.persistence.Id
    @Column(name = "id")
    private Integer Id;

    @Column(name = "nombres")
    private String nombre;

    @Column(name = "apellidos")
    private String apellido;

    @Column(name = "licencia")
    private String licencia;

    @Column(name = "correo")
    private String correo;


}
