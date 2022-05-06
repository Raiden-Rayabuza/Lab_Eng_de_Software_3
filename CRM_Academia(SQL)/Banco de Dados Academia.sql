CREATE DATABASE academia
GO
USE academia

CREATE TABLE funcionario(
id_funcionario			INT			IDENTITY(1,1)	NOT NULL,
nome_func				VARCHAR(50)		NOT NULL,
sexo					VARCHAR(30)		NOT NULL,
data_nasc				DATETIME		NOT NULL,
RG						INT				NOT NULL,
CPF						INT				NOT NULL,
celular					INT				NOT NULL,
telefone				INT				NOT NULL,
email					INT				NOT NULL,
usuario					VARCHAR(50)		NULL,
senha					VARCHAR(50)		NULL,
tipo_funcionario		INT				NULL,
PRIMARY KEY (id_funcionario)
);

CREATE TABLE cliente(
id_cliente				INT			IDENTITY(1,1)	NOT NULL,
nome_cliente			VARCHAR(50)		NOT NULL,
sexo					CHAR(1)			NOT NULL,
data_nasc				DATETIME		NOT NULL,
RG						INT				NOT NULL,
CPF						INT				NOT NULL,
celular					INT				NOT NULL,
telefone				INT				NOT NULL,
email					VARCHAR(70)		NOT NULL,
PRIMARY KEY (id_cliente)
);

CREATE TABLE contrato_tipo(
id_contrato				INT		IDENTITY(1,1)		NOT NULL,
tipo_contrato			VARCHAR(30)		NOT NULL,
PRIMARY KEY (id_contrato),
);

INSERT INTO contrato_tipo(tipo_contrato) VALUES('Cliente')
INSERT INTO contrato_tipo(tipo_contrato) VALUES('Funcionário')

CREATE TABLE contrato_cliente(
id_contrato				INT				NOT NULL,
tipo_contrato			VARCHAR(30)		NOT NULL,
data_inicio				DATETIME		NOT NULL,
data_final				DATETIME		NOT NULL,
valor					DECIMAL(7,2)	NOT NULL,
modelo_pagamento		VARCHAR(30)		NOT NULL,
informacoes_adicionais	VARCHAR(MAX)	NULL,
PRIMARY KEY (id_contrato),
FOREIGN KEY (tipo_contrato) REFERENCES contrato_tipo(tipo_contrato),
FOREIGN KEY (id_cliente) REFERENCES funcionario(id_funcionario),
);

CREATE TABLE contrato_funcionário(
id_contrato				INT				NOT NULL,
data_inicio				DATETIME		NOT NULL,
data_final				DATETIME		NOT NULL,
tipo_contrato			VARCHAR(30)		NOT NULL,
valor					DECIMAL(7,2)	NOT NULL,
modelo_pagamento		VARCHAR(30)		NOT NULL,
informacoes_adicionais	VARCHAR(MAX)	NULL,
id_funcionario			INT				NULL,
id_cliente				INT				NULL,
PRIMARY KEY (id_contrato),
FOREIGN KEY (tipo_contrato) REFERENCES contrato_tipo(tipo_contrato),
FOREIGN KEY (id_cliente) REFERENCES funcionario(id_funcionario),
);
CREATE TABLE contrato(
id_contrato				INT				NOT NULL,
tipo_contrato			VARCHAR(30)		NOT NULL,
PRIMARY KEY (id_contrato),
FOREIGN KEY (tipo_contrato) REFERENCES contrato_tipo(tipo_contrato),
FOREIGN KEY (id_contrato) REFERENCES funcionario(id_funcionario)
);

CREATE TABLE aula(
id_aula					INT				NOT NULL,
nome_aula				VARCHAR(50),
horario					TIME,
id_contrato				INT,
PRIMARY KEY (id_aula),
FOREIGN KEY (id_contrato) REFERENCES contrato(id_contrato)
)

CREATE TABLE funcionario_aula(
id_funcionario			INT,
id_aula					INT,
PRIMARY KEY (id_funcionario, id_aula),
FOREIGN KEY (id_funcionario) REFERENCES funcionario(id_funcionario),
FOREIGN KEY (id_aula) REFERENCES aula(id_aula)
)

CREATE TABLE cliente_aula(
id_cliente				INT,
id_aula					INT,
PRIMARY KEY (id_cliente, id_aula),
FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente),
FOREIGN KEY (id_aula) REFERENCES aula(id_aula)
)