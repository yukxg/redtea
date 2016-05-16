# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  username                      varchar(255) not null,
  firstname                     varchar(255),
  lastname                      varchar(255),
  address                       varchar(255),
  constraint pk_user primary key (username)
);


# --- !Downs

drop table if exists user;

