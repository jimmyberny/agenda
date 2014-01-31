Entidades

Nombre,
Apellido paterno,
Apellido materno,
Estado
Municipio,
Colonia
Calle
Numero
SCIAN???
Fax
e-mail
C.P.
Telefono
No. de empleados
Fecha inicio operaciones

Giro -> Otra entidad
Rango de ventas -> Otra entidad

create database siem;

use siem;

create table usuario (
	id varchar(40) not null,
	nombre varchar(120) not null,
	usuario varchar(30) not null,
	contrasena varchar(30) not null,
	constraint pk_usuario primary key(id)
) engine = InnoDB;

create unique index idx_usuario on usuario(usuario);

create table estado (
	id varchar(40) not null,
	nombre varchar(60) not null,
	constraint pk_estado primary key(id)
) engine = InnoDB;

create unique index idx_estado on estado(nombre);

create table municipio (
	id varchar(40) not null,
	nombre varchar(100) not null,
	id_estado varchar(40) not null,
	constraint pk_municipio primary key(id),
	constraint fk_m_e_estado foreign key(id_estado) references estado(id)
) engine = InnoDB;

create unique index idx_municipio on municipio(nombre, id_estado);

create table localidad (
	id varchar(40) not null,
	nombre varchar(100) not null,
	id_municipio varchar(40) not null,
	constraint pk_localidad primary key(id),
	constraint fk_l_m_municipio foreign key(id_municipio) references municipio(id)
) engine = InnoDB;

create unique index idx_localidad on localidad(nombre, id_municipio);

create table giro (
	id varchar(40) not null,
	nombre varchar(120) not null,
	constraint pk_giro primary key(id)
) engine = InnoDB;

create unique index idx_giro on giro(nombre);

create table rango_ventas (
	id varchar(40) not null,
	nombre varchar(120) not null,
	constraint pk_rango primary key(id)
) engine = InnoDB;

create unique index idx_rago on rango_ventas(nombre);

-- El nombre de contacto, normalmente es el mismo que la razon social
-- la localidad, se deriva: municipio y estado
create table cliente(
	id varchar(40) not null,
	razon_social varchar(160) not null,
	cliente varchar(120) not null, 
	id_localidad varchar(40) null, 
	calle varchar(100) not null,
	num_int varchar(5) null,
	num_ext varchar(5) null,
	cp varchar(5) not null,
	telefono varchar(15) not null,
	fax varchar(15) not null,
	email varchar(100) null,
	fecha_inicio datetime not null, 
	id_rango varchar(40) not null,
	id_giro varchar(40) not null,
	constraint pk_cliente primary key(id),
	constraint fk_c_r_rango foreign key(id_rango) references rango_ventas(id),
	constraint fk_c_g_giro foreign key(id_giro) references giro(id),
	constraint fk_c_l_localidad foreign key(id_localidad) references localidad(id)
) engine = InnoDB;

-- alter table cliente add constraint fk_c_l_localidad foreign key(id_localidad) references localidad(id); 

create unique index idx_cliente on cliente(razon_social);

create table supervisor (
	id varchar(40) not null,
	nombre varchar(120) not null,
	constraint pk_supervisor primary key(id)
) engine = InnoDB;

create unique index idx_supervisor on supervisor(nombre);

create table visita (
	id varchar(40) not null,
	id_usuario varchar(40) not null, -- El usuario que programó la visita
	id_cliente varchar(40) not null,
	id_supervisor varchar(40) not null, -- El supervisor que se supone realizará la visita
	fecha_programada datetime not null,
	constraint pk_visita primary key(id),
	constraint fk_v_c_cliente foreign key(id_cliente) references cliente(id),
	constraint fk_v_s_supervisor foreign key(id_supervisor) references supervisor(id),
	constraint fk_v_u_usuario foreign key(id_usuario) references usuario(id)
) engine = InnoDB;

-- Es la evaluación que da el supervisor al cliente visitado
-- No son ordenables, pero si cuantificables, por eso es que 
-- existe como entidad
create table nota (
	id varchar(40) not null,
	nombre varchar(40) not null,
	constraint pk_nota primary key(id)
) engine = InnoDB;

create unique index idx_nota on nota(nombre);

create table reporte (
	id varchar(40) not null,
	id_visita varchar(40) not null,
	id_supervisor varchar(40) not null, -- El supervisor que termino realizando la visita
	id_usuario varchar(40) not null, -- El usuario que registro el reporte
	fecha datetime not null,
	id_nota varchar(40) not null,
	observaciones mediumblob null,
	imagen mediumblob null,
	constraint pk_reporte primary key(id),
	constraint fk_r_v_visita foreign key(id_visita) references visita(id),
	constraint fk_r_s_supervisor foreign key(id_supervisor) references supervisor(id),
	constraint fk_r_n_nota foreign key(id_nota) references nota(id),
	constraint fk_re_us_usuario foreign key(id_usuario) references usuario(id)
) engine = InnoDB;




