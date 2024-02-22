package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="cargo")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Position implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NomCargo", length = 25)
    private String NomCargo;

    @ManyToMany(mappedBy = "Id")
    private List<Employees> employees;


}
