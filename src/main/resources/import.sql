-- https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-sql.html
-- https://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html
-- IN THIS FILE WE CAN WRITE AN SQL SCRIPT CONTAINING:
-- SCHEMA, TABLE AND DATA MANIPULATION QUERIES
-- TO BE EXECUTED AUTOMATICALLY DURING THE INITIALIZATION OF THE APPLICATION
-- AND AFTER THE CREATION OF SCHEMA AND TABLES BY Hibernate
-- IF spring.jpa.hibernate.ddl-auto IS SET TO create OR create-drop
-- IT IS A Hibernate feature (nothing to do with Spring)

INSERT INTO APPUSERS (firstname, lastname, email, password, telephone, company) VALUES ('Admin', 'Admin', 'admin@mail.com', 'admin', '6955555555', 'Company1');
INSERT INTO APPUSERS (firstname, lastname, email, password, telephone, company) VALUES ('Christos', 'Papas', 'papas@mail.com', 'papas', '6954545454', 'Company2');
INSERT INTO APPUSERS (firstname, lastname, email, password, telephone, company) VALUES ('Christos', 'Panos', 'panos@mail.com', 'panos', '6978022548', 'Company3');
INSERT INTO APPUSERS (firstname, lastname, email, password, telephone, company) VALUES ('Panagiotis', 'Ioannou', 'ioannou@mail.com', 'ioannou', '6958881742', 'Company4');
INSERT INTO APPUSERS (firstname, lastname, email, password, telephone, company) VALUES ('Ioannis', 'Katridis', 'katridis@mail.com', 'katridis', '6942334158', 'Company5');
