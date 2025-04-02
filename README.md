# Exercício - API REST de Professores  

Este repositório contém um exercício desenvolvido para a disciplina **Desenvolvimento de Sistemas Computacionais** - **Turma 4A (2025/1)** do **IFSUL - Campus Sapucaia do Sul**.  

## Descrição  

O objetivo do exercício é criar uma **API REST** simples utilizando **Spring Boot**, que permite gerenciar uma lista de professores. A aplicação implementa operações básicas de CRUD (**Create, Read, Update, Delete**) para manipulação dos dados dos professores de forma dinâmica.  

## Tecnologias Utilizadas  

- **Java 17+**  
- **Spring Boot**  
- **Spring Web**  
- **Spring Boot DevTools**  
- **Maven**  

## Funcionalidades  

A API expõe os seguintes endpoints:  

- **POST** `/professores` → Adiciona um novo professor à lista.  
- **GET** `/professores` → Lista todos os professores cadastrados.  
- **GET** `/professores/{id}` → Busca um professor pelo ID.  
- **PUT** `/professores/{id}` → Atualiza os dados de um professor existente.  
- **DELETE** `/professores/{id}` → Remove um professor da lista.  
