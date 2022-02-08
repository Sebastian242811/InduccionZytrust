/*
 * @(#)Cliente.java
 *
 * Copyright 2019 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package com.ZYTRUST.Induccion.modelos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Esta clase representa a un cliente y debe ser usada como una
 * para almacenar y mostrar datos a los repositorios y la base de datos
 *
 * @author Sebastian Hernandez
 * @version 1, 07/02/2022
 */
@Table(name = "FAC_CLIENTES")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    /**Identificador de cliente*/
    @Id
    @Column(name = "CLI_ID")
    private String id;

    /**Nombre de cliente*/
    @Column(name = "CLI_NOMBRE")
    private String nombre;

    /**RUC de cliente*/
    @Column(name = "CLI_RUC")
    private String RUC;

    /**Direccion de cliente*/
    @Column(name = "CLI_DIRECCION")
    private String direccion;

}
