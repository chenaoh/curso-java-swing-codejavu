CREATE DATABASE IF NOT EXISTS `usuario_bd`;
USE `usuario_bd`;

CREATE TABLE IF NOT EXISTS `usuario` (
`documento` varchar(11) NOT NULL,  
`nombre` varchar(80) NOT NULL,
  `profesion` varchar(200) NOT NULL,
  `edad` int(3) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `telefono` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
