CREATE TABLE categories(
    id bigserial primary key
   ,title varchar(255)
   ,createdAt timestamp default current_timestamp
   ,updateAT timestamp default current_timestamp );

insert into categories (title) values ('Food');

CREATE TABLE products(
    id bigserial primary key
   ,title varchar (255)
   ,price int
   ,category_id bigint references categories (id)
   ,createdAt timestamp default current_timestamp
   ,updateAT timestamp default current_timestamp  );

insert into products (title, price, category_id)
values ('Milk', 85, 1),
       ('Bread', 25, 1),
       ('Cheese', 450, 1),
       ('Milk', 85, 1),
       ('Bread', 25, 1),
       ('Cheese', 450, 1),
       ('Milk', 85, 1),
       ('Bread', 25, 1),
       ('Cheese', 450, 1),
       ('Milk', 85, 1),
       ('Bread', 25, 1),
       ('Cheese', 450, 1),
       ('Milk', 85, 1),
       ('Bread', 25, 1),
       ('Cheese', 450, 1),
       ('Milk', 85, 1),
       ('Bread', 25, 1),
       ('Cheese', 450, 1),
       ('Milk', 85, 1),
       ('Bread', 25, 1),
       ('Cheese', 450, 1),
       ('Milk', 85, 1),
       ('Bread', 25, 1),
       ('Cheese', 450, 1);