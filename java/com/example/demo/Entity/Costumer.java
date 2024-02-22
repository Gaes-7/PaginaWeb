package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name="cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Costumer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "NomCliente", length = 25)
    private String NomCliente;

    @Column(name = "ApeCliente", length = 25)
    private String ApeCliente;

    @Column(name = "Telefono")
    private Double Telefono;

    @Column(name = "Correo", length = 30)
    private String Correo;

    @OneToOne
    @JoinColumn(name = "idCliente")
    private User user;

}
