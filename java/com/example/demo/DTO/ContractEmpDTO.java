package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ContractEmpDTO {



    private String TipoContrato;
    private Date FechaInicio;
    private Date FechaFin;
    private Double Salario;
    private String Banco;
    private String TipoDeCuenta;
    private EmployeeDTO fk_idEmpleado;
    private AdministratorDTO fk_idAdmin;
    private long fk_idRecHum;
}
