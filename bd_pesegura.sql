-- borra la bd si existe
DROP DATABASE IF EXISTS BD_PESEGURA;

SET GLOBAL FOREIGN_KEY_CHECKS=0;
-- creamos la bd
CREATE DATABASE BD_PESEGURA;
-- activamos la bd
USE BD_PESEGURA;

CREATE TABLE tipo(
codtipo  int not null unique primary key,
descripcion varchar(120)
);

create table mascota(
idmascota int not null unique auto_increment,
nombre varchar(120),
codtipo int not null,
peso double not null,
fechanac date not null,
foreign key(codtipo) references tipo(codtipo),
primary key(idmascota)
);

-- inserts
insert into tipo values (1, 'Perros');
insert into tipo values (2, 'Gatos');
insert into tipo values (3, 'Peces');

insert into mascota values (0,'Firulais', 1, 20.00, '2022-01-15');
insert into mascota values (0,'Michi', 2, 6.00,  '2022-01-10');
insert into mascota values (0,'Nemo', 3, 1.00, '2022-02-15');

-- consultas
SELECT * FROM tipo;
SELECT * FROM mascota;

-- cantidad de registros por tipo
select c.descripcion as Tipos, count(p.idmascota) as Cantidad
from mascota p inner join tipo c on p.codtipo = c.codtipo
group by c.descripcion