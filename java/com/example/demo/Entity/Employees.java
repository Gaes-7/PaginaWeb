package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="empleado")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employees implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "NomEmpleado", length = 25)
    private String NomEmpleado;

    @Column(name = "ApeEmpleado", length = 25)
    private String ApeEmpleado;

    @Column(name = "Telefono")
    private Double Telefono;

    @Column(name = "Edad", length = 5)
    private int Edad;

    @Column(name = "Correo", length = 30)
    private String Correo;

    @ManyToMany(mappedBy = "Id")
    private List<Position> positions;

    @ManyToOne
    private Certification certifications;

    @OneToOne
    private ContractEmp contractEmp;

}