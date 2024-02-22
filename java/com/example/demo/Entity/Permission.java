package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name="Permisos")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Permission implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "NumPermiso", length = 10)
    private int NumPermiso;

    @Column(name = "Duracion", length = 10)
    private String Duracion;

    @OneToOne
    @JoinColumn(name = "idEmpleado")
    private Employees employees;

}