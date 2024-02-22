package com.example.demo.Entity;

import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="contratoproyecto")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ContractProyct implements Serializable {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "FechaInicio")
    private Date FechaInicio;

    @Column(name = "FechaFin")
    private Date FechaFin;

    @Column(name = "Valor")
    private Double Valor;

    @Column(name = "Clausula", length = 5)
    private String Clausula;

    @OneToOne
    @JoinColumn (name = "idAdmin")
    private Admin admin;

    @OneToOne
    @JoinColumn (name = "idRecHum")
    private GerentRH gerentRH;

    @OneToMany
    @JoinColumn(name = "idEmpleado")
    private List<Employees> employees;

    @OneToOne
    @JoinColumn(name = "idCliente")
    private Costumer costumer;

    @OneToOne
    @JoinColumn(name = "idCiudad")
    private City city;

    @OneToOne
    @JoinColumn(name = "idTipoProyecto")
    private TypeProyect typeProyect;

}
