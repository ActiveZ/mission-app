create table mission (
id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
date_debut date DEFAULT NULL,
date_fin date DEFAULT NULL,
libelle varchar(100) DEFAULT NULL,
taux_journalier decimal(10,2) DEFAULT NULL
);