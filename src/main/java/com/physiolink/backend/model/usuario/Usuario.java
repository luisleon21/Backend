package com.physiolink.backend.model.usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Usuario {

    @Id
    @Column(name = "id")
    private Integer Id;

    @Column(name = "usuario")
    private Integer Usuario;

    @Column(name = "password")
    private String Password;
}
