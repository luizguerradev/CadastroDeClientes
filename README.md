# 🥷 Sistema de Cadastro de Clientes

Bem-vindo ao **Sistema de Cadastro de Clientes**!
Este projeto é uma aplicação de arquitetura em camadas desenvolvida com **Spring Boot**, projetada para cadastrar ninjas e suas respectivas missões. O projeto utiliza **H2** como banco de dados em memória, 
**Flyway** para migrações de banco de dados e segue boas práticas de desenvolvimento de software como controle de versão com Git e hospedagem de repositório no GitHub. O projeto também conta com alguns extras sobre banco de dados de uma maneira mais profunda.

---

## 📋 Visão Geral do Projeto

Este sistema foi desenvolvido para gerenciar o cadastro de clientes e suas contas. Cada Cliente pode ser atribuído a uma única conta, enquanto uma conta pode ser associada a vários Clientes. As principais funcionalidades incluem:

- **Cadastro de clientes** com nome, idade, email e rank.
- **Atribuição de uma conta** para um cliente.
- **Gerenciamento de conta** e dos clientes associados a elas.

---

## 🛠️ Tecnologias Utilizadas

- **Spring Boot:** Para criação da aplicação web e gerenciamento de dependências.
- **Banco de Dados H2:** Banco de dados em memória para desenvolvimento e testes.
- **Flyway:** Para gerenciamento de migrações do banco de dados.
- **JPA (Java Persistence API):** Para mapeamento objeto-relacional (ORM).
- **Git:** Controle de versão para gerenciamento de mudanças no código.
- **GitHub:** Hospedagem do repositório para controle de versão.
- **Spring Data JPA:** Para interação com o banco de dados.
- **Maven:** Para build e gerenciamento de dependências do projeto.
- **Docker:** Para build externo do banco de dados.
- **SQL:** Manipulação do banco de dados.

---

## 🗄️ Design do Banco de Dados

O esquema do banco de dados segue as seguintes relações:

- **Cliente:** Contém atributos como `id`, `nome`, `idade`, `email` e `rank`.
- **Conta:** Contém atributos como `id`, `título` e `descrição`.

> **Nota sobre o Relacionamento:** Um Cliente pode ter apenas uma Conta, mas uma Conta pode ser atribuída a vários Clientes (Relação 1:N).

---

## 🚀 Configuração

Siga os passos abaixo para rodar o projeto localmente:

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/luizguerradev/CadastroDeClientes.git
   ```

2. **Navegue até o diretório do projeto:**
   ```bash
   cd CadastroDeClientes
   ```

3. **Construa o projeto:**
   ```bash
   mvn clean install
   ```

4. **Execute a aplicação:**
   ```bash
   mvn spring-boot:run
   ```

5. **Acesse a aplicação:**
   Abra o navegador e acesse [http://localhost:8080](http://localhost:8080)
