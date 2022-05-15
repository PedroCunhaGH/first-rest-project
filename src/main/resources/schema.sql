create database sports;
use sports;

CREATE TABLE IF NOT EXISTS `person` (
  `personID` int NOT NULL, AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `role` varchar(100) NOT NULL,
  `pwd` varchar(100) NOT NULL,
  PRIMARY KEY (`person_id`)
);