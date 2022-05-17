create database sports;
use sports;

CREATE TABLE IF NOT EXISTS `person` (
  `personID` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `role` varchar(100) NOT NULL,
  `pwd` varchar(100) NOT NULL,
  PRIMARY KEY (`personID`)
);

CREATE TABLE IF NOT EXISTS `Fav_Leagues` (
  `personID` int NOT NULL AUTO_INCREMENT,
  `leagueID` int,
  `name` varchar(100) NOT NULL,
  `country` varchar(100) NOT NULL,
  FOREIGN KEY (`personID`) references person(`personID`),
  PRIMARY KEY (`leagueID`)
);

INSERT INTO `person` (`name`,`role`,`pwd`) VALUES ('admin','ADMIN','admin');
INSERT INTO `person` (`name`,`role`,`pwd`) VALUES ('user','USER','user');

INSERT INTO `Fav_Leagues` (`personID`, `leagueID`, `name`, `country`) VALUES ('2', '1', 'Primeira Liga', 'Portugal');
INSERT INTO `Fav_Leagues` (`personID`, `leagueID`, `name`, `country`) VALUES ('2', '2', 'Bundesliga', 'Germany');
