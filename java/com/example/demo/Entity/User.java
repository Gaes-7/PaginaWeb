package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


@Entity
@Table(name="usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "Usuario", length = 25)
    private String Usuario;

    @Column(name = "Contraseña", length = 25)
    private String Contrasena;

    @OneToOne
    @JoinColumn(name = "idAdmin")
    private Admin admin;

    @OneToMany(mappedBy = "Id")
    private List<Employees> employees;

    @OneToMany(mappedBy = "Id")
    private List<Costumer> costumers;

    @OneToOne
    @JoinColumn(name = "idRecHum")
    private GerentRH gerentRH;
}
