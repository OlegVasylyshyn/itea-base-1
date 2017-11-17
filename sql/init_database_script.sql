CREATE DATABASE base1;

USE base1;

CREATE TABLE user (
  id INT(64),
  name VARCHAR(256),
  password VARCHAR(256),
  age INT,
  carId INT(64),
  PRIMARY KEY (id)
);

CREATE TABLE car (
  id INT(64),
  type VARCHAR(256),
  color VARCHAR(256),
  userId INT(64),
  PRIMARY KEY (id)
);
