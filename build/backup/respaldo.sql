-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: curriculumaPDF
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `conocimientodeinformatica`
--

DROP TABLE IF EXISTS `conocimientodeinformatica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `conocimientodeinformatica` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conocimientodeinformatica`
--

LOCK TABLES `conocimientodeinformatica` WRITE;
/*!40000 ALTER TABLE `conocimientodeinformatica` DISABLE KEYS */;
INSERT INTO `conocimientodeinformatica` VALUES (1,'Java'),(2,'Python'),(3,'PHP'),(4,'C'),(5,'C#'),(6,'C++'),(7,'C+'),(8,'C'),(9,'Ruby'),(10,'Kotlin'),(11,'Excel'),(12,'Word'),(13,'Linux');
/*!40000 ALTER TABLE `conocimientodeinformatica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `conocimientoinformatica_curriculum`
--

DROP TABLE IF EXISTS `conocimientoinformatica_curriculum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `conocimientoinformatica_curriculum` (
  `id` int NOT NULL AUTO_INCREMENT,
  `conInformatica` int DEFAULT NULL,
  `curriculumFK` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `conInformatica` (`conInformatica`),
  KEY `curriculumFK` (`curriculumFK`),
  CONSTRAINT `conocimientoinformatica_curriculum_ibfk_1` FOREIGN KEY (`conInformatica`) REFERENCES `conocimientodeinformatica` (`id`),
  CONSTRAINT `conocimientoinformatica_curriculum_ibfk_2` FOREIGN KEY (`curriculumFK`) REFERENCES `curriculum` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conocimientoinformatica_curriculum`
--

LOCK TABLES `conocimientoinformatica_curriculum` WRITE;
/*!40000 ALTER TABLE `conocimientoinformatica_curriculum` DISABLE KEYS */;
INSERT INTO `conocimientoinformatica_curriculum` VALUES (1,1,1),(2,1,1);
/*!40000 ALTER TABLE `conocimientoinformatica_curriculum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curriculum`
--

DROP TABLE IF EXISTS `curriculum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `curriculum` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `rut` varchar(50) DEFAULT NULL,
  `fechaDeNacimiento` date DEFAULT NULL,
  `nacionalidad` varchar(50) DEFAULT NULL,
  `estadoCivil` varchar(50) DEFAULT NULL,
  `esHombre` tinyint(1) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `direccion` varchar(150) DEFAULT NULL,
  `nivelDeEstudio` varchar(50) DEFAULT NULL,
  `ocupacion` varchar(50) DEFAULT NULL,
  `disponibilidad` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `rut` (`rut`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curriculum`
--

LOCK TABLES `curriculum` WRITE;
/*!40000 ALTER TABLE `curriculum` DISABLE KEYS */;
INSERT INTO `curriculum` VALUES (1,'dfgd','fgdfg','0000000000','2020-07-05','Chilena','Soltero',1,'dfg','dsfg','dsfgdsfg','Básica en curso','Desocupado','Vespertina');
/*!40000 ALTER TABLE `curriculum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `experiencia`
--

DROP TABLE IF EXISTS `experiencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `experiencia` (
  `id` int NOT NULL AUTO_INCREMENT,
  `lugar` varchar(50) DEFAULT NULL,
  `cargo` varchar(50) DEFAULT NULL,
  `aniosTrabajando` int DEFAULT NULL,
  `curriculumFK` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `curriculumFK` (`curriculumFK`),
  CONSTRAINT `experiencia_ibfk_1` FOREIGN KEY (`curriculumFK`) REFERENCES `curriculum` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experiencia`
--

LOCK TABLES `experiencia` WRITE;
/*!40000 ALTER TABLE `experiencia` DISABLE KEYS */;
INSERT INTO `experiencia` VALUES (1,'Cargo?','Cargo?',1,1),(2,'Cargo?','Cargo?',1,1);
/*!40000 ALTER TABLE `experiencia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `idioma`
--

DROP TABLE IF EXISTS `idioma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `idioma` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `idioma`
--

LOCK TABLES `idioma` WRITE;
/*!40000 ALTER TABLE `idioma` DISABLE KEYS */;
INSERT INTO `idioma` VALUES (1,'Español'),(2,'Inglés'),(3,'Alemán'),(4,'Portugues'),(5,'Frances'),(6,'Chino'),(7,'Ruso'),(8,'Japones'),(9,'Polaco'),(10,'Árabe'),(11,'Italiano');
/*!40000 ALTER TABLE `idioma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `idioma_curriculum`
--

DROP TABLE IF EXISTS `idioma_curriculum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `idioma_curriculum` (
  `id` int NOT NULL AUTO_INCREMENT,
  `idiomaFK` int DEFAULT NULL,
  `curriculumFK` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idiomaFK` (`idiomaFK`),
  KEY `curriculumFK` (`curriculumFK`),
  CONSTRAINT `idioma_curriculum_ibfk_1` FOREIGN KEY (`idiomaFK`) REFERENCES `idioma` (`id`),
  CONSTRAINT `idioma_curriculum_ibfk_2` FOREIGN KEY (`curriculumFK`) REFERENCES `curriculum` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `idioma_curriculum`
--

LOCK TABLES `idioma_curriculum` WRITE;
/*!40000 ALTER TABLE `idioma_curriculum` DISABLE KEYS */;
INSERT INTO `idioma_curriculum` VALUES (1,1,1),(2,1,1);
/*!40000 ALTER TABLE `idioma_curriculum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `referencia`
--

DROP TABLE IF EXISTS `referencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `referencia` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `cargo` varchar(50) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `curriculumFK` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `curriculumFK` (`curriculumFK`),
  CONSTRAINT `referencia_ibfk_1` FOREIGN KEY (`curriculumFK`) REFERENCES `curriculum` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `referencia`
--

LOCK TABLES `referencia` WRITE;
/*!40000 ALTER TABLE `referencia` DISABLE KEYS */;
INSERT INTO `referencia` VALUES (1,'Nombre?','Apellido?','Cargo?','Teléfono?',1),(2,'Nombre?','Apellido?','Cargo?','Telefono?',1);
/*!40000 ALTER TABLE `referencia` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-05 11:07:39
