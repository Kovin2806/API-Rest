CREATE DATABASE apiCuentas;

USE apiCuentas;

-- Creacion tabla Account
CREATE TABLE account (
    id int PRIMARY KEY AUTO_INCREMENT,
    nombreC varchar(80) not null,
    numeroC varchar(80) not null,
    balance DOUBLE NOT NULL,
    activo BOOLEAN NOT NULL
);

-- Inserts de Prueba
INSERT INTO account (nombreC,numeroC, balance, activo) VALUES
    ('Cliente1', '314654767354693', 1000.00, true),
    ('Cliente2', '235235345345117', 1500.00, true),
    ('Cliente3', '679534514513246', 500.00, true),
    ('Cliente4', '347568542323468', 250.00, true),
    ('Cliente5', '125436247658575', 1.03, true);

select * from account;