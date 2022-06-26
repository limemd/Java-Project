-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: hospital
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `diagnostice`
--

DROP TABLE IF EXISTS `diagnostice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diagnostice` (
  `id_diagnostic` int NOT NULL,
  `diagnostic` varchar(45) DEFAULT NULL,
  `descriere` varchar(255) DEFAULT NULL,
  `id_pacient` int DEFAULT NULL,
  PRIMARY KEY (`id_diagnostic`),
  UNIQUE KEY `id_diagnostic_UNIQUE` (`id_diagnostic`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diagnostice`
--

LOCK TABLES `diagnostice` WRITE;
/*!40000 ALTER TABLE `diagnostice` DISABLE KEYS */;
INSERT INTO `diagnostice` VALUES (1,'dehidratare','treb sa bea apa',11),(2,'suprahidratare','bea prea multa apa',11),(3,'Encefalita','Citramon',2),(10,'Aritmie','necesita medicamnte',2);
/*!40000 ALTER TABLE `diagnostice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inregistrare_pacient`
--

DROP TABLE IF EXISTS `inregistrare_pacient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inregistrare_pacient` (
  `Pid` int NOT NULL,
  `pnume` varchar(45) DEFAULT NULL,
  `padresa` varchar(45) DEFAULT NULL,
  `ptelefon` varchar(45) DEFAULT NULL,
  `pvarsta` varchar(45) DEFAULT NULL,
  `psex` varchar(45) DEFAULT NULL,
  `pgrupas` varchar(45) DEFAULT NULL,
  `pboli` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Pid`),
  UNIQUE KEY `Pid_UNIQUE` (`Pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inregistrare_pacient`
--

LOCK TABLES `inregistrare_pacient` WRITE;
/*!40000 ALTER TABLE `inregistrare_pacient` DISABLE KEYS */;
INSERT INTO `inregistrare_pacient` VALUES (1,'modificata','test','test','test','Masculin','test','sanatos'),(2,'Costel','Cahul','029971223','22','Masculin','2+','nerd'),(11,'Neer Emil','Vasile Alecsandri 108','745627782','22','Masculin','1+','Apendicita cronica');
/*!40000 ALTER TABLE `inregistrare_pacient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `ID` int NOT NULL,
  `Nume_utilizator` varchar(45) DEFAULT NULL,
  `Parola` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,'popescu','123'),(2,'marinescu','456');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `programari`
--

DROP TABLE IF EXISTS `programari`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `programari` (
  `id_programare` int NOT NULL,
  `id_pacient` int DEFAULT NULL,
  `data_programare` date DEFAULT NULL,
  `ora_programare` varchar(45) DEFAULT NULL,
  `descriere` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id_programare`),
  UNIQUE KEY `id_programare_UNIQUE` (`id_programare`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `programari`
--

LOCK TABLES `programari` WRITE;
/*!40000 ALTER TABLE `programari` DISABLE KEYS */;
INSERT INTO `programari` VALUES (1,2,'2022-06-30','08:00','consultati'),(2,11,'2022-07-13','10:30','Operatie');
/*!40000 ALTER TABLE `programari` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utilizatori`
--

DROP TABLE IF EXISTS `utilizatori`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `utilizatori` (
  `id` int NOT NULL,
  `Nume_utilizator` varchar(45) DEFAULT NULL,
  `Nume_prenume` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `telefon` varchar(14) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utilizatori`
--

LOCK TABLES `utilizatori` WRITE;
/*!40000 ALTER TABLE `utilizatori` DISABLE KEYS */;
INSERT INTO `utilizatori` VALUES (1,'popescu','Popescu Ion','popescu@yahoo.com','745120693'),(2,'marinescu','Marinescu Maria','maria@gmail.com','742105325'),(3,'ionescu','Ionescu Vasile','vasile@google.com','74120452');
/*!40000 ALTER TABLE `utilizatori` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-14 19:12:32
