create table ke_mu(
id int(6) unsigned auto_increment,
name varchar(256) not null,
primary key(id)
)engine=innodb charset=utf8;

create table ke_shi(
id int(6) unsigned auto_increment,
name varchar(256) not null,
primary key(id)
)engine=innodb charset=utf8;

create table title(
id int(6) unsigned auto_increment,
name varchar(256) not null,
price varchar(8) not null,
primary key(id)
)engine=innodb charset=utf8;

create table doctor(
id int(6) unsigned auto_increment,
name varchar(256) not null,
sex varchar(8) not null,
age varchar(4) not null,
title varchar(128) not null,
ke_mu_name varchar(256) not null,
ke_shi_name varchar(256) not null,
expertise varchar(256) default 'unknown',
introduction varchar(256) default 'unknown',
 primary key(id)
)engine=innodb charset=utf8;

create table doctor_schedule(
id int(6) unsigned auto_increment,
doctor_id id int(6) not null,
building varchar(64) not null,
floor varchar(8) not null,
region varchar(8) not null,
room varchar(8) not null,
schedule_date varchar(64) not null,
detail_time varchar(16) not null,
total_amount varchar(8) not null,
remain_amount varchar(8) not null,
primary key(id)
)engine=innodb charset=utf8;

create table patient(
id int(6) unsigned auto_increment,
name varchar(256) not null,
sex varchar(8) not null,
age varchar(4) not null,
id_card varchar(64) not null,
address varchar(256) not null,
phone varchar(32) not null,
primary key(id)
)engine=innodb charset=utf8;

create table order_record(
id int(6) unsigned auto_increment,
serial_number varchar(8) not null,
patient_id id int(6) not null,
doctor_id id int(6) not null,
schedule_id id int(6) not null,
ke_mu_name varchar(256) not null,
ke_shi_name varchar(256) not null,
price varchar(8) not null,
primary key(id)
)engine=innodb charset=utf8;

create table cancel_order(
id int(6) unsigned auto_increment,
serial_number varchar(8) not null,
patient_id id int(6) not null,
doctor_id id int(6) not null,
schedule_id id int(6) not null,
ke_mu_name varchar(256) not null,
ke_shi_name varchar(256) not null,
price varchar(8) not null,
primary key(id)
)engine=innodb charset=utf8;

create table refund_record(
 id int(6) unsigned auto_increment,
cancel_order_id varchar(10) not null,
finish varchar(4) not null,
primary key(id)
)engine=innodb charset=utf8;

create table patient_login_log(
id int(6) unsigned auto_increment,
patient_id id int(6) not null,
login_time varchar(32) not null,
primary key(id)
)engine=innodb charset=utf8;

create table doctor_login_log(
id int(6) unsigned auto_increment,
doctor_id id int(6) not null,
login_time varchar(32) not null,
primary key(id)
)engine=innodb charset=utf8;
