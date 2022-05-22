DROP TABLE IF EXISTS almacenes;
DROP TABLE IF EXISTS cajas;

create table almacenes (
codigo int auto_increment primary key,
lugar varchar(100),
capacidad int
);
INSERT INTO almacenes VALUES (default, 'Valencia',3),(default, 'Barcelona',4),(default, 'Bilbao',7),(default, 'Los Angeles',2),(default, 'San Francisco',8);

create table cajas (
numreferencia char(5) primary key,
contenido varchar(100),
valor int,
almacen int,
foreign key (almacen) references almacenes(codigo)
);
INSERT INTO cajas VALUES ('0MN7','Rocks',180,3),('4H8P','Rocks',250,1),('4RT3','Scissors',190,4),('7G3H','Rocks',200,1),('8JN6','Papers',75,1),('8Y6U','Papers',50,3),('9J6F','Papers',175,2),('LL08','Rocks',140,4),('P0H6','Scissors',125,1),('P2T6','Scissors',150,2),('TU55','Papers',90,5);