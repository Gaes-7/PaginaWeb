package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PositionDTO {

    private long id;
    private String NomCargo;

    private EmployeeDTO fk_idEmpleado;
}
