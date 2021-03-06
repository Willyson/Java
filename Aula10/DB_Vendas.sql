CREATE DATABASE VENDAS; 

USE VENDAS;

CREATE TABLE CLIENTES 
(
    CODCLI  INT AUTO_INCREMENT, 
    NOME    VARCHAR(40),
    ENDER   VARCHAR(45),
    BAIRRO  VARCHAR(20),
    CIDADE  VARCHAR(20),
    CEP     VARCHAR(9),
    UF      CHAR(2),
    EMAIL   VARCHAR(30),
    FONE    VARCHAR(10),
    CELULAR VARCHAR(10),

    PRIMARY KEY(CODCLI)
);

CREATE TABLE PRODUTOS
(
    CODPROD      INT, 
    DESCRICAO    VARCHAR(30),
    PRECO        NUMERIC(10,2),
    UNIDADE      CHAR(2),
    QTDE_INICIAL NUMERIC(10,2),
    DATA_CAD     DATETIME, 
    QTDE_ATUAL   NUMERIC(10,2),

     PRIMARY KEY (CODPROD)
);


CREATE TABLE PEDIDOS
(
    CODPED     INT,
    CODCLI     INT,
    DATA       DATETIME, 

    PRIMARY KEY (CODPED),
    FOREIGN KEY (CODCLI) REFERENCES CLIENTES (CODCLI)
);

CREATE TABLE ITENS_PED
(
    CODPED  INT, 
    CODPROD INT,
    QTDE    NUMERIC(10,2),

    FOREIGN KEY(CODPED)  REFERENCES PEDIDOS(CODPED),
    FOREIGN KEY(CODPROD) REFERENCES PRODUTOS(CODPROD)
);