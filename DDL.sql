create schema springboot;

use springboot;

create user 'root'@'localhost' identified by 'wMKxUp6f3FRJFNYbWFJv';

grant select, insert, delete, update on springboot.* to root@'localhost';

create table alunos (
  usr_id bigint unsigned not null auto_increment,
  usr_nome varchar(20) not null,
  usr_senha varchar(50) not null,
  primary key (usr_id)
);