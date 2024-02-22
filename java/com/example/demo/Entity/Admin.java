package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name="administrador")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Admin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "NomAdmin", length = 25)
    private String NomAdmin;

    @Column(name = "ApeAdmin", length = 25)
    private String ApeAdmin;

    @Column(name = "Correo", length = 30)
    private String Correo;

    @Column(name = "Telefono")
    private Double Telefono;

    @OneToOne
    @JoinColumn(name = "idAdmin")
    private User user;

    @OneToOne
    private ContractEmp contractEmp;

}
