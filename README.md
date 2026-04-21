# API de Produtos - Spring Boot

## 📌 Descrição
API REST desenvolvida com Spring Boot para gerenciamento de produtos.

Permite realizar operações de CRUD:
- Criar produto
- Listar produtos
- Buscar por ID
- Atualizar produto
- Deletar produto

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

👨‍💻 Autor

Leandro G. G. Eusébio

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
