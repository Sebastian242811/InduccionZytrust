CREATE TABLE `fac_clientes` (
    `cli_id` varchar(255) NOT NULL,
    `cli_direccion` varchar(255) DEFAULT NULL,
    `cli_nombre` varchar(255) DEFAULT NULL,
    `cli_ruc` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`cli_id`)
) ENGINE=InnoDB;

CREATE TABLE `fac_facturas` (
    `fact_id` varchar(255) NOT NULL,
    `fact_estado` varchar(255) DEFAULT NULL,
    `fact_fecha_emision` date DEFAULT NULL,
    `fact_fecha_vencimiento` date DEFAULT NULL,
    `fact_cli_id` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`fact_id`),
    KEY `FKqb4b0ydi1p882w7ft5tb4e7nq` (`fact_cli_id`),
    CONSTRAINT `FKqb4b0ydi1p882w7ft5tb4e7nq` FOREIGN KEY (`fact_cli_id`) REFERENCES `fac_clientes` (`cli_id`)
) ENGINE=InnoDB;


CREATE TABLE `fac_productos` (
    `prod_id` varchar(255) NOT NULL,
    `prod_descripcion` varchar(255) DEFAULT NULL,
    `prod_nombre` varchar(255) DEFAULT NULL,
    `prod_precio` decimal(19,2) DEFAULT NULL,
    PRIMARY KEY (`prod_id`)
) ENGINE=InnoDB;

CREATE TABLE `fac_detalle_facturas` (
    `defa_fact_id` varchar(255) NOT NULL,
    `defa_prod_id` varchar(255) NOT NULL,
    `defa_cantidad` int DEFAULT NULL,
    PRIMARY KEY (`defa_fact_id`,`defa_prod_id`),
    KEY `FKejwjw8f4u1etqg4axrrt78o4w` (`defa_prod_id`),
    CONSTRAINT `FK9sssq2qtthdrkspu78rt8nxwd` FOREIGN KEY (`defa_fact_id`) REFERENCES `fac_facturas` (`fact_id`),
    CONSTRAINT `FKejwjw8f4u1etqg4axrrt78o4w` FOREIGN KEY (`defa_prod_id`) REFERENCES `fac_productos` (`prod_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci