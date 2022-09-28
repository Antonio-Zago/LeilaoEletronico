CREATE DATABASE leilao;

USE leilao;

CREATE TABLE TipoImovel(
idTipoImovel BIGINT AUTO_INCREMENT,
nome varchar(30) NOT NULL,
descricao varchar(50),
PRIMARY KEY (idTipoImovel)
);

CREATE TABLE TipoVeiculo(
idTipoVeiculo BIGINT AUTO_INCREMENT,
nome varchar(30) NOT NULL,
descricao varchar(50),
PRIMARY KEY (idTipoVeiculo)
);


CREATE TABLE Imovel(
idImovel BIGINT AUTO_INCREMENT,
endereco varchar(30),
cidade varchar(30),
estado varchar(30),
areaTerreno DOUBLE,
descricao varchar(50),

idTipoImovel BIGINT,
idLeilao BIGINT,
PRIMARY KEY (idImovel)
);

ALTER TABLE Imovel ADD CONSTRAINT `fk_tipo_imovel` FOREIGN KEY ( idTipoImovel ) REFERENCES  tipoImovel ( idTipoImovel ) ;


CREATE TABLE Veiculo(
idVeiculo BIGINT AUTO_INCREMENT,
modelo varchar(30),
ano int,
cor varchar(30),
combustivel varchar(30),
rodagem DOUBLE,
descricao varchar(50),

idTipoVeiculo BIGINT,
idLeilao BIGINT,
PRIMARY KEY (idVeiculo)
);

ALTER TABLE Veiculo ADD CONSTRAINT `fk_tipo_veiculo` FOREIGN KEY ( idTipoVeiculo ) REFERENCES  TipoVeiculo ( idTipoVeiculo ) ;

CREATE TABLE Leilao(
idLeilao BIGINT AUTO_INCREMENT,
dataOcorrencia date,
dominio varchar(30),
endereco varchar(30),
cidade varchar(30),
estado varchar(30),

cnpjEntidadeFinanceira varchar(30),
PRIMARY KEY (idLeilao)
);

ALTER TABLE Veiculo ADD CONSTRAINT `fk_leilao_veiculo` FOREIGN KEY ( idLeilao ) REFERENCES  Leilao ( idLeilao ) ;
ALTER TABLE Imovel ADD CONSTRAINT `fk_leilao_imovel` FOREIGN KEY ( idLeilao ) REFERENCES  Leilao ( idLeilao ) ;


CREATE TABLE EntidadeFinanceira(
cnpjEntidadeFinanceira varchar(30),
nome varchar(30),
agencia varchar(30),
conta varchar(30),


PRIMARY KEY (cnpjEntidadeFinanceira)
);

ALTER TABLE Leilao ADD CONSTRAINT `fk_leilao_entidadeFinanceira` FOREIGN KEY ( cnpjEntidadeFinanceira ) REFERENCES  EntidadeFinanceira ( cnpjEntidadeFinanceira ) ;


CREATE TABLE Lance(
idLance BIGINT AUTO_INCREMENT,
valor double,

cpfCliente VARCHAR(30),
idLeilao BIGINT,

PRIMARY KEY (idLance)
);

ALTER TABLE Lance ADD CONSTRAINT `fk_leilao_lance` FOREIGN KEY ( idLeilao ) REFERENCES  Leilao ( idLeilao ) ;


CREATE TABLE Cliente(
cpfCliente VARCHAR(30),
nome VARCHAR(30),
telefone VARCHAR(30),
cep VARCHAR(30),
email VARCHAR(30),
senha VARCHAR(30),


PRIMARY KEY (cpfCliente)
);

ALTER TABLE Lance ADD CONSTRAINT `fk_cliente_lance` FOREIGN KEY ( cpfCliente ) REFERENCES  Cliente ( cpfCliente ) ;