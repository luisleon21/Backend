package com.physiolink.backend.model.eps;

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
public class Eps {

    @jakarta.persistence.Id
    @Column(name = "id")
    private Integer Id;

    @Column(name = "nombre")
    private String nombre;
}
