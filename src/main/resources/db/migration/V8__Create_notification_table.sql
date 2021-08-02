create table notification
(
    id int auto_increment,
    notifier int not null,
    receiver int not null,
    "outerId" int not null,
    type int not null,
    gmt_create bigint not null,
    status int default 0 not null,
    constraint NOTIFICATION_PK
        primary key (id)
);
