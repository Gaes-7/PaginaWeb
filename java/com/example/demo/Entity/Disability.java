package com.example.demo.Entity;

import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="incapacidades")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Disability implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "FechaInicio")
    private Date FechaInicio;

    @Column(name = "FechaFin")
    private Date FechaFin;

    @Column(name = "NumIncapacidades", length = 10)
    private int NumIncapacidades;

    @Column(name = "Duracion", length = 10)
    private String Duracion;

    @OneToOne
    @JoinColumn(name = "idEmpleado")
    private Employees employees;

}
