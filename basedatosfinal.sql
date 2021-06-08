-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: colegio
-- ------------------------------------------------------
-- Server version	5.7.29-log

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
-- Table structure for table `administrator`
--

DROP TABLE IF EXISTS `administrator`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `administrator` (
  `idadministrator` int(11) NOT NULL AUTO_INCREMENT,
  `userA` varchar(45) NOT NULL,
  `passwordA` varchar(45) NOT NULL,
  `name1A` varchar(45) NOT NULL,
  `name2A` varchar(45) DEFAULT NULL,
  `surname1A` varchar(45) NOT NULL,
  `surname2A` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idadministrator`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrator`
--

LOCK TABLES `administrator` WRITE;
/*!40000 ALTER TABLE `administrator` DISABLE KEYS */;
/*!40000 ALTER TABLE `administrator` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cities`
--

DROP TABLE IF EXISTS `cities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cities` (
  `idCity` int(11) NOT NULL AUTO_INCREMENT,
  `nameC` varchar(50) NOT NULL,
  PRIMARY KEY (`idCity`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cities`
--

LOCK TABLES `cities` WRITE;
/*!40000 ALTER TABLE `cities` DISABLE KEYS */;
INSERT INTO `cities` VALUES (1,'Cali'),(2,'Pasto');
/*!40000 ALTER TABLE `cities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `courses` (
  `courseID` int(11) NOT NULL,
  `nameCo` varchar(45) NOT NULL,
  `classroom` varchar(45) NOT NULL,
  PRIMARY KEY (`courseID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courses`
--

LOCK TABLES `courses` WRITE;
/*!40000 ALTER TABLE `courses` DISABLE KEYS */;
/*!40000 ALTER TABLE `courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enrollments`
--

DROP TABLE IF EXISTS `enrollments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `enrollments` (
  `enrollmentsID` int(11) NOT NULL,
  `dateE` varchar(45) DEFAULT NULL,
  `studyDay` varchar(45) DEFAULT NULL,
  `idStudentfke` int(11) DEFAULT NULL,
  `idCoursesfke` int(11) DEFAULT NULL,
  PRIMARY KEY (`enrollmentsID`),
  KEY `studenten_idx` (`idStudentfke`),
  KEY `course_idx` (`idCoursesfke`),
  CONSTRAINT `course` FOREIGN KEY (`idCoursesfke`) REFERENCES `courses` (`courseID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `studenten` FOREIGN KEY (`idStudentfke`) REFERENCES `students` (`studentID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enrollments`
--

LOCK TABLES `enrollments` WRITE;
/*!40000 ALTER TABLE `enrollments` DISABLE KEYS */;
/*!40000 ALTER TABLE `enrollments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genders`
--

DROP TABLE IF EXISTS `genders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `genders` (
  `idGender` int(11) NOT NULL AUTO_INCREMENT,
  `nameG` varchar(50) NOT NULL,
  PRIMARY KEY (`idGender`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genders`
--

LOCK TABLES `genders` WRITE;
/*!40000 ALTER TABLE `genders` DISABLE KEYS */;
INSERT INTO `genders` VALUES (1,'masculino'),(2,'femenino');
/*!40000 ALTER TABLE `genders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scores`
--

DROP TABLE IF EXISTS `scores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `scores` (
  `scoresID` int(11) NOT NULL,
  `score1` double DEFAULT NULL,
  `score2` double DEFAULT NULL,
  `score3` double DEFAULT NULL,
  `score4` double DEFAULT NULL,
  `modificationDate` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  `idStudent` int(11) DEFAULT NULL,
  `SbCIDfk` int(11) DEFAULT NULL,
  PRIMARY KEY (`scoresID`),
  KEY `studentscore_idx` (`idStudent`),
  KEY `subjectbycurse_idx` (`SbCIDfk`),
  CONSTRAINT `studentscore` FOREIGN KEY (`idStudent`) REFERENCES `students` (`studentID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `subjectbycurse` FOREIGN KEY (`SbCIDfk`) REFERENCES `subject_by_course` (`SbCID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scores`
--

LOCK TABLES `scores` WRITE;
/*!40000 ALTER TABLE `scores` DISABLE KEYS */;
/*!40000 ALTER TABLE `scores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `students` (
  `studentID` int(11) NOT NULL AUTO_INCREMENT,
  `name1S` varchar(50) NOT NULL,
  `name2S` varchar(50) DEFAULT NULL,
  `surname1S` varchar(50) NOT NULL,
  `surname2S` varchar(50) DEFAULT NULL,
  `mobileS` varchar(50) NOT NULL,
  `addressS` varchar(45) NOT NULL,
  `stratumS` varchar(45) NOT NULL,
  `institutionalEmailS` varchar(45) NOT NULL,
  `custodianMobile1` varchar(45) NOT NULL,
  `custodianMobile2` varchar(45) NOT NULL,
  `userS` varchar(45) NOT NULL,
  `passwordS` varchar(45) NOT NULL,
  `idGenderfk` int(11) NOT NULL,
  `idcities` int(11) NOT NULL,
  PRIMARY KEY (`studentID`),
  KEY `gender_idx` (`idGenderfk`),
  KEY `cities_idx` (`idcities`),
  CONSTRAINT `cities` FOREIGN KEY (`idcities`) REFERENCES `cities` (`idCity`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `gender` FOREIGN KEY (`idGenderfk`) REFERENCES `genders` (`idGender`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (5,'Jose',NULL,'Bedoya',NULL,'311','direccion','2','joselo@guau','311','322','joselo','contra',2,1);
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject_by_course`
--

DROP TABLE IF EXISTS `subject_by_course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subject_by_course` (
  `SbCID` int(11) NOT NULL AUTO_INCREMENT,
  `courseIDfk` int(11) DEFAULT NULL,
  `idTeacherfk` int(11) DEFAULT NULL,
  `subjectIDfk` int(11) DEFAULT NULL,
  PRIMARY KEY (`SbCID`),
  KEY `courses_idx` (`courseIDfk`),
  KEY `teachers_idx` (`idTeacherfk`),
  KEY `subjects_idx` (`subjectIDfk`),
  CONSTRAINT `courses` FOREIGN KEY (`courseIDfk`) REFERENCES `courses` (`courseID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `subjects` FOREIGN KEY (`subjectIDfk`) REFERENCES `subjects` (`subjectID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `teachers` FOREIGN KEY (`idTeacherfk`) REFERENCES `teachers` (`teachersID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject_by_course`
--

LOCK TABLES `subject_by_course` WRITE;
/*!40000 ALTER TABLE `subject_by_course` DISABLE KEYS */;
/*!40000 ALTER TABLE `subject_by_course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subjects`
--

DROP TABLE IF EXISTS `subjects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subjects` (
  `subjectID` int(11) NOT NULL,
  `nameSub` varchar(45) DEFAULT NULL,
  `schedule` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`subjectID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subjects`
--

LOCK TABLES `subjects` WRITE;
/*!40000 ALTER TABLE `subjects` DISABLE KEYS */;
/*!40000 ALTER TABLE `subjects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teachers`
--

DROP TABLE IF EXISTS `teachers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teachers` (
  `teachersID` int(11) NOT NULL AUTO_INCREMENT,
  `name1T` varchar(45) NOT NULL,
  `name2T` varchar(45) DEFAULT NULL,
  `surname1T` varchar(45) NOT NULL,
  `surname2T` varchar(45) DEFAULT NULL,
  `mobileT` varchar(45) NOT NULL,
  `addressT` varchar(45) NOT NULL,
  `stratumT` varchar(45) NOT NULL,
  `institutionalEmailT` varchar(45) NOT NULL,
  `businessPositionT` varchar(45) NOT NULL,
  `workDayT` varchar(45) NOT NULL,
  `userT` varchar(45) NOT NULL,
  `passwordT` varchar(45) NOT NULL,
  `idGender` int(11) NOT NULL,
  `idCitiesfk` int(11) NOT NULL,
  PRIMARY KEY (`teachersID`),
  KEY `gender_idx` (`idGender`),
  KEY `city_idx` (`idCitiesfk`),
  CONSTRAINT `citesT` FOREIGN KEY (`idCitiesfk`) REFERENCES `cities` (`idCity`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `genderT` FOREIGN KEY (`idGender`) REFERENCES `genders` (`idGender`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teachers`
--

LOCK TABLES `teachers` WRITE;
/*!40000 ALTER TABLE `teachers` DISABLE KEYS */;
/*!40000 ALTER TABLE `teachers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'colegio'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-08  9:50:18
