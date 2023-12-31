CREATE DATABASE  IF NOT EXISTS `spring_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `spring_db`;
-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: spring_db
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `transection_table`
--

DROP TABLE IF EXISTS `transection_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transection_table` (
  `t_id` int(11) NOT NULL AUTO_INCREMENT,
  `account_no` int(11) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `date` date DEFAULT NULL,
  `notes` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transection_table`
--

LOCK TABLES `transection_table` WRITE;
/*!40000 ALTER TABLE `transection_table` DISABLE KEYS */;
INSERT INTO `transection_table` VALUES (7,100001,'deposite',5000,'2023-07-27',''),(8,100001,'deposite',3000,'2023-07-27',''),(9,100001,'withdraw',2000,'2023-07-27',''),(10,100002,'withdraw',3000,'2023-07-27','transfer'),(11,100001,'deposite',3000,'2023-07-27','received'),(12,100001,'deposite',500,'2023-08-05',''),(13,100001,'deposite',5000,'2023-08-09',''),(14,100002,'withdraw',3000,'2023-08-09','transfer'),(15,100003,'deposite',3000,'2023-08-09','received'),(16,100001,'withdraw',4000,'2023-08-09',''),(17,100001,'deposite',3000,'2023-08-21',''),(18,100001,'withdraw',2000,'2023-08-21',''),(19,100001,'withdraw',2500,'2023-08-21','transfer'),(20,100002,'deposite',2500,'2023-08-21','received'),(21,100003,'deposite',500,'2023-08-30',''),(22,100003,'deposite',2300,'2023-08-30','received'),(23,100002,'withdraw',2300,'2023-08-30','transfer'),(24,100004,'deposite',400,'2023-08-30',''),(25,100004,'withdraw',2000,'2023-08-30',''),(26,100004,'deposite',3500,'2023-08-30','received'),(27,100003,'withdraw',3500,'2023-08-30','transfer'),(28,100012,'deposite',500,'2023-09-05',''),(29,100012,'withdraw',300,'2023-09-05',''),(30,100001,'deposite',50000,'2023-09-05',''),(31,100001,'deposite',2000,'2023-09-06',''),(32,100001,'withdraw',4000,'2023-09-06',''),(33,100001,'withdraw',3000,'2023-09-06',''),(34,100001,'withdraw',4900,'2023-09-06',''),(35,100001,'deposite',3000,'2023-09-07',''),(36,100001,'deposite',1000,'2023-09-07',''),(37,100001,'deposite',2222,'2023-09-07',''),(38,100012,'deposite',3000,'2023-09-08',''),(39,100012,'withdraw',4000,'2023-09-08',''),(40,100012,'withdraw',2000,'2023-09-08',''),(41,100001,'withdraw',6000,'2023-09-08','transfer'),(42,100012,'deposite',6000,'2023-09-08','received'),(43,100001,'deposite',70000,'2023-09-09',''),(44,100001,'deposite',4000,'2023-09-09',' '),(45,100012,'deposite',1000,'2023-09-09','received'),(46,100001,'withdraw',1000,'2023-09-09','transfer'),(47,100001,'deposite',2000,'2023-09-09',' '),(48,100001,'deposite',3000,'2023-09-09',' ');
/*!40000 ALTER TABLE `transection_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-09 18:17:29
