create database sports;


--HIBERNATE AUTO CREATES THIS TABLES:
/*
use sports;

CREATE TABLE IF NOT EXISTS `person` (
  `personID` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `role` varchar(100) NOT NULL,
  `pwd` varchar(100) NOT NULL,
  PRIMARY KEY (`personID`)
);

CREATE TABLE IF NOT EXISTS `Fav_Leagues` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `personID` int NOT NULL,
  `leagueID` varchar(100) NOT NULL,
  -- `name` varchar(100) NOT NULL,
  -- `abbv` varchar(100) NOT NULL,
  FOREIGN KEY (`personID`) references person(`personID`),
  PRIMARY KEY (`ID`)
);

INSERT INTO `person` (`name`,`role`,`pwd`) VALUES ('admin','ADMIN','admin');
INSERT INTO `person` (`name`,`role`,`pwd`) VALUES ('user','USER','user');

-- INSERT INTO `Fav_Leagues` (`personID`, `leagueID`, `name`, `abbv`) VALUES ('2', '1', 'Primeira Liga', 'Por');
-- INSERT INTO `Fav_Leagues` (`personID`, `leagueID`, `name`, `abbv`) VALUES ('2', '2', 'Bundesliga', 'Ger');

-- INSERT INTO `Fav_Leagues` (`personID`, `leagueID`, `name`, `abbv`) VALUES ('2', '2', 'Bundesliga', 'Ger');
*/

