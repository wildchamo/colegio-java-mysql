-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: escuela
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
-- Table structure for table `cities`
--

DROP TABLE IF EXISTS `cities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cities` (
  `idCity` int(11) NOT NULL AUTO_INCREMENT,
  `nameC` varchar(50) NOT NULL,
  PRIMARY KEY (`idCity`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cities`
--

LOCK TABLES `cities` WRITE;
/*!40000 ALTER TABLE `cities` DISABLE KEYS */;
/*!40000 ALTER TABLE `cities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `courses` (
  `courseID` int(11) NOT NULL AUTO_INCREMENT,
  `nameCourse` varchar(50) NOT NULL,
  `classroom` varchar(50) NOT NULL,
  `imgCourse` longblob,
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
  `enrollmentID` int(11) NOT NULL AUTO_INCREMENT,
  `idStudentfk` int(11) NOT NULL,
  `idCoursefk` int(11) NOT NULL,
  PRIMARY KEY (`enrollmentID`),
  KEY `idStudentfk` (`idStudentfk`),
  KEY `idCoursefk` (`idCoursefk`),
  CONSTRAINT `enrollments_ibfk_1` FOREIGN KEY (`idStudentfk`) REFERENCES `students` (`studentID`),
  CONSTRAINT `enrollments_ibfk_2` FOREIGN KEY (`idCoursefk`) REFERENCES `courses` (`courseID`)
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genders`
--

LOCK TABLES `genders` WRITE;
/*!40000 ALTER TABLE `genders` DISABLE KEYS */;
/*!40000 ALTER TABLE `genders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scores`
--

DROP TABLE IF EXISTS `scores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `scores` (
  `idScore` int(11) NOT NULL AUTO_INCREMENT,
  `score1` float DEFAULT NULL,
  `score2` float DEFAULT NULL,
  `score3` float DEFAULT NULL,
  `scoreF` float DEFAULT NULL,
  `modificationDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idScore`)
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
  `adressS` varchar(50) NOT NULL,
  `stratumS` varchar(50) NOT NULL,
  `institutionalEmailS` varchar(50) NOT NULL,
  `custodianMobile1` varchar(50) NOT NULL,
  `custodianMobile2` varchar(50) NOT NULL,
  `userS` varchar(50) NOT NULL,
  `passwordS` varchar(50) NOT NULL,
  `idGenderfk` int(11) NOT NULL,
  `idcitiesfk` int(11) NOT NULL,
  PRIMARY KEY (`studentID`),
  KEY `idGenderfk` (`idGenderfk`),
  KEY `idcitiesfk` (`idcitiesfk`),
  CONSTRAINT `students_ibfk_1` FOREIGN KEY (`idGenderfk`) REFERENCES `genders` (`idGender`),
  CONSTRAINT `students_ibfk_2` FOREIGN KEY (`idcitiesfk`) REFERENCES `cities` (`idCity`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subject` (
  `subjectID` int(11) NOT NULL AUTO_INCREMENT,
  `nameSub` varchar(50) NOT NULL,
  `schedule` varchar(50) NOT NULL,
  PRIMARY KEY (`subjectID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject_by_course`
--

DROP TABLE IF EXISTS `subject_by_course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subject_by_course` (
  `idsubject_by_courseID` int(11) NOT NULL AUTO_INCREMENT,
  `subjectIDfk` int(11) NOT NULL,
  `courseIDfk` int(11) NOT NULL,
  `teacherIDfk` int(11) NOT NULL,
  PRIMARY KEY (`idsubject_by_courseID`),
  KEY `subjectIDfk_idx` (`subjectIDfk`),
  KEY `courseIDfk_idx` (`courseIDfk`),
  KEY `teacherIDfk_idx` (`teacherIDfk`),
  CONSTRAINT `courseIDfk` FOREIGN KEY (`courseIDfk`) REFERENCES `courses` (`courseID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `subjectIDfk` FOREIGN KEY (`subjectIDfk`) REFERENCES `subject` (`subjectID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `teacherIDfk` FOREIGN KEY (`teacherIDfk`) REFERENCES `teachers` (`teacherID`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
-- Table structure for table `teachers`
--

DROP TABLE IF EXISTS `teachers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teachers` (
  `teacherID` int(11) NOT NULL AUTO_INCREMENT,
  `name1T` varchar(50) NOT NULL,
  `name2T` varchar(50) DEFAULT NULL,
  `surname1T` varchar(50) NOT NULL,
  `surname2T` varchar(50) DEFAULT NULL,
  `mobileT` varchar(50) NOT NULL,
  `adressT` varchar(50) NOT NULL,
  `stratumT` varchar(50) NOT NULL,
  `institutionalEmailT` varchar(50) NOT NULL,
  `businessPositionT` varchar(50) NOT NULL,
  `workDayT` varchar(50) NOT NULL,
  `userT` varchar(50) NOT NULL,
  `passwordT` varchar(50) NOT NULL,
  `IDGenderfk` int(11) NOT NULL,
  `IDcitiesfk` int(11) NOT NULL,
  PRIMARY KEY (`teacherID`),
  KEY `IDGenderfk` (`IDGenderfk`),
  KEY `IDcitiesfk` (`IDcitiesfk`),
  CONSTRAINT `teachers_ibfk_1` FOREIGN KEY (`IDGenderfk`) REFERENCES `genders` (`idGender`),
  CONSTRAINT `teachers_ibfk_2` FOREIGN KEY (`IDcitiesfk`) REFERENCES `cities` (`idCity`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teachers`
--

LOCK TABLES `teachers` WRITE;
/*!40000 ALTER TABLE `teachers` DISABLE KEYS */;
/*!40000 ALTER TABLE `teachers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-26 13:21:58
