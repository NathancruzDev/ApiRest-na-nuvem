# Projeto Digital Banking✔ - Com Implementação Pix🔑



## 📌 Visão Geral
Projeto desenvolvido como parte do curso da Digital Innovation One, com a **contribuição adicional** da funcionalidade Pix, incluindo:
- Gerenciamento de chaves Pix (CPF, e-mail, telefone)
- Geração de QR Codes para pagamentos
- Integração com o sistema bancário existente
  
## 🌟 Minha Contribuição
### Implementação do Módulo Pix
Desenvolvi **o subsistema Pix**, uma funcionalidade **deixada de lado na projeto da aula**.
### Endpoint Especializado
Criei um endpoint RESTful para consulta segura de usuários e suas chaves apartir do **DTO**.

## 🛠️ Tecnologias
- **Backend**:
  - Java 17
  - Spring Boot 3.2.6
  - Spring Data JPA
  - Hibernate Validator
- **Banco de Dados**:
  - PostgreSQL (Produção - Railway)
  - H2 (Testes locais)
- **Ferramentas**:
  - Railway (Deploy)
  - Git/GitHub (Versionamento)
[![Java](https://img.shields.io/badge/Java-17+-blue.svg)](https://java.com)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2.6-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue.svg)](https://www.postgresql.org)
[![Railway](https://img.shields.io/badge/Deployed_on-Railway-6441a5.svg)](https://railway.app)

## 📌 Diagrama de Entidades
```mermaid
classDiagram
class Cliente {
-String name
-Account account
-Feature[] features
-Card card
-News[] news
}

class Account {
-String number
-String agency
-Double balance
-Double limit
-Pix[] pixKeys
}

class Feature {
-String icon
-String description
}

class Pix {
-String key
-String QRCODE
+transfer(Double amount)
}

class Card {
-String number
-Double limit
}

class News {
-String icon
-String description
}

Cliente "1" *-- "1" Account : composition
Cliente "1" *-- "1" Card : composition
Cliente "1" *-- "*" Feature : aggregation
Cliente "1" *-- "*" News : aggregation
Account "1" *-- "*" Pix : composition
```
## 📌 Template que o projeto foi baseado.
![Template Original](template.png) 
