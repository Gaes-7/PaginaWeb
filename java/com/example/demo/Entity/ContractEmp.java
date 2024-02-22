package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="contratoemp")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ContractEmp implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "TipoContrato", length = 25)
    private String TipoContrato;

    @Column(name = "FechaInicio")
    private Date FechaInicio;

    @Column(name = "FechaFin")
    private Date FechaFin;

    @Column(name = "Salario")
    private Double Salario;

    @Column(name = "Banco", length = 15)
    private String Banco;

    @Column(name = "TipoDeCuenta", length = 25)
    private String TipoDeCuenta;

    @OneToOne
    @JoinColumn(name = "idAdmin")
    private Admin admin;

    @OneToMany
    @JoinColumn(name = "idEmpleado")
    private List<Employees> employees;

    @OneToOne
    @JoinColumn(name = "idRecHum")
    private GerentRH gerentRH;


}