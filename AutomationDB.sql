create database if not exists AutomationDB;

use AutomationDB;

create table WebTable(
	idWebTable integer not null auto_increment,
    firstname varchar(50),
    lastname varchar(50),
    email varchar(50),
    age varchar(20),
    salary varchar(50),
    department varchar(50),
    entrydate varchar(50),
    primary key(idWebTable)
);
