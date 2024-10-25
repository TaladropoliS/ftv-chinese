### Name DB: horoscopodb
~~~
CREATE TABLE HOROSCOPO (
id INT PRIMARY KEY AUTO_INCREMENT,
animal VARCHAR(30),
fecha_inicio DATE,
fecha_fin DATE
);

CREATE TABLE USUARIOS(
id INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(30),
username VARCHAR(30),
email VARCHAR(30),
fecha_nacimiento DATE,
password VARCHAR(30),
animal VARCHAR(30)
);
~~~

### INSERT

~~~
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Rata', '1924-02-05 00:00:00', '1925-01-24 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Buey', '1925-01-25 00:00:00', '1926-02-12 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Tigre', '1926-02-13 00:00:00', '1927-02-01 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Conejo', '1927-02-02 00:00:00', '1928-01-22 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Dragón', '1928-01-23 00:00:00', '1929-02-09 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Serpiente', '1929-02-10 00:00:00', '1930-01-29 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Caballo', '1930-01-30 00:00:00', '1931-02-16 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Cabra', '1931-02-17 00:00:00', '1932-02-05 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Mono', '1932-02-06 00:00:00', '1933-01-25 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Gallo', '1933-01-26 00:00:00', '1934-02-13 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Perro', '1934-02-14 00:00:00', '1935-02-03 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Cerdo', '1935-02-04 00:00:00', '1936-01-23 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Rata', '1936-01-24 00:00:00', '1937-02-10 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Buey', '1937-02-11 00:00:00', '1938-01-30 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Tigre', '1938-01-31 00:00:00', '1939-02-18 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Conejo', '1939-02-19 00:00:00', '1940-02-07 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Dragón', '1940-02-08 00:00:00', '1941-01-26 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Serpiente', '1941-01-27 00:00:00', '1942-02-14 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Caballo', '1942-02-15 00:00:00', '1943-02-04 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Cabra', '1943-02-05 00:00:00', '1944-01-24 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Mono', '1944-01-25 00:00:00', '1945-02-12 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Gallo', '1945-02-13 00:00:00', '1946-02-01 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Perro', '1946-02-02 00:00:00', '1947-01-21 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Cerdo', '1947-01-22 00:00:00', '1948-02-09 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Rata', '1948-02-10 00:00:00', '1949-01-28 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Buey', '1949-01-29 00:00:00', '1950-02-16 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Tigre', '1950-02-17 00:00:00', '1951-02-05 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Conejo', '1951-02-06 00:00:00', '1952-01-26 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Dragón', '1952-01-27 00:00:00', '1953-02-13 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Serpiente', '1953-02-14 00:00:00', '1954-02-02 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Caballo', '1954-02-03 00:00:00', '1955-01-23 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Cabra', '1955-01-24 00:00:00', '1956-02-11 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Mono', '1956-02-12 00:00:00', '1957-01-30 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Gallo', '1957-01-31 00:00:00', '1958-02-17 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Perro', '1958-02-18 00:00:00', '1959-02-07 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Cerdo', '1959-02-08 00:00:00', '1960-01-27 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Rata', '1960-01-28 00:00:00', '1961-02-14 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Buey', '1961-02-15 00:00:00', '1962-02-04 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Tigre', '1962-02-05 00:00:00', '1963-01-24 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Conejo', '1963-01-25 00:00:00', '1964-02-12 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Dragón', '1964-02-13 00:00:00', '1965-02-01 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Serpiente', '1965-02-02 00:00:00', '1966-01-20 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Caballo', '1966-01-21 00:00:00', '1967-02-08 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Cabra', '1967-02-09 00:00:00', '1968-01-29 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Mono', '1968-01-30 00:00:00', '1969-02-16 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Gallo', '1969-02-17 00:00:00', '1970-02-05 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Perro', '1970-02-06 00:00:00', '1971-01-26 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Cerdo', '1971-01-27 00:00:00', '1972-02-14 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Rata', '1972-02-15 00:00:00', '1973-02-02 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Buey', '1973-02-03 00:00:00', '1974-01-22 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Tigre', '1974-01-23 00:00:00', '1975-02-10 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Conejo', '1975-02-11 00:00:00', '1976-01-30 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Dragón', '1976-01-31 00:00:00', '1977-02-17 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Serpiente', '1977-02-18 00:00:00', '1978-02-06 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Caballo', '1978-02-07 00:00:00', '1979-01-27 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Cabra', '1979-01-28 00:00:00', '1980-02-15 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Mono', '1980-02-16 00:00:00', '1981-02-04 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Gallo', '1981-02-05 00:00:00', '1982-01-24 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Perro', '1982-01-25 00:00:00', '1983-02-12 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Cerdo', '1983-02-13 00:00:00', '1984-02-01 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Rata', '1984-02-02 00:00:00', '1985-02-19 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Buey', '1985-02-20 00:00:00', '1986-02-08 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Tigre', '1986-02-09 00:00:00', '1987-01-28 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Conejo', '1987-01-29 00:00:00', '1988-02-16 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Dragón', '1988-02-17 00:00:00', '1989-02-05 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Serpiente', '1989-02-06 00:00:00', '1990-01-26 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Caballo', '1990-01-27 00:00:00', '1991-02-14 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Cabra', '1991-02-15 00:00:00', '1992-02-03 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Mono', '1992-02-04 00:00:00', '1993-01-22 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Gallo', '1993-01-23 00:00:00', '1994-02-09 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Perro', '1994-02-10 00:00:00', '1995-01-30 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Cerdo', '1995-01-31 00:00:00', '1996-02-18 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Rata', '1996-02-19 00:00:00', '1997-02-06 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Buey', '1997-02-07 00:00:00', '1998-01-27 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Tigre', '1998-01-28 00:00:00', '1999-02-15 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Conejo', '1999-02-16 00:00:00', '2000-02-04 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Dragón', '2000-02-05 00:00:00', '2001-01-23 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Serpiente', '2001-01-24 00:00:00', '2002-02-11 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Caballo', '2002-02-12 00:00:00', '2003-01-31 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Cabra', '2003-02-01 00:00:00', '2004-01-21 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Mono', '2004-01-22 00:00:00', '2005-02-08 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Gallo', '2005-02-09 00:00:00', '2006-01-28 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Perro', '2006-01-29 00:00:00', '2007-02-17 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Cerdo', '2007-02-18 00:00:00', '2008-02-06 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Rata', '2008-02-07 00:00:00', '2009-01-25 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Buey', '2009-01-26 00:00:00', '2010-02-13 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Tigre', '2010-02-14 00:00:00', '2011-02-02 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Conejo', '2011-02-03 00:00:00', '2012-01-22 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Dragón', '2012-01-23 00:00:00', '2013-02-09 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Serpiente', '2013-02-10 00:00:00', '2014-01-30 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Caballo', '2014-01-31 00:00:00', '2015-02-18 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Cabra', '2015-02-19 00:00:00', '2016-02-07 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Mono', '2016-02-08 00:00:00', '2017-01-27 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Gallo', '2017-01-28 00:00:00', '2018-02-15 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Perro', '2018-02-16 00:00:00', '2019-02-04 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Cerdo', '2019-02-05 00:00:00', '2020-01-24 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Rata', '2020-01-25 00:00:00', '2021-02-11 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Buey', '2021-02-12 00:00:00', '2022-01-31 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Tigre', '2022-02-01 00:00:00', '2023-01-21 00:00:00');
INSERT INTO HOROSCOPO (animal, fecha_inicio, fecha_fin) VALUES ('Conejo', '2023-01-22 00:00:00', '2024-02-09 00:00:00');
~~~

