
create table topicos(

                         id serial not null,
                         titulo varchar(100) not null,
                         mensaje varchar(300) not null,
                         fecha varchar(100) not null,
                         status boolean not null,
                         autor varchar(100) not null,
                         curso varchar(100) not null,

                         primary key (id)
);