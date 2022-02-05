package com.ZYTRUST.Induccion.modelos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "FAC_CLIENTES")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @Column(name = "CLI_ID")
    private String id;
    @Column(name = "CLI_NOMBRE")
    private String nombre;
    @Column(name = "CLI_RUC")
    private String RUC;
    @Column(name = "CLI_DIRECCION")
    private String direccion;

}
