create database sports;
use sports;

CREATE TABLE IF NOT EXISTS `person` (
  `personID` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `role` varchar(100) NOT NULL,
  `pwd` varchar(100) NOT NULL,
  PRIMARY KEY (`personID`)
);

CREATE TABLE IF NOT EXISTS `Fav_Teams` (
  `personID` int NOT NULL AUTO_INCREMENT,
  `teamID` int,
  `name` varchar(100) NOT NULL,
  FOREIGN KEY (`personID`) references person(`personID`),
  PRIMARY KEY (`teamID`)
);

INSERT INTO `person` (`name`,`role`,`pwd`) VALUES ('admin','ADMIN','admin');
INSERT INTO `person` (`name`,`role`,`pwd`) VALUES ('user','USER','user');

INSERT INTO `Fav_Teams` (`personID`, `teamID`, `name`) VALUES ('2', '1', 'Porto');
INSERT INTO `Fav_Teams` (`personID`, `teamID`, `name`) VALUES ('2', '2', 'Real');
INSERT INTO `Fav_Teams` (`personID`, `teamID`, `name`) VALUES ('2', '1', 'Barça');