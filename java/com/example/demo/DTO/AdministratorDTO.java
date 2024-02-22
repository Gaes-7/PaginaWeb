package com.example.demo.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AdministratorDTO {

    private long id;
    private String NomAdmin;
    private String Telefono;
    private String Correo;
}
