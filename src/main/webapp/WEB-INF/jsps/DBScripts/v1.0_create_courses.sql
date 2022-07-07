DROP DATABASE  IF EXISTS IndustryTech;
create database IndustryTech;
SET search_path TO IndustryTech;

DROP SCHEMA IF EXISTS technologies;
create schema technologies;
SET search_path TO "technologies";

create table technologies.course
(
    id            serial
        constraint course_pk
            primary key,
    name          varchar not null,
    duration      int,
    fees          int,
    created_date  timestamp,
    modified_date timestamp,
    created_by    varchar,
    modified_by   varchar
);

create unique index course_id_uindex
    on technologies.course (id);