package com.example.demo.DTO;

import com.example.demo.Entity.GerentRH;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {



    private long id;
    private String Contrasena;
    private EmployeeDTO fk_idEmpleado;
    private AdministratorDTO fk_idAdmin;
    private CustomerDTO fk_idCliente;
    private GerentRH fk_idRecHum;

}
