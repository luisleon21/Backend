package com.physiolink.backend.model.prueba;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "prueba")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Prueba {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;
}