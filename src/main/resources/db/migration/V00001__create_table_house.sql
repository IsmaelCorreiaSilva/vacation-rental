create table tb_house(
    id uuid not null primary key,
    description varchar(2000) not null,
    price numeric(10,2) not null,
    room int not null,
    bathroom int not null,
    garage int not null,
    accommodate int not null,
    active boolean not null
);