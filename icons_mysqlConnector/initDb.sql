create database online_store;
use online_store;

create table admin(
	id int NOT NULL AUTO_INCREMENT,
    email varchar(200),
    password varchar(45),
    PRIMARY KEY (id)
);

insert into admin(id,email,password)
values ('1','admin@gmail.com','admin');

create table supplier(
	sid int not null,
    sname varchar(100),
    semail varchar(100),
    spassword varchar(100),
    sphone varchar(15),
    scountry text,
    PRIMARY KEY (sname)
);

create table user(
	uid int NOT NULL auto_increment,
    uname varchar(200),
    uemail varchar(100),
    upassword varchar(100),
    uphone varchar(15),
    usecqus text,
    uans text,
    ucountry text,
    primary key (uid)
);

create table category(
	cid int not null,
    cname varchar(200),
    cdesc text,
    PRIMARY KEY (cname),
    UNIQUE KEY cid_UNIQUE (cid)
);

create table product(
	pid int not null auto_increment,
    pname varchar(200),
    cname varchar(200),
    pqty int,
    pprice double,
    PRIMARY KEY (pid),
    KEY fk_category_name (cname),
    CONSTRAINT fk_category_name foreign key (cname) references category (cname) ON delete cascade on update cascade
);

create table purchase(
	id int not null auto_increment,
    uid int,
    uname varchar(200),
    uphone varchar(15),
    pid int,
    product_name varchar(200),
    qty int,
    price double,
    total double,
    p_date varchar(20),
    uaddress text,
    receive_date varchar(20),
    supplier varchar(200),
    status varchar(45),
    PRIMARY KEY (id),
    KEY fk_user_uid (uid),
    KEY fk_supplier_name (supplier),
    constraint fk_supplier_name foreign key (supplier) references supplier(sname) on delete cascade on update cascade,
    constraint fk_user_uid foreign key (uid) references user (uid) on delete cascade on update cascade
);