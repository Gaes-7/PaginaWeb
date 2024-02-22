package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {



    private String NomCliente;
    private String ApeCliente;
    private double Telefono;
    private String Correo;
}
