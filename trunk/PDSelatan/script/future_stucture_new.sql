CREATE DATABASE  IF NOT EXISTS `future` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `future`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: future
-- ------------------------------------------------------
-- Server version	5.5.24-log

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
-- Table structure for table `titem_price`
--

DROP TABLE IF EXISTS `titem_price`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `titem_price` (
  `price_name` varchar(255) NOT NULL,
  `price_pl` varchar(255) NOT NULL,
  `price_m` varchar(255) NOT NULL,
  `price_r` varchar(255) NOT NULL,
  `price_d` varchar(255) NOT NULL,
  `price_p` varchar(255) NOT NULL,
  `category_id` int(11) NOT NULL,
  `price_id` int(11) NOT NULL,
  `modifier_id` int(11) NOT NULL,
  PRIMARY KEY (`price_id`,`category_id`),
  UNIQUE KEY `category_id_UNIQUE` (`category_id`),
  UNIQUE KEY `price_id_UNIQUE` (`price_id`),
  KEY `titem_price_idx1` (`price_id`),
  KEY `FK_titem_price` (`modifier_id`),
  CONSTRAINT `FK_titem_price` FOREIGN KEY (`modifier_id`) REFERENCES `users` (`USER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `titem_price`
--

LOCK TABLES `titem_price` WRITE;
/*!40000 ALTER TABLE `titem_price` DISABLE KEYS */;
/*!40000 ALTER TABLE `titem_price` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tsalesman`
--

DROP TABLE IF EXISTS `tsalesman`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tsalesman` (
  `salesman_id` int(11) NOT NULL AUTO_INCREMENT,
  `salesman_name` varchar(255) NOT NULL,
  `modifier_id` int(11) NOT NULL,
  PRIMARY KEY (`salesman_id`),
  KEY `FK_tsalesman` (`modifier_id`),
  CONSTRAINT `FK_tsalesman` FOREIGN KEY (`modifier_id`) REFERENCES `users` (`USER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tsalesman`
--

LOCK TABLES `tsalesman` WRITE;
/*!40000 ALTER TABLE `tsalesman` DISABLE KEYS */;
/*!40000 ALTER TABLE `tsalesman` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tcollect`
--

DROP TABLE IF EXISTS `tcollect`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tcollect` (
  `collect_id` int(11) NOT NULL AUTO_INCREMENT,
  `collect_invoice` varchar(255) NOT NULL,
  `collect_date` date NOT NULL,
  `modifier_id` int(11) NOT NULL,
  PRIMARY KEY (`collect_id`),
  KEY `FK_tcollect1` (`modifier_id`),
  CONSTRAINT `FK_tcollect1` FOREIGN KEY (`modifier_id`) REFERENCES `users` (`USER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tcollect`
--

LOCK TABLES `tcollect` WRITE;
/*!40000 ALTER TABLE `tcollect` DISABLE KEYS */;
/*!40000 ALTER TABLE `tcollect` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tdo`
--

DROP TABLE IF EXISTS `tdo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tdo` (
  `do_id` int(11) NOT NULL AUTO_INCREMENT,
  `do_date` date NOT NULL,
  `do_invoice` varchar(255) NOT NULL,
  `do_status` tinyint(1) NOT NULL,
  `do_flag` double NOT NULL,
  `supplier_id` int(11) NOT NULL,
  `sales_id` int(11) NOT NULL,
  PRIMARY KEY (`do_id`),
  KEY `FK_tdo1` (`supplier_id`),
  KEY `FK_tdo2` (`sales_id`),
  CONSTRAINT `FK_tdo1` FOREIGN KEY (`supplier_id`) REFERENCES `tsupplier` (`supplier_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_tdo2` FOREIGN KEY (`sales_id`) REFERENCES `tsales` (`sales_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tdo`
--

LOCK TABLES `tdo` WRITE;
/*!40000 ALTER TABLE `tdo` DISABLE KEYS */;
/*!40000 ALTER TABLE `tdo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(50) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL,
  `ENABLED` int(1) DEFAULT NULL,
  `CREATED_DATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `CREATED_BY` varchar(50) DEFAULT NULL,
  `EMPLOYEE_NAME` varchar(20) DEFAULT NULL,
  `EMPLOYEE_ADDRESS` varchar(100) DEFAULT NULL,
  `EMPLOYEE_PHONE` varchar(20) DEFAULT NULL,
  `GROUP_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tpurchase_payment`
--

DROP TABLE IF EXISTS `tpurchase_payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tpurchase_payment` (
  `payment_id` int(11) NOT NULL AUTO_INCREMENT,
  `payment_date` date NOT NULL,
  `payment_total` double NOT NULL,
  `bank_id` int(11) NOT NULL,
  `supplier_id` int(11) NOT NULL,
  `modifier_id` int(11) NOT NULL,
  PRIMARY KEY (`payment_id`),
  KEY `FK_tpurchase_payment1` (`bank_id`),
  KEY `FK_tpurchase_payment2` (`supplier_id`),
  KEY `FK_tpurchase_payment3` (`modifier_id`),
  CONSTRAINT `FK_tpurchase_payment1` FOREIGN KEY (`bank_id`) REFERENCES `tbank` (`bank_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_tpurchase_payment2` FOREIGN KEY (`supplier_id`) REFERENCES `tsupplier` (`supplier_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_tpurchase_payment3` FOREIGN KEY (`modifier_id`) REFERENCES `users` (`USER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tpurchase_payment`
--

LOCK TABLES `tpurchase_payment` WRITE;
/*!40000 ALTER TABLE `tpurchase_payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `tpurchase_payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `titem_category`
--

DROP TABLE IF EXISTS `titem_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `titem_category` (
  `category_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(255) NOT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `titem_category`
--

LOCK TABLES `titem_category` WRITE;
/*!40000 ALTER TABLE `titem_category` DISABLE KEYS */;
/*!40000 ALTER TABLE `titem_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `toperational`
--

DROP TABLE IF EXISTS `toperational`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `toperational` (
  `operational_id` int(11) NOT NULL AUTO_INCREMENT,
  `operational_date` timestamp NULL DEFAULT NULL,
  `operational_price` double NOT NULL,
  `operational_note` text NOT NULL,
  `bank_id` int(11) NOT NULL,
  `modifier_id` int(11) NOT NULL,
  PRIMARY KEY (`operational_id`),
  KEY `FK_toperasional1` (`bank_id`),
  KEY `FK_toperasional2` (`modifier_id`),
  CONSTRAINT `FK_toperasional1` FOREIGN KEY (`bank_id`) REFERENCES `tbank` (`bank_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_toperasional2` FOREIGN KEY (`modifier_id`) REFERENCES `users` (`USER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `toperational`
--

LOCK TABLES `toperational` WRITE;
/*!40000 ALTER TABLE `toperational` DISABLE KEYS */;
/*!40000 ALTER TABLE `toperational` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tcustomer`
--

DROP TABLE IF EXISTS `tcustomer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tcustomer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(255) NOT NULL,
  `customer_category` varchar(255) NOT NULL,
  `customer_address1` varchar(255) NOT NULL,
  `customer_address2` varchar(255) NOT NULL,
  `customer_city` varchar(255) NOT NULL,
  `customer_phone` varchar(255) NOT NULL,
  `customer_npwp` varchar(255) NOT NULL,
  `customer_contractor` varchar(255) NOT NULL,
  `salesman_id` int(11) NOT NULL,
  `modifier_id` int(11) NOT NULL,
  PRIMARY KEY (`customer_id`),
  KEY `FK_customer1` (`salesman_id`),
  KEY `KF_customer2` (`modifier_id`),
  CONSTRAINT `FK_customer1` FOREIGN KEY (`salesman_id`) REFERENCES `tsalesman` (`salesman_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `KF_customer2` FOREIGN KEY (`modifier_id`) REFERENCES `users` (`USER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tcustomer`
--

LOCK TABLES `tcustomer` WRITE;
/*!40000 ALTER TABLE `tcustomer` DISABLE KEYS */;
/*!40000 ALTER TABLE `tcustomer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_role` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) DEFAULT NULL,
  `ROLE_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK01` (`USER_ID`),
  KEY `FK02` (`ROLE_ID`),
  CONSTRAINT `FK01` FOREIGN KEY (`USER_ID`) REFERENCES `users` (`USER_ID`),
  CONSTRAINT `FK02` FOREIGN KEY (`ROLE_ID`) REFERENCES `roles` (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbank`
--

DROP TABLE IF EXISTS `tbank`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbank` (
  `bank_id` int(11) NOT NULL AUTO_INCREMENT,
  `bank_name` varchar(255) NOT NULL,
  `bank_note` text NOT NULL,
  PRIMARY KEY (`bank_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbank`
--

LOCK TABLES `tbank` WRITE;
/*!40000 ALTER TABLE `tbank` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbank` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tdeposit`
--

DROP TABLE IF EXISTS `tdeposit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tdeposit` (
  `deposit_id` int(11) NOT NULL AUTO_INCREMENT,
  `deposit_date` date DEFAULT NULL,
  `deposit_number` varchar(255) NOT NULL,
  `bank_id` int(11) NOT NULL,
  PRIMARY KEY (`deposit_id`),
  KEY `FK_tdeposit1` (`bank_id`),
  CONSTRAINT `FK_tdeposit1` FOREIGN KEY (`bank_id`) REFERENCES `tbank` (`bank_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tdeposit`
--

LOCK TABLES `tdeposit` WRITE;
/*!40000 ALTER TABLE `tdeposit` DISABLE KEYS */;
/*!40000 ALTER TABLE `tdeposit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tcash`
--

DROP TABLE IF EXISTS `tcash`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tcash` (
  `cash_id` int(11) NOT NULL AUTO_INCREMENT,
  `cash_date` date NOT NULL,
  `cash_price` double NOT NULL,
  `cash_note` text NOT NULL,
  `modifier_id` int(11) NOT NULL,
  PRIMARY KEY (`cash_id`),
  KEY `FK_tcash1` (`modifier_id`),
  CONSTRAINT `FK_tcash1` FOREIGN KEY (`modifier_id`) REFERENCES `users` (`USER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tcash`
--

LOCK TABLES `tcash` WRITE;
/*!40000 ALTER TABLE `tcash` DISABLE KEYS */;
/*!40000 ALTER TABLE `tcash` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tpurchase`
--

DROP TABLE IF EXISTS `tpurchase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tpurchase` (
  `purchase_id` int(11) NOT NULL AUTO_INCREMENT,
  `purchase_date` date DEFAULT NULL,
  `purchase_invoice` varchar(255) NOT NULL,
  `purchase_total` double NOT NULL,
  `purchase_discount_category` varchar(255) NOT NULL,
  `purchase_discount_price` double NOT NULL,
  `purchase_discount_subtotal` double NOT NULL,
  `purchase_grand` double NOT NULL,
  `purchase_payment` double NOT NULL,
  `purchase_rest` double NOT NULL,
  `purchase_note` text NOT NULL,
  `purchase_flag` double NOT NULL,
  `is_do` tinyint(1) NOT NULL,
  `supplier_id` int(11) NOT NULL,
  `modifier_id` int(11) NOT NULL,
  PRIMARY KEY (`purchase_id`),
  KEY `sales_date` (`purchase_date`),
  KEY `FK_tpurchase1` (`supplier_id`),
  KEY `FK_tpurchase2` (`modifier_id`),
  CONSTRAINT `FK_tpurchase1` FOREIGN KEY (`supplier_id`) REFERENCES `tsupplier` (`supplier_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_tpurchase2` FOREIGN KEY (`modifier_id`) REFERENCES `users` (`USER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tpurchase`
--

LOCK TABLES `tpurchase` WRITE;
/*!40000 ALTER TABLE `tpurchase` DISABLE KEYS */;
/*!40000 ALTER TABLE `tpurchase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ttransfer_item`
--

DROP TABLE IF EXISTS `ttransfer_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ttransfer_item` (
  `list_id` int(11) NOT NULL AUTO_INCREMENT,
  `list_item` int(11) NOT NULL,
  `list_quantity` double NOT NULL,
  `transfer_id` int(11) NOT NULL,
  PRIMARY KEY (`list_id`),
  KEY `FK_ttransfer_item1` (`list_item`),
  KEY `FK_ttransfer_item2` (`transfer_id`),
  CONSTRAINT `FK_ttransfer_item1` FOREIGN KEY (`list_item`) REFERENCES `titem_list` (`item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_ttransfer_item2` FOREIGN KEY (`transfer_id`) REFERENCES `ttransfer` (`transfer_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ttransfer_item`
--

LOCK TABLES `ttransfer_item` WRITE;
/*!40000 ALTER TABLE `ttransfer_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `ttransfer_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ttransfer`
--

DROP TABLE IF EXISTS `ttransfer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ttransfer` (
  `transfer_id` int(11) NOT NULL AUTO_INCREMENT,
  `transfer_date` date DEFAULT NULL,
  `transfer_invoice` varchar(255) NOT NULL,
  `transfer_destination` varchar(255) NOT NULL,
  `transfer_note` text NOT NULL,
  `transfer_flag` double NOT NULL,
  `modifier_id` int(11) NOT NULL,
  PRIMARY KEY (`transfer_id`),
  KEY `sales_date` (`transfer_date`),
  KEY `FK_ttransfer1` (`modifier_id`),
  CONSTRAINT `FK_ttransfer1` FOREIGN KEY (`modifier_id`) REFERENCES `users` (`USER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=874 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ttransfer`
--

LOCK TABLES `ttransfer` WRITE;
/*!40000 ALTER TABLE `ttransfer` DISABLE KEYS */;
/*!40000 ALTER TABLE `ttransfer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tlog`
--

DROP TABLE IF EXISTS `tlog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tlog` (
  `log_id` int(11) NOT NULL AUTO_INCREMENT,
  `log_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `log_note` text NOT NULL,
  `employee_id` int(11) NOT NULL,
  PRIMARY KEY (`log_id`),
  KEY `FK_tlog1` (`employee_id`),
  CONSTRAINT `FK_tlog1` FOREIGN KEY (`employee_id`) REFERENCES `users` (`USER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tlog`
--

LOCK TABLES `tlog` WRITE;
/*!40000 ALTER TABLE `tlog` DISABLE KEYS */;
/*!40000 ALTER TABLE `tlog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tsupplier`
--

DROP TABLE IF EXISTS `tsupplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tsupplier` (
  `supplier_id` int(11) NOT NULL AUTO_INCREMENT,
  `supplier_name` varchar(255) NOT NULL,
  `supplier_address` varchar(255) NOT NULL,
  `supplier_phone` varchar(255) NOT NULL,
  `supplier_contact` varchar(255) NOT NULL,
  `modifier_id` int(11) NOT NULL,
  PRIMARY KEY (`supplier_id`),
  KEY `FK_tsupplier1` (`modifier_id`),
  CONSTRAINT `FK_tsupplier1` FOREIGN KEY (`modifier_id`) REFERENCES `users` (`USER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=145 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tsupplier`
--

LOCK TABLES `tsupplier` WRITE;
/*!40000 ALTER TABLE `tsupplier` DISABLE KEYS */;
/*!40000 ALTER TABLE `tsupplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tdeposit_list`
--

DROP TABLE IF EXISTS `tdeposit_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tdeposit_list` (
  `list_id` int(11) NOT NULL AUTO_INCREMENT,
  `sales_id` int(11) NOT NULL,
  `sales_price` double NOT NULL,
  `deposit_id` int(11) NOT NULL,
  PRIMARY KEY (`list_id`),
  KEY `FK_deposit_list1` (`sales_id`),
  KEY `FK_deposit_list2` (`deposit_id`),
  CONSTRAINT `FK_deposit_list1` FOREIGN KEY (`sales_id`) REFERENCES `tsales` (`sales_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_deposit_list2` FOREIGN KEY (`deposit_id`) REFERENCES `tdeposit` (`deposit_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tdeposit_list`
--

LOCK TABLES `tdeposit_list` WRITE;
/*!40000 ALTER TABLE `tdeposit_list` DISABLE KEYS */;
/*!40000 ALTER TABLE `tdeposit_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tsales`
--

DROP TABLE IF EXISTS `tsales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tsales` (
  `sales_id` int(11) NOT NULL AUTO_INCREMENT,
  `sales_date` date DEFAULT NULL,
  `sales_invoice` varchar(255) NOT NULL,
  `sales_tax` varchar(255) NOT NULL,
  `sales_category` varchar(255) NOT NULL,
  `sales_total` double NOT NULL,
  `sales_payment` double NOT NULL,
  `sales_rest` double NOT NULL,
  `sales_note` text NOT NULL,
  `sales_flag` double NOT NULL,
  `sales_print` tinyint(1) NOT NULL,
  `sales_retur` double NOT NULL,
  `customer_id` int(11) NOT NULL,
  `customer_p` double NOT NULL,
  `employee_id` int(11) NOT NULL,
  `is_old` tinyint(1) NOT NULL,
  `modifier_id` int(11) NOT NULL,
  PRIMARY KEY (`sales_id`),
  KEY `sales_date` (`sales_date`),
  KEY `FK_tsales1` (`customer_id`),
  KEY `FK_tsales2` (`employee_id`),
  KEY `FK_tsales3` (`modifier_id`),
  CONSTRAINT `FK_tsales1` FOREIGN KEY (`customer_id`) REFERENCES `tcustomer` (`customer_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_tsales2` FOREIGN KEY (`employee_id`) REFERENCES `users` (`USER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_tsales3` FOREIGN KEY (`modifier_id`) REFERENCES `users` (`USER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tsales`
--

LOCK TABLES `tsales` WRITE;
/*!40000 ALTER TABLE `tsales` DISABLE KEYS */;
/*!40000 ALTER TABLE `tsales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tgroup`
--

DROP TABLE IF EXISTS `tgroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tgroup` (
  `group_id` int(11) NOT NULL AUTO_INCREMENT,
  `group_name` varchar(255) NOT NULL,
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tgroup`
--

LOCK TABLES `tgroup` WRITE;
/*!40000 ALTER TABLE `tgroup` DISABLE KEYS */;
/*!40000 ALTER TABLE `tgroup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tcollect_list`
--

DROP TABLE IF EXISTS `tcollect_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tcollect_list` (
  `list_id` int(11) NOT NULL AUTO_INCREMENT,
  `list_price` double NOT NULL,
  `list_flag` double NOT NULL,
  `sales_id` int(11) NOT NULL,
  `collect_id` int(11) NOT NULL,
  PRIMARY KEY (`list_id`),
  KEY `FK_collect_list1` (`sales_id`),
  KEY `FK_collect_list2` (`collect_id`),
  CONSTRAINT `FK_collect_list1` FOREIGN KEY (`sales_id`) REFERENCES `tsales` (`sales_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_collect_list2` FOREIGN KEY (`collect_id`) REFERENCES `tcollect` (`collect_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tcollect_list`
--

LOCK TABLES `tcollect_list` WRITE;
/*!40000 ALTER TABLE `tcollect_list` DISABLE KEYS */;
/*!40000 ALTER TABLE `tcollect_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tsales_payment_list`
--

DROP TABLE IF EXISTS `tsales_payment_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tsales_payment_list` (
  `list_id` int(11) NOT NULL AUTO_INCREMENT,
  `list_price` double NOT NULL,
  `sales_id` int(11) NOT NULL,
  `payment_id` int(11) NOT NULL,
  PRIMARY KEY (`list_id`),
  KEY `FK_tsales_payment_list1` (`sales_id`),
  KEY `FK_tsales_payment_list2` (`payment_id`),
  CONSTRAINT `FK_tsales_payment_list1` FOREIGN KEY (`sales_id`) REFERENCES `tsales` (`sales_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_tsales_payment_list2` FOREIGN KEY (`payment_id`) REFERENCES `tsales_payment` (`payment_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tsales_payment_list`
--

LOCK TABLES `tsales_payment_list` WRITE;
/*!40000 ALTER TABLE `tsales_payment_list` DISABLE KEYS */;
/*!40000 ALTER TABLE `tsales_payment_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roles` (
  `ROLE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ROLE_NAME` varchar(20) NOT NULL,
  `ROLE_DESC` varchar(20) NOT NULL,
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tdo_item`
--

DROP TABLE IF EXISTS `tdo_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tdo_item` (
  `list_id` int(11) NOT NULL AUTO_INCREMENT,
  `list_item` int(11) NOT NULL,
  `list_quantity` double NOT NULL,
  `list_purchase_price` double NOT NULL,
  `list_sales_price` double NOT NULL,
  `list_discount_subtotal` double NOT NULL,
  `list_purchase_subtotal` double NOT NULL,
  `list_sales_subtotal` double NOT NULL,
  `list_profit` double NOT NULL,
  `list_status` tinyint(1) NOT NULL,
  `do_id` int(11) NOT NULL,
  PRIMARY KEY (`list_id`),
  KEY `FK_do_item1` (`list_item`),
  KEY `FK_do_item2` (`do_id`),
  CONSTRAINT `FK_do_item1` FOREIGN KEY (`list_item`) REFERENCES `titem_list` (`item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_do_item2` FOREIGN KEY (`do_id`) REFERENCES `tdo` (`do_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tdo_item`
--

LOCK TABLES `tdo_item` WRITE;
/*!40000 ALTER TABLE `tdo_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `tdo_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tpurchase_payment_list`
--

DROP TABLE IF EXISTS `tpurchase_payment_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tpurchase_payment_list` (
  `list_id` int(11) NOT NULL AUTO_INCREMENT,
  `list_price` double NOT NULL,
  `purchase_id` int(11) NOT NULL,
  `payment_id` int(11) NOT NULL,
  PRIMARY KEY (`list_id`),
  KEY `FK_tpurchase_payment_list1` (`purchase_id`),
  KEY `FK_tpurchase_payment_list2` (`payment_id`),
  CONSTRAINT `FK_tpurchase_payment_list1` FOREIGN KEY (`purchase_id`) REFERENCES `tpurchase` (`purchase_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_tpurchase_payment_list2` FOREIGN KEY (`payment_id`) REFERENCES `tpurchase_payment` (`payment_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tpurchase_payment_list`
--

LOCK TABLES `tpurchase_payment_list` WRITE;
/*!40000 ALTER TABLE `tpurchase_payment_list` DISABLE KEYS */;
/*!40000 ALTER TABLE `tpurchase_payment_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `titem_list`
--

DROP TABLE IF EXISTS `titem_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `titem_list` (
  `item_id` int(11) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(255) NOT NULL,
  `item_price_pl` varchar(255) NOT NULL,
  `item_price_m` varchar(255) NOT NULL,
  `item_price_r` varchar(255) NOT NULL,
  `item_price_d` varchar(255) NOT NULL,
  `item_price_p` varchar(255) NOT NULL,
  `item_start_stock` double NOT NULL,
  `item_current_stock` double NOT NULL,
  `category_id` int(11) NOT NULL,
  `price_id` int(11) NOT NULL,
  `modifier_id` int(11) NOT NULL,
  PRIMARY KEY (`item_id`),
  KEY `FK_titem_list1` (`modifier_id`),
  KEY `FK_titem_list2` (`category_id`,`price_id`),
  CONSTRAINT `FK_titem_list1` FOREIGN KEY (`modifier_id`) REFERENCES `users` (`USER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_titem_list2` FOREIGN KEY (`category_id`, `price_id`) REFERENCES `titem_price` (`category_id`, `price_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `titem_list`
--

LOCK TABLES `titem_list` WRITE;
/*!40000 ALTER TABLE `titem_list` DISABLE KEYS */;
/*!40000 ALTER TABLE `titem_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tpurchase_item`
--

DROP TABLE IF EXISTS `tpurchase_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tpurchase_item` (
  `list_id` int(11) NOT NULL AUTO_INCREMENT,
  `list_item` int(11) NOT NULL,
  `list_quantity` double NOT NULL,
  `list_quantity_all` double NOT NULL,
  `list_price` double NOT NULL,
  `list_discount_category` varchar(255) NOT NULL,
  `list_discount_price` double NOT NULL,
  `list_discount_subtotal` double NOT NULL,
  `list_subtotal` double NOT NULL,
  `list_flag` double NOT NULL,
  `purchase_id` int(11) NOT NULL,
  `do_list_id` int(11) NOT NULL,
  PRIMARY KEY (`list_id`),
  KEY `FK_tpurchase_item1` (`list_item`),
  KEY `FK_tpurchase_item2` (`purchase_id`),
  KEY `FK_tpurchase_item3` (`do_list_id`),
  CONSTRAINT `FK_tpurchase_item1` FOREIGN KEY (`list_item`) REFERENCES `titem_list` (`item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_tpurchase_item2` FOREIGN KEY (`purchase_id`) REFERENCES `tpurchase` (`purchase_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_tpurchase_item3` FOREIGN KEY (`do_list_id`) REFERENCES `tdo` (`do_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tpurchase_item`
--

LOCK TABLES `tpurchase_item` WRITE;
/*!40000 ALTER TABLE `tpurchase_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `tpurchase_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tsales_payment`
--

DROP TABLE IF EXISTS `tsales_payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tsales_payment` (
  `payment_id` int(11) NOT NULL AUTO_INCREMENT,
  `payment_date` date NOT NULL,
  `payment_invoice` varchar(255) NOT NULL,
  `payment_price` double NOT NULL,
  `payment_cut` double NOT NULL,
  `payment_total` double NOT NULL,
  `payment_rest` double NOT NULL,
  `payment_method` varchar(255) NOT NULL,
  `payment_acceptdate` date DEFAULT NULL,
  `payment_from` varchar(255) NOT NULL,
  `payment_number` varchar(255) NOT NULL,
  `payment_note` text NOT NULL,
  `bank_id` int(11) NOT NULL,
  `modifier_id` int(11) NOT NULL,
  PRIMARY KEY (`payment_id`),
  KEY `FK_tsales_payment1` (`bank_id`),
  KEY `FK_tsales_payment2` (`modifier_id`),
  CONSTRAINT `FK_tsales_payment1` FOREIGN KEY (`bank_id`) REFERENCES `tbank` (`bank_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_tsales_payment2` FOREIGN KEY (`modifier_id`) REFERENCES `users` (`USER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=11973 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tsales_payment`
--

LOCK TABLES `tsales_payment` WRITE;
/*!40000 ALTER TABLE `tsales_payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `tsales_payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tsales_item`
--

DROP TABLE IF EXISTS `tsales_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tsales_item` (
  `list_id` int(11) NOT NULL AUTO_INCREMENT,
  `list_item` int(11) NOT NULL,
  `list_quantity_p` double NOT NULL,
  `list_quantity` double NOT NULL,
  `list_price` double NOT NULL,
  `list_subtotal` double NOT NULL,
  `supplier_id` int(11) NOT NULL,
  `sales_id` int(11) NOT NULL,
  PRIMARY KEY (`list_id`),
  KEY `FK_tsales_item` (`list_item`),
  KEY `FK_tsales_item2` (`supplier_id`),
  KEY `FK_tsales_item3` (`sales_id`),
  CONSTRAINT `FK_tsales_item` FOREIGN KEY (`list_item`) REFERENCES `titem_list` (`item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_tsales_item2` FOREIGN KEY (`supplier_id`) REFERENCES `tsupplier` (`supplier_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_tsales_item3` FOREIGN KEY (`sales_id`) REFERENCES `tsales` (`sales_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tsales_item`
--

LOCK TABLES `tsales_item` WRITE;
/*!40000 ALTER TABLE `tsales_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `tsales_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'future'
--

--
-- Dumping routines for database 'future'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-10-04 15:11:52
