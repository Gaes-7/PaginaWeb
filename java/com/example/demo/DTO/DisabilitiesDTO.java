package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DisabilitiesDTO {



    private Date FechaInicio;
    private Date FechaFin;

    private int NumIncapacidades;
    private Date Duracion;
    private EmployeeDTO fk_idEmpleado;
}
