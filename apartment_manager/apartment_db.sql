-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: apartment_db
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `accounts`
--

DROP TABLE IF EXISTS `accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `accounts` (
  `id` int NOT NULL,
  `username` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `active` bit(1) DEFAULT NULL,
  `role` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `avatar` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accounts`
--

LOCK TABLES `accounts` WRITE;
/*!40000 ALTER TABLE `accounts` DISABLE KEYS */;
INSERT INTO `accounts` VALUES (1,'user1','password1',_binary '','user','avatar1.jpg'),(2,'user2','password2',_binary '','user','avatar2.jpg'),(3,'admin','adminpass',_binary '','admin',NULL),(4,'user4','password4',_binary '','admin','avatar4.jpg'),(5,'user5','password5',_binary '','staff','avatar5.jpg'),(6,'user6','password6',_binary '','staff','avatar6.jpg'),(7,'user7','password7',_binary '','admin','avatar7.jpg'),(8,'user8','password8',_binary '','staff','avatar8.jpg'),(9,'user9','password9',_binary '','staff','avatar9.jpg'),(10,'user10','password10',_binary '','admin','avatar10.jpg'),(11,'user11','password11',_binary '','staff','avatar11.jpg');
/*!40000 ALTER TABLE `accounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `id` int NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `address` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `phone_number` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `gender` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `status` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `room_id` int NOT NULL,
  `merchandise_cabinet_id` int NOT NULL,
  `accounts_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`),
  KEY `fk_customer_room` (`room_id`),
  KEY `fk_customer_merchandise_cabinet` (`merchandise_cabinet_id`),
  KEY `fk_customer_accounts` (`accounts_id`),
  CONSTRAINT `fk_customer_accounts` FOREIGN KEY (`accounts_id`) REFERENCES `accounts` (`id`),
  CONSTRAINT `fk_customer_merchandise_cabinet` FOREIGN KEY (`merchandise_cabinet_id`) REFERENCES `merchandise_cabinet` (`id`),
  CONSTRAINT `fk_customer_room` FOREIGN KEY (`room_id`) REFERENCES `room` (`id`),
  CONSTRAINT `customer_chk_1` CHECK ((`gender` in (_utf8mb4'male',_utf8mb4'female',_utf8mb4'other'))),
  CONSTRAINT `customer_chk_2` CHECK ((`status` in (_utf8mb4'active',_utf8mb4'inactive')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'Duy Đông','123 Main Street','123-456-7890','john@example.com','male','1990-01-01','active',1,1,1),(2,'Hồng Sin','456 Elm Street','456-789-1234','jane@example.com','female','1995-05-05','active',2,2,2),(4,'Customer 4','123 Street, City','123456789','customer4@example.com','male','1990-01-01','active',1,1,4),(5,'Customer 5','456 Street, Town','987654321','customer5@example.com','female','1985-05-05','active',2,2,5),(6,'Customer 6','789 Street, Village','555555555','customer6@example.com','other','2000-10-10','inactive',3,3,6),(7,'Customer 7','123 Street, City','123456789','customer7@example.com','male','1990-01-01','active',1,1,7),(8,'Customer 8','456 Street, Town','987654321','customer8@example.com','female','1985-05-05','active',2,2,8),(9,'Customer 9','789 Street, Village','555555555','customer9@example.com','other','2000-10-10','inactive',3,3,9),(10,'Customer 10','123 Street, City','123456789','customer10@example.com','male','1990-01-01','active',1,1,10),(11,'Customer 11','456 Street, Town','987654321','customer11@example.com','female','1985-05-05','active',2,2,11);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detail_receipt`
--

DROP TABLE IF EXISTS `detail_receipt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detail_receipt` (
  `cost` decimal(10,2) NOT NULL,
  `receipt_id` int NOT NULL,
  `service_id` int NOT NULL,
  PRIMARY KEY (`receipt_id`,`service_id`),
  KEY `fk_detail_receipt_service` (`service_id`),
  CONSTRAINT `fk_detail_receipt_receipt` FOREIGN KEY (`receipt_id`) REFERENCES `receipt` (`id`),
  CONSTRAINT `fk_detail_receipt_service` FOREIGN KEY (`service_id`) REFERENCES `service` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detail_receipt`
--

LOCK TABLES `detail_receipt` WRITE;
/*!40000 ALTER TABLE `detail_receipt` DISABLE KEYS */;
INSERT INTO `detail_receipt` VALUES (50.00,1,1),(20.00,1,2),(60.00,4,1),(30.00,5,2),(20.00,6,3),(50.00,7,1),(30.00,8,2),(20.00,9,3),(40.00,10,1),(25.00,11,2);
/*!40000 ALTER TABLE `detail_receipt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedback` (
  `id` int NOT NULL,
  `title` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `content` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `customer_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_feedback_customer` (`customer_id`),
  CONSTRAINT `fk_feedback_customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
INSERT INTO `feedback` VALUES (1,'Phản hồi về sản phẩm','Sản phẩm rất tuyệt vời, tôi thực sự hài lòng với chất lượng và dịch vụ khách hàng.',NULL),(2,'Góp ý về website','Tôi nghĩ rằng trang web của bạn cần một số cải tiến về giao diện để trở nên thân thiện hơn với người dùng.',NULL),(3,'Yêu cầu hỗ trợ','Tôi gặp sự cố khi sử dụng sản phẩm của bạn và cần sự hỗ trợ từ đội ngũ kỹ thuật.',NULL),(4,'Feedback 4','Content of feedback 4',4),(5,'Feedback 5','Content of feedback 5',5),(6,'Feedback 6','Content of feedback 6',6),(7,'Feedback 7','Content of feedback 7',7),(8,'Feedback 8','Content of feedback 8',8),(9,'Feedback 9','Content of feedback 9',9),(10,'Feedback 10','Content of feedback 10',10),(11,'Feedback 11','Content of feedback 11',11);
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `merchandise_cabinet`
--

DROP TABLE IF EXISTS `merchandise_cabinet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `merchandise_cabinet` (
  `id` int NOT NULL,
  `code` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `code` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `merchandise_cabinet`
--

LOCK TABLES `merchandise_cabinet` WRITE;
/*!40000 ALTER TABLE `merchandise_cabinet` DISABLE KEYS */;
INSERT INTO `merchandise_cabinet` VALUES (1,'A01'),(2,'A03'),(3,'A04');
/*!40000 ALTER TABLE `merchandise_cabinet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `merchandise_cabinet_detail`
--

DROP TABLE IF EXISTS `merchandise_cabinet_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `merchandise_cabinet_detail` (
  `id` int NOT NULL,
  `status` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `time` datetime NOT NULL,
  `name` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `customer_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_detail_customer` (`customer_id`),
  CONSTRAINT `fk_detail_customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`),
  CONSTRAINT `merchandise_cabinet_detail_chk_1` CHECK ((`status` in (_utf8mb4'active',_utf8mb4'inactive')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `merchandise_cabinet_detail`
--

LOCK TABLES `merchandise_cabinet_detail` WRITE;
/*!40000 ALTER TABLE `merchandise_cabinet_detail` DISABLE KEYS */;
INSERT INTO `merchandise_cabinet_detail` VALUES (1,'active','2024-04-13 09:00:00','Product A',1),(2,'inactive','2024-04-12 15:30:00','Product B',2),(4,'active','2024-04-01 10:00:00','Item 4',4),(5,'inactive','2024-04-02 11:00:00','Item 5',5),(6,'active','2024-04-03 12:00:00','Item 6',6),(7,'active','2024-04-01 10:00:00','Item 7',7),(8,'inactive','2024-04-02 11:00:00','Item 8',8),(9,'active','2024-04-03 12:00:00','Item 9',9),(10,'active','2024-04-01 10:00:00','Item 10',10),(11,'inactive','2024-04-02 11:00:00','Item 11',11);
/*!40000 ALTER TABLE `merchandise_cabinet_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receipt`
--

DROP TABLE IF EXISTS `receipt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `receipt` (
  `id` int NOT NULL,
  `date_create` date NOT NULL,
  `cost_room` decimal(10,2) NOT NULL,
  `customer_id` int NOT NULL,
  `room_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_receipt_customer` (`customer_id`),
  KEY `fk_receipt_room` (`room_id`),
  CONSTRAINT `fk_receipt_customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`),
  CONSTRAINT `fk_receipt_room` FOREIGN KEY (`room_id`) REFERENCES `room` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receipt`
--

LOCK TABLES `receipt` WRITE;
/*!40000 ALTER TABLE `receipt` DISABLE KEYS */;
INSERT INTO `receipt` VALUES (1,'2024-04-13',100.00,1,1),(2,'2024-04-12',120.50,2,2),(4,'2024-04-01',100.00,4,1),(5,'2024-04-02',80.00,5,2),(6,'2024-04-03',120.00,6,3),(7,'2024-04-01',100.00,7,1),(8,'2024-04-02',80.00,8,2),(9,'2024-04-03',120.00,9,3),(10,'2024-04-01',100.00,10,1),(11,'2024-04-02',80.00,11,2);
/*!40000 ALTER TABLE `receipt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `relative_park_card`
--

DROP TABLE IF EXISTS `relative_park_card`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `relative_park_card` (
  `id` int NOT NULL,
  `date_create` date NOT NULL,
  `expiry` date NOT NULL,
  `active` bit(1) DEFAULT NULL,
  `customer_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_relative_park_card_customer` (`customer_id`),
  CONSTRAINT `fk_relative_park_card_customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `relative_park_card`
--

LOCK TABLES `relative_park_card` WRITE;
/*!40000 ALTER TABLE `relative_park_card` DISABLE KEYS */;
INSERT INTO `relative_park_card` VALUES (1,'2024-04-13','2024-10-13',_binary '',NULL),(2,'2024-03-20','2024-09-20',_binary '',NULL),(3,'2024-02-15','2024-08-15',_binary '\0',NULL),(4,'2024-04-01','2024-05-01',_binary '',4),(5,'2024-04-02','2024-05-02',_binary '',5),(6,'2024-04-03','2024-05-03',_binary '\0',6),(7,'2024-04-01','2024-05-01',_binary '',7),(8,'2024-04-02','2024-05-02',_binary '',8),(9,'2024-04-03','2024-05-03',_binary '\0',9),(10,'2024-04-01','2024-05-01',_binary '',10),(11,'2024-04-02','2024-05-02',_binary '',11);
/*!40000 ALTER TABLE `relative_park_card` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room` (
  `id` int NOT NULL,
  `code` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `status` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `cost` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `code` (`code`),
  CONSTRAINT `room_chk_1` CHECK ((`status` in (_utf8mb4'active',_utf8mb4'inactive')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (1,'R001','active',100.00),(2,'R002','inactive',120.50),(3,'R003','active',0.00),(4,'R004','active',100.00),(5,'R005','active',80.00),(6,'R006','inactive',120.00),(7,'R007','active',100.00),(8,'R008','active',80.00),(9,'R009','inactive',120.00),(10,'R010','active',100.00),(11,'R011','active',80.00);
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service`
--

DROP TABLE IF EXISTS `service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service` (
  `id` int NOT NULL,
  `name` varchar(59) COLLATE utf8mb4_unicode_ci NOT NULL,
  `cost` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service`
--

LOCK TABLES `service` WRITE;
/*!40000 ALTER TABLE `service` DISABLE KEYS */;
INSERT INTO `service` VALUES (1,'Giữ xe',5000.00),(2,'Dịch vụ an ninh',70000.00),(3,'Wifi',500000.00);
/*!40000 ALTER TABLE `service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `survey_form`
--

DROP TABLE IF EXISTS `survey_form`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `survey_form` (
  `id` int NOT NULL,
  `link` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `is_survey` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `link` (`link`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `survey_form`
--

LOCK TABLES `survey_form` WRITE;
/*!40000 ALTER TABLE `survey_form` DISABLE KEYS */;
INSERT INTO `survey_form` VALUES (1,'https://example.com/survey1',_binary ''),(2,'https://example.com/survey2',_binary ''),(3,'https://example.com/survey3',_binary '\0'),(4,'survey_link_4',_binary ''),(5,'survey_link_5',_binary ''),(6,'survey_link_6',_binary '\0'),(7,'survey_link_7',_binary ''),(8,'survey_link_8',_binary ''),(9,'survey_link_9',_binary '\0'),(10,'survey_link_10',_binary ''),(11,'survey_link_11',_binary '');
/*!40000 ALTER TABLE `survey_form` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `use_service`
--

DROP TABLE IF EXISTS `use_service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `use_service` (
  `date` date NOT NULL,
  `customer_id` int NOT NULL,
  `service_id` int NOT NULL,
  PRIMARY KEY (`service_id`,`customer_id`),
  KEY `fk_use_service_customer` (`customer_id`),
  CONSTRAINT `fk_use_service_customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`),
  CONSTRAINT `fk_use_service_service` FOREIGN KEY (`service_id`) REFERENCES `service` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `use_service`
--

LOCK TABLES `use_service` WRITE;
/*!40000 ALTER TABLE `use_service` DISABLE KEYS */;
INSERT INTO `use_service` VALUES ('2024-04-13',1,1),('2024-04-01',4,1),('2024-04-01',7,1),('2024-04-01',10,1),('2024-04-12',2,2),('2024-04-02',5,2),('2024-04-02',8,2),('2024-04-02',11,2),('2024-04-03',6,3),('2024-04-03',9,3);
/*!40000 ALTER TABLE `use_service` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-14 16:51:02
