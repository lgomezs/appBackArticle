CREATE DATABASE bdservertest;

USE bdservertest;

CREATE SCHEMA customer;

CREATE TABLE bdservertest.customer.Customer (
	ID int IDENTITY(0,1) NOT NULL,
	name varchar(100) NULL,
	email varchar(100) NULL,
	phone int NULL
);