### Se agrega COLUMN: url

~~~
ALTER TABLE HOROSCOPO ADD COLUMN url VARCHAR(255);
~~~

### Se hace un UPDATE con las urls de los animales

~~~
UPDATE HOROSCOPO SET url = 'https://fernandotaladriz.com/03-img-h-ch/Rata.jpg' WHERE animal = 'Rata';
UPDATE HOROSCOPO SET url = 'https://fernandotaladriz.com/03-img-h-ch/Buey.jpg' WHERE animal = 'Buey';
UPDATE HOROSCOPO SET url = 'https://fernandotaladriz.com/03-img-h-ch/Tigre.jpg' WHERE animal = 'Tigre';
UPDATE HOROSCOPO SET url = 'https://fernandotaladriz.com/03-img-h-ch/Conejo.jpg' WHERE animal = 'Conejo';
UPDATE HOROSCOPO SET url = 'https://fernandotaladriz.com/03-img-h-ch/Dragon.jpg' WHERE animal = 'Dragón';
UPDATE HOROSCOPO SET url = 'https://fernandotaladriz.com/03-img-h-ch/Serpiente.jpg' WHERE animal = 'Serpiente';
UPDATE HOROSCOPO SET url = 'https://fernandotaladriz.com/03-img-h-ch/Caballo.jpg' WHERE animal = 'Caballo';
UPDATE HOROSCOPO SET url = 'https://fernandotaladriz.com/03-img-h-ch/Cabra.jpg' WHERE animal = 'Cabra';
UPDATE HOROSCOPO SET url = 'https://fernandotaladriz.com/03-img-h-ch/Mono.jpg' WHERE animal = 'Mono';
UPDATE HOROSCOPO SET url = 'https://fernandotaladriz.com/03-img-h-ch/Gallo.jpg' WHERE animal = 'Gallo';
UPDATE HOROSCOPO SET url = 'https://fernandotaladriz.com/03-img-h-ch/Perro.jpg' WHERE animal = 'Perro';
UPDATE HOROSCOPO SET url = 'https://fernandotaladriz.com/03-img-h-ch/Cerdo.jpg' WHERE animal = 'Cerdo';

~~~