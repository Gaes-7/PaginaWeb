package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="certificados")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Certification implements Serializable{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long Id;

    @Column(name = "NumCertificado", length = 10)
    private int NumCertificado;

    @Column(name = "EstadoCertificadp", length = 10)
    private String EstadoCertificadp;

    @OneToMany
    @JoinColumn(name = "idEmpleado")
    private List<Employees> employees;

}
