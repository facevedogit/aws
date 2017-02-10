CREATE DATABASE  IF NOT EXISTS `seguromedico` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `seguromedico`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: seguromedico
-- ------------------------------------------------------
-- Server version	5.6.20-log

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
-- Table structure for table `seguromedico`
--

DROP TABLE IF EXISTS `seguromedico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `seguromedico` (
  `idSeguroMedico` int(11) NOT NULL AUTO_INCREMENT,
  `rif` varchar(10) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `sexo` varchar(1) DEFAULT NULL,
  `casado` tinyint(4) DEFAULT NULL,
  `numhijos` int(11) DEFAULT NULL,
  `embarazada` tinyint(4) DEFAULT NULL,
  `coberturaoftalmologica` tinyint(4) DEFAULT NULL,
  `coberturadental` tinyint(4) DEFAULT NULL,
  `coberturafecundacioninvitro` tinyint(4) DEFAULT NULL,
  `enfermedadcorazon` tinyint(4) DEFAULT NULL,
  `enfermedadestomacal` tinyint(4) DEFAULT NULL,
  `enfermedadrinyones` tinyint(4) DEFAULT NULL,
  `enfermedadalergia` tinyint(4) DEFAULT NULL,
  `nombrealergia` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idSeguroMedico`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seguromedico`
--

LOCK TABLES `seguromedico` WRITE;
/*!40000 ALTER TABLE `seguromedico` DISABLE KEYS */;
INSERT INTO `seguromedico` VALUES (1,'12345678Z','Carlos','Cano',41,'H',1,4,0,1,0,0,1,0,0,1,'Acaros'),(2,'34783627Z','Catalina','López',33,'M',1,1,1,0,0,0,0,0,0,0,''),(3,'29069345J','Jose','Aguado',56,'H',1,3,0,1,1,0,1,1,1,0,''),(4,'34828938S','Angel','Navarro',21,'H',0,0,0,1,1,0,1,1,1,1,'Graminias'),(5,'23236773B','Teresa','Rubio',36,'M',0,0,1,0,0,1,0,0,0,0,''),(6,'27469252F','Alfredo','Padilla',45,'H',1,2,0,1,1,0,1,0,0,0,''),(7,'34804406R','Rosa','Muñoz',45,'M',1,3,0,0,0,0,0,0,0,0,''),(8,'23244114S','Alejandro','Valeno',19,'H',0,0,0,1,0,0,0,0,0,1,'Leche'),(9,'32343434S','Eduardo','Gana',33,'H',1,2,0,1,0,0,0,0,0,1,'123'),(10,'123456789','Juan','Gallardo',37,'H',1,1,1,1,1,0,0,0,0,1,'aja'),(11,'1234567856','Eduardo Hernandez','sanchez',18,'H',1,5,1,0,0,0,0,0,0,0,'');
/*!40000 ALTER TABLE `seguromedico` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-02-10 16:55:20
