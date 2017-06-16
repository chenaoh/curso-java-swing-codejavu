/*
SQLyog Community Edition- MySQL GUI v7.01 
MySQL - 5.0.51b-community-nt : Database - codejavu
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`codejavu` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `codejavu`;

/*Table structure for table `persona` */

DROP TABLE IF EXISTS `persona`;

CREATE TABLE `persona` (
  `id` int(10) NOT NULL,
  `nombre` varchar(30) default NULL,
  `edad` int(3) default NULL,
  `profesion` varchar(30) default NULL,
  `telefono` decimal(10,0) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `persona` */

insert  into `persona`(`id`,`nombre`,`edad`,`profesion`,`telefono`) values (89,'hhhhh',21,'dfgdfg','5879'),(111,'Cristian David Henao',25,'Ingeniero','5555'),(159,'hhhh',23,'ghgfhg','257'),(222,'Miguel Angel Henao',14,'Estudiante','2562'),(321,'Maria Camila Zapata',22,'Estudiante','258963'),(444,'Ana Milena',20,'Estudiante','5555'),(888,'Julian Alberto Henao H',30,'Estudiante ','36589'),(4321,'blablabla',12,'rererere','5'),(123456,'Cristian David Henao',24,'Ingeniero de Sistemas','5555555'),(1234567,'Ana Maria Escobar',25,'Estudiante','5555'),(12345678,'prueba cristian',23,'Ingeniero','1234'),(123456789,'gtetfg',5,'dfgdf','877878');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
