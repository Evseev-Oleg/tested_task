CREATE
DATABASE my_db;

CREATE TABLE people
(
    id         int         NOT NULL AUTO_INCREMENT,
    first_name varchar(45) NOT NULL,
    last_name  varchar(45) NOT NULL,
    patronymic varchar(45) NOT NULL,
    birthday   varchar(45) NOT NULL,
    sex        varchar(1)  NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE type_document
(
    id   int         NOT NULL AUTO_INCREMENT,
    name varchar(45) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE documents
(
    id        int NOT NULL AUTO_INCREMENT,
    type_id   int NOT NULL,
    people_id int NOT NULL,
    series    int         DEFAULT NULL,
    number    int         DEFAULT NULL,
    date      varchar(45) DEFAULT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (type_id) REFERENCES type_document (id),
    FOREIGN KEY (people_id) REFERENCES people (id)
);

insert into my_db.type_document(name)value('Паспорт');
insert into my_db.type_document(name)value('СНИЛС');
insert into my_db.type_document(name)value('ИНН');
insert into my_db.type_document(name)value('Водительское удостоверение');
insert into my_db.type_document(name)value('Приписное свидетельство');
insert into my_db.type_document(name)value('Военный билет');