package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CertificatesDTO {



    private long id;
    private String Contraseña;
    private EmployeeDTO fk_idEmpleado;
}
