CREATE DATABASE CAFEINA;

USE CAFEINA;

CREATE TABLE UNIDADES(
    id INT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(15) NOT NULL,
    logradouro VARCHAR(45) NOT NULL,
    numero VARCHAR(10),
    telefone VARCHAR(20),
    PRIMARY KEY (id)
);

CREATE TABLE CATEGORIAS(
    id INT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(15) NOT NULL,
    id_categoria INT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_categoria) REFERENCES CATEGORIAS (id)
); 

CREATE TABLE LABORATORIOS(
    id INT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(15) NOT NULL,
    sala VARCHAR(10),
    id_unidade INT NOT NULL,
    capacidade INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_unidade) REFERENCES UNIDADES (id)
);

CREATE TABLE RELACAO_UNIDADES_CATEGORIAS(
    id INT AUTO_INCREMENT NOT NULL,
    id_unidade INT NOT NULL,
    id_categoria INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_unidade) REFERENCES UNIDADES (id),
    FOREIGN KEY (id_categoria) REFERENCES CATEGORIAS (id)
);

CREATE TABLE RELACAO_CATEGORIAS_LABORATORIOS(
    id INT AUTO_INCREMENT NOT NULL,
    id_categoria INT NOT NULL,
    id_laboratorio INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_categoria) REFERENCES CATEGORIAS (id),
    FOREIGN KEY (id_laboratorio) REFERENCES LABORATORIOS (id)
);

CREATE TABLE TIPOS(
    id INT AUTO_INCREMENT NOT NULL,
    tag VARCHAR(200) NOT NULL,
    descricao VARCHAR(1000),
    PRIMARY KEY (id)
);

CREATE TABLE USUARIOS(
    id INT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(45) NOT NULL,
    cpf VARCHAR(15) NOT NULL,
    email VARCHAR(45) NOT NULL,
    senha VARCHAR(32) NOT NULL,
    id_tipo INT NOT NULL,
    FOREIGN KEY (id_tipo) REFERENCES TIPOS (id)
);

CREATE PREFERENCIAS(
    id INT AUTO_INCREMENT NOT NULL,
    id_usuario INT NOT NULL,
    id_unidade INT NOT NULL,
    id_categoria INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_unidade) REFERENCES UNIDADES (id),
    FOREIGN KEY (id_usuario) REFERENCES USUARIOS (id),
    FOREIGN KEY (id_categoria) REFERENCES CATEGORIAS (id)
);

CREATE TABLE EVENTOS(
    id INT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(45) NOT NULL,
    descricao VARCHAR(100) NOT NULL,
    data DATE NOT NULL,
    duracao VARCHAR(6) NOT NULL,
    tamanho_turma INT NOT NULL,
    periodo_inscricao INT NOT NULL,
    id_mentor INT NOT NULL,
    id_administrador INT,
    id_tipo INT NOT NULL,
    status TINYINT(1) NOT NULL,
    id_categoria INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_mentor) REFERENCES USUARIOS (id),
    FOREIGN KEY (id_administrador) REFERENCES USUARIOS (id),
    FOREIGN KEY (id_tipo) REFERENCES TIPOS (id),
    FOREIGN KEY (id_categoria) REFERENCES CATEGORIAS (id)
);

CREATE TABLE INSCRICOES(
    id INT AUTO_INCREMENT NOT NULL,
    data DATE NOT NULL,
    status INT NOT NULL,
    id_usuario INT NOT NULL,
    id_evento INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_usuario) REFERENCES USUARIOS (id),
    FOREIGN KEY (id_evento) REFERENCES EVENTOS (id),
    FOREIGN KEY (status) REFERENCES TIPOS (id)
);

CREATE TABLE FEEDBACK(
    id INT AUTO_INCREMENT NOT NULL,
    pergunta VARCHAR(10000) NOT NULL,
    resposta VARCHAR(10000) NOT NULL,
    id_evento INT NOT NULL,
    id_maker INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_evento) REFERENCES EVENTOS (id),
    FOREIGN KEY (id_usuario) REFERENCES USUARIOS (id)
);

CREATE TABLE LOG(
    id INT AUTO_INCREMENT NOT NULL,
    funcao VARCHAR(10000) NOT NULL,
    data DATE NOT NULL,
    id_usuario INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_usuario) REFERENCES USUARIOS (id)
);

