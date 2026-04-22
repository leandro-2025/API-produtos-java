# API REST para gerenciamento de produtos e pedidos, com relacionamento entre entidades. - Spring Boot
👨‍💻 Autor

Leandro G. G. Eusébio

## 📌 Descrição
API REST desenvolvida com Spring Boot para gerenciamento de produtos.

Permite realizar operações de CRUD:
- Criar produto
- Listar produtos
- Buscar por ID
- Atualizar produto
- Deletar produto

## 🔗 Relacionamento

A API implementa um relacionamento ManyToMany entre Pedido e Produto:

- Um pedido pode conter vários produtos
- Um produto pode estar em vários pedidos

Ao criar um pedido, a API recebe apenas os IDs dos produtos e busca os dados completos no banco antes de salvar.


---

## 🚀 Tecnologias
- Java 21
- Spring Boot
- Spring Data JPA
- Maven
- H2 Database

---

## 📂 Estrutura do Projeto
- Controller → recebe requisições HTTP  
- Service → lógica de negócio  
- Repository → acesso ao banco  
- Exception → tratamento de erros  

---

## ▶️ Como rodar o projeto

### Pré-requisitos
- Java 21 instalado
- Maven instalado (ou usar o wrapper do projeto)

---

### 🔧 Passos

Clone o repositório:

```bash
git clone https://github.com/leandro-2025/API-produtos-java.git

Entre na pasta do projeto:

cd API-produtos-java

Execute o projeto:

./mvnw spring-boot:run

Ou no Windows:

mvnw.cmd spring-boot:run
🌐 Acesse a API

A aplicação estará disponível em:

http://localhost:8080/produtos
🧪 Testando a API

Você pode utilizar ferramentas como:

Insomnia
Postman

Exemplo de requisição:

POST http://localhost:8080/produtos
{
  "nome": "Teclado",
  "preco": 150,
  "quantidade": 5
}
🗄️ Banco de Dados (H2)

Acesse o console do banco:

http://localhost:8080/h2-console

Configuração padrão:

JDBC URL: jdbc:h2:mem:testdb
User: sa
Password: (vazio)

## 🔥 Endpoints

### 📌 Criar produto
`POST /produtos`

### 📌 Listar produtos
`GET /produtos`

### 📌 Buscar por ID
`GET /produtos/{id}`

### 📌 Atualizar produto
`PUT /produtos/{id}`

### 📌 Deletar produto
`DELETE /produtos/{id}`

---

## 🧪 Exemplo JSON

```json
{
  "nome": "Mouse",
  "preco": 100,
  "quantidade": 10
}
⚠️ Tratamento de Erros
❌ Produto não encontrado (404)
{
  "status": 404,
  "erro": "Produto não encontrado",
  "data": "2026-04-21T..."
}
❌ Erro de validação (400)
{
  "status": 400,
  "erro": "O nome não pode estar vazio",
  "data": "2026-04-21T..."
}

## 📦 Endpoints de Pedido

### 📌 Criar pedido  
`POST /pedidos`

### 📌 Listar pedidos  
`GET /pedidos`

## 🧪 Exemplo de criação de pedido

```json
{
  "cliente": "Leandro",
  "produtos": [
    { "id": 1 },
    { "id": 2 }
  ]
}

```md
## 💡 Observação

Ao criar um pedido, a API não salva apenas os IDs dos produtos.  
Ela busca os produtos no banco de dados para garantir que os dados estejam completos e consistentes.


