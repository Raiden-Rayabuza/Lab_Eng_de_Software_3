CREATE DATABASE academia
GO
USE academia

CREATE TABLE funcionario(
id_funcionario			INT				NOT NULL,
usuario					VARCHAR(50)		NULL,
senha					VARCHAR(50)		NULL,
salario					DECIMAL(7,2)	NOT NULL,
tipo_funcionario		INT				NULL,
PRIMARY KEY (id_funcionario),
FOREIGN KEY (id_funcionario) REFERENCES pessoas(id_pessoa)
);

CREATE  TABLE pessoas(
id_pessoa				INT			IDENTITY(1,1)	NOT NULL,
nome_pessoa				VARCHAR(50)		NOT NULL,
sexo					CHAR(1)			NOT NULL,
data_nasc				DATETIME		NOT NULL,
RG						VARCHAR(11)		NOT NULL,
CPF						CHAR(11)		NOT NULL,
celular					CHAR(11)		NOT NULL,
telefone				CHAR(10)		NOT NULL,
email					VARCHAR(70)		NOT NULL,
tipo_pessoa				VARCHAR(30)		NOT NULL,
PRIMARY KEY (id_pessoa)
);

CREATE TABLE cliente(
id_cliente	 INT	NOT NULL,
PRIMARY KEY (id_cliente),
FOREIGN KEY (id_cliente) REFERENCES pessoas(id_pessoa)
);

CREATE TABLE instrutor(
id_instrutor	 INT	NOT NULL,
PRIMARY KEY (id_instrutor),
FOREIGN KEY (id_instrutor) REFERENCES pessoas(id_pessoa)
);

CREATE TABLE contrato_cliente(
id_contrato				INT				NOT NULL,
id_cliente				INT				NOT NULL,
id_aulas				INT				NOT NULL,
modelo_pagamento		VARCHAR(30)		NOT NULL,
valor_a_pagar			DECIMAL(7,2)	NOT NULL,
PRIMARY KEY (id_contrato),
FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente),
FOREIGN KEY (id_aulas) REFERENCES aulas(id_aula),
FOREIGN KEY (id_contrato) REFERENCES contrato(id_contrato),
);

CREATE TABLE contrato_funcionário(
id_contrato				INT				NOT NULL,
id_funcionario			INT				NOT NULL,
salario					DECIMAL(7,2)	NOT NULL,		
PRIMARY KEY (id_contrato),
FOREIGN KEY (id_funcionario) REFERENCES funcionario(id_funcionario),
FOREIGN KEY (id_contrato) REFERENCES contrato(id_contrato),
);

CREATE TABLE contrato(
id_contrato				INT		IDENTITY(1,1)	NOT NULL,
tipo_contrato			VARCHAR(30)				NOT NULL,
data_inicio				DATETIME				NOT NULL,
data_final				DATETIME				NOT NULL,
informacoes_adicionais	VARCHAR(MAX)			NULL,
PRIMARY KEY (id_contrato),
);

CREATE TABLE aula(
id_aula					INT			IDENTITY(1,1)	NOT NULL,
nome_aula				VARCHAR(50)		NOT NULL,
horario					TIME			NOT NULL,
id_instrutor			INT				NOT NULL,
PRIMARY KEY (id_aula),
FOREIGN KEY (id_instrutor) REFERENCES instrutor(id_instrutor),
)