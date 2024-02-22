package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name="eps")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Eps implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "TipoEps", length = 20)
    private String TipoEps;

    @OneToOne
    @JoinColumn(name = "idEmpleado")
    private Employees employees;

}