package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name="gerenterh")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class GerentRH implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "NomGerente", length = 25)
    private String NomGerente;

    @Column(name = "ApeGerente", length = 25)
    private String ApeGerente;

    @Column(name = "Telefono")
    private Double Telefono;

    @Column(name = "Correo", length = 30)
    private String Correo;

    @OneToOne
    @JoinColumn(name = "idRecHum")
    private User user;

    @OneToOne
    private ContractEmp contractEmp;
}
