# 💰 Gringotes - Sistema de Carteiras Digitais

Este é um projeto desenvolvido como desafio técnico para a vaga de Pessoa Desenvolvedora Back-end Java no PicPay. O sistema simula transferências entre carteiras digitais, com foco em regras de negócio, validações e arquitetura limpa.

## 🔧 Tecnologias Utilizadas
- Java 21  
- Spring Boot 3  
- Spring Data JPA  
- PostgreSQL  
- Flyway  
- Jakarta Validation  
- HikariCP  
- Maven  
- RESTful APIs  

## 📚 Funcionalidades
- Cadastro de carteiras (Wallet)  
- Tipos de carteira (WalletType: USER e MERCHANT)  
- Regras de negócio para transferência:  
  - Apenas usuários do tipo `USER` podem transferir  
  - MERCHANTS só podem receber  
- Validação de saldo antes da transferência  
- Comunicação com API externa de autorização  
- Notificação assíncrona (simulada) ao recebedor  
- Tratamento de exceções com `ProblemDetail`  

## 📌 Endpoints Principais

### Criar carteira
```
POST /wallets
Content-Type: application/json

{
  "fullName": "Vitor",
  "cpfCnpj": "12345678901",
  "email": "vitor@gmail.com",
  "password": "123",
  "walletType": "USER"
}
```

### Efetuar transferência
```
POST /transfer
Content-Type: application/json

{
  "payer": 1,
  "payee": 2,
  "value": 100.00
}
```

## ⚠️ Regras de Negócio
- MERCHANT não pode transferir dinheiro, apenas receber  
- CPF/CNPJ e Email devem ser únicos  
- Saldo insuficiente gera exceção personalizada  
- Transferências só ocorrem com autorização externa (simulada)  

## 🗂 Estrutura de Pastas
```
src
├── config
├── controller
├── dto
├── entity
├── exception
├── repository
├── service
└── GringotesApplication.java
```

## 🧪 Testes
- Testes manuais com Postman  
- Validação de regras críticas como:
  - Transferência não autorizada
  - Tipo de carteira inválido
  - Dados duplicados

## 📄 Licença
Projeto de uso pessoal, desenvolvido para fins de estudo e desafio técnico.

---

🚀 Desenvolvido por [Wanderson Vitor](mailto:wandersonvitor96@gmail.com)
