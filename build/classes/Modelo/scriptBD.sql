CREATE DATABASE curriculumaPDF;

USE curriculumaPDF; 

CREATE TABLE IDIOMA(
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR (50)
);


CREATE TABLE CONOCIMIENTODEINFORMATICA(
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR (50)
);

CREATE TABLE CURRICULUM (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR (50),
apellido VARCHAR (50),
rut VARCHAR (50),
fechaDeNacimiento DATE,
nacionalidad VARCHAR (50),
estadoCivil VARCHAR (50),
esHombre BOOLEAN,
telefono VARCHAR (50),
correo VARCHAR (50),
direccion VARCHAR (150),
nivelDeEstudio VARCHAR (50),
ocupacion VARCHAR (50),
disponibilidad VARCHAR (50),
UNIQUE (rut)
);


CREATE TABLE EXPERIENCIA(
id INT AUTO_INCREMENT PRIMARY KEY,
lugar VARCHAR (50),
cargo VARCHAR (50),
fechaDeInicio DATE,
fechaDeTermino DATE,
curriculumFK INT,
FOREIGN KEY (curriculumFK) REFERENCES CURRICULUM (id)
);

CREATE TABLE REFERENCIA (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR (50),
apellido VARCHAR (50),
cargo VARCHAR (50),
telefono VARCHAR (50),
curriculumFK INT,
FOREIGN KEY (curriculumFK) REFERENCES CURRICULUM (id)
);


CREATE TABLE IDIOMA_CURRICULUM (
id INT AUTO_INCREMENT PRIMARY KEY,
idiomaFK INT,
curriculumFK INT,
FOREIGN KEY (idiomaFK) REFERENCES idioma (id),
FOREIGN KEY (curriculumFK) REFERENCES curriculum (id)
);

CREATE TABLE CONOCIMIENTOINFORMATICA_CURRICULUM(
id INT AUTO_INCREMENT PRIMARY KEY,
conInformatica INT,
curriculumFK INT,
FOREIGN KEY (conInformatica) REFERENCES CONOCIMIENTODEINFORMATICA (id),
FOREIGN KEY (curriculumFK) REFERENCES curriculum (id)
);


INSERT INTO IDIOMA (nombre) VALUES ("Español"),
("Inglés"),
("Alemán"),
("Portugues"),
("Frances"),
("Chino"),
("Ruso"),
("Japones"),
("Polaco"),
("Árabe"),
("Italiano")
;


INSERT INTO CONOCIMIENTODEINFORMATICA (nombre) VALUES 
("Java"),
("Python"),
("PHP"),
("C"),
("C#"),
("C++"),
("C+"),
("C"),
("Ruby"),
("Kotlin"),
("Excel"),
("Word"),
("Linux")
;


/*
INSERT INTO CURRICULUM VALUES (NULL, 'marcelo', 'aranda', '20898088-2', '2020-8-8', 'chileno', 'soltero', 1, '123123123', 'cheloz_20@hotmail.com', 'el roble', 'profesional', 'estudiante', 'inmediata');
INSERT INTO EXPERIENCIA VALUES (NULL, 'algun lugar', 'algun cargo', '2020-8-8','2020-8-8', 1);
INSERT INTO REFERENCIA VALUES (NULL, 'algun nombre', 'algun apelllido', 'algun cargo','34532453245', 1);
INSERT INTO IDIOMA_CURRICULUM VALUES (NULL, 1,1);
INSERT INTO CONOCIMIENTOINFORMATICA_CURRICULUM VALUES (NULL, 1,1);


SELECT * FROM CURRICULUM;
SELECT * FROM EXPERIENCIA;
SELECT * FROM IDIOMA_CURRICULUM;
SELECT * FROM CONOCIMIENTOINFORMATICA_CURRICULUM;


*/

-- SELECT * FROM idioma;
-- SELECT * FROM CONOCIMIENTODEINFORMATICA;

# DROP DATABASE curriculumaPDF