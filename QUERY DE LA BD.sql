CREATE DATABASE BOLETOS
USE BOLETOS;

CREATE TABLE TB_PERSONA(
Id int not null identity(1,1) primary key,
Usuario varchar(50),
Pass varchar(50)
);

CREATE TABLE TB_VUELO(
Id int not null identity(1,1) primary key,
Origen varchar(50),
Destino varchar(50),
Fecha varchar(50),
HoraSalida varchar(50),
HoraLlegada varchar(50),
TipoAvion varchar(50),
Estatus varchar(50)
);

CREATE TABLE TB_RESERVACION(
RESERVACION INT NOT NULL IDENTITY (1,1) PRIMARY KEY,
VUELO_ID int not null,
FILA INT NOT NULL,
ASIENTO VARCHAR(50),
NO_PASAPORTE INT NOT NULL, 
NOMBRE VARCHAR(50),
NACIONALIDAD VARCHAR(50),
FECHA_NAC VARCHAR(50),
TIPO_AVION VARCHAR(50)
);


INSERT INTO TB_PERSONA(Usuario,Pass) VALUES('rsoto','rsoto' )
INSERT INTO TB_PERSONA(Usuario,Pass) VALUES('jherrera','jh123' )
INSERT INTO TB_PERSONA(Usuario,Pass) VALUES('gramirez','gramirez' )
INSERT INTO TB_PERSONA(Usuario,Pass) VALUES('msarazua','msarazua' )

INSERT INTO TB_VUELO(Origen,Destino,Fecha,HoraSalida,HoraLlegada,TipoAvion,Estatus) VALUES('Guatemala','Chicago','01/01/2021','01', '12', 'Boing747','Programado' )
INSERT INTO TB_VUELO(Origen,Destino,Fecha,HoraSalida,HoraLlegada,TipoAvion,Estatus) VALUES('Chicago','Guatemala','05/11/2021','10', '18', 'Embraer','Programado' )

ALTER TABLE TB_RESERVACION
ADD FOREIGN KEY (VUELO_ID) REFERENCES TB_VUELO(Id);

SELECT *FROM TB_PERSONA
SELECT * FROM TB_VUELO
SELECT *FROM TB_RESERVACION






