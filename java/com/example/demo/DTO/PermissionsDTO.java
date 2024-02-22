package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PermissionsDTO {



    private int NumPermiso;
    private Date Duracion;
    private EmployeeDTO fk_idEmpleado;
}
