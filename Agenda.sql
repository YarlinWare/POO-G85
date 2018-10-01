-- MySQL dump 10.13  Distrib 5.7.21, for Linux (x86_64)
--
-- Host: localhost    Database: agenda
-- ------------------------------------------------------
-- Server version	5.7.21-1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `contactos`
--

DROP TABLE IF EXISTS `contactos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contactos` (
  `con_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'identificador del contacto',
  `con_nombre` varchar(30) NOT NULL COMMENT 'nombre del contacto',
  `con_apellido` varchar(30) NOT NULL COMMENT 'apellido del contacto',
  `con_telefono_domicilio` varchar(15) NOT NULL COMMENT 'telefono de la casa',
  `con_telefono_oficina` varchar(15) NOT NULL COMMENT 'telefono trabajo',
  `con_celular` varchar(20) NOT NULL COMMENT 'celular personal',
  `con_correo` varchar(150) NOT NULL COMMENT 'email personal',
  `con_direccion_residencia` varchar(150) NOT NULL COMMENT 'direccion de residencia',
  `con_direccion_trabajo` varchar(150) NOT NULL COMMENT 'direccion de trabajo',
  PRIMARY KEY (`con_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1 COMMENT='tabla con los nombres de conocidos';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contactos`
--

LOCK TABLES `contactos` WRITE;
/*!40000 ALTER TABLE `contactos` DISABLE KEYS */;
INSERT INTO `contactos` VALUES (2,'Nicolas','Gutierrez Morales','4974320','3106010259','3106010259','ndgutierrez@correo.udistrital.edu.co','Cra. 7 #40b-53','Cra. 7 #40b-53'),(3,'Jose ','Diaz Aguilar','4610710','3143364257','3143364257','nikolazbotwz@hotmail.com','Cra. 7 #40b-53','Cra. 7 #40b-53'),(4,'Cristhian M','Yara Pardo','5701252','3204231096','3204231096','cmyarap@correo.udsitrital.edu.co','Cra. 7 #40b-53','Cra. 7 #40b-53'),(5,'Juan Felipe','Herrera Poveda','8285065','3188419339','3188419339','jfherrerap@correo.udistrital.edu.co','Cra. 7 #40b-53','Cra. 7 #40b-53'),(6,'Fabian Enrqiue','Leon','4516130','3207619016','3207619016','feleonj@correo.udistrital.edu.co','Cra. 7 #40b-53','Cra. 7 #40b-53'),(7,'Esteban ','Norato Triana','2517624','3193398040','3193398040','jenoratot@correo.udistrital.edu.co','Cra. 7 #40b-53','Cra. 7 #40b-53'),(8,'Ivan Santiago','Chauta Gaviria','3528102','3506632164','3506632164','santiagochauta@gmail.com','Cra. 7 #40b-53','Cra. 7 #40b-53'),(9,'Kevin Santiago','García Cuellar','2287315','3103048275','3103048275','kevingarciacuellar94@gmail.com','Cra. 7 #40b-53','Cra. 7 #40b-53'),(10,'Kevin ','Forero Gualtero','4178898','3204178898','3204178898','kevinandresforero@hotmail.com','Cra. 7 #40b-53','Cra. 7 #40b-53'),(11,'Alex ','Rodríguez','7156701','3138040692','3138040692','alexh.2401@hotmail.com','Cra. 7 #40b-53','Cra. 7 #40b-53'),(12,'Vivian','Peña Hurtado','7417353','3114612307','3114612307','pavipehu1@gmai.com','Cra. 7 #40b-53','Cra. 7 #40b-53'),(13,'Alejandro','González','7033212','3173881033','3173881033','diegobermu1003@gmail.com','Cra. 7 #40b-53','Cra. 7 #40b-53'),(14,'Nicolás','Valderrama','4022153','3143155135','3143155135','expectopatrom@gmail.com','Cra. 7 #40b-53','Cra. 7 #40b-53'),(15,'Camilo Andrés','Caiman','4610589','3005931246','3005931246','caimanco8@gmail.com','Cra. 7 #40b-53','Cra. 7 #40b-53'),(16,'Keivn Duvan','Bernal Ortiz','7782636','3132248033','3132248033','kevinduvanbernalortiz@gmail.com','Cra. 7 #40b-53','Cra. 7 #40b-53'),(17,'Julian','Olaya Torres','4381237','3202882648','3202882648','julianfelipeolxd@outlook.es','Cra. 7 #40b-53','Cra. 7 #40b-53'),(18,'Manuel ','Bojacá','2981148','3204333497','3204333497','manuel.bojaca@outlook.com','Cra. 7 #40b-53','Cra. 7 #40b-53');
/*!40000 ALTER TABLE `contactos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-09-30 19:37:45
