-- auto-generated definition
create table user
(
    userId       int auto_increment
        primary key,
    userName     varchar(255) not null,
    userPassword varchar(255) not null,
    userType     int          not null
);

