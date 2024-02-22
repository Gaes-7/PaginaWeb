package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name="tipoproyecto")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TypeProyect implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "NomProyecto", length = 10)
    private String NomProyecto;

}
