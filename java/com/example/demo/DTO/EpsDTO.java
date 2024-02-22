package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EpsDTO {


    private Date TipoEps;
    private EmployeeDTO fk_idEmpleado;
}

