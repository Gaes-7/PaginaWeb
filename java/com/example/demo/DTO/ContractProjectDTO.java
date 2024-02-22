package com.example.demo.DTO;

import com.example.demo.Entity.Costumer;
import com.example.demo.Entity.GerentRH;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ContractProjectDTO {


    private Date FechaInicio;
    private Date FechaFin;
    private Double valor;
    private String Clausula;
    private AdministratorDTO fk_idAdmin;
    private GerentRH fk_idRecHum;
    private EmployeeDTO fk_idEmpleado;
    private CityDTO fk_idCiudad;
    private ProjectTypeDTO fk_idTipoProyecto;
    private Costumer fk_idCliente;
}
