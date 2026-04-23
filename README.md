# API de Produtos e Pedidos e que calcula o valor total desses pedidos - Spring Boot

🔥 Autor

Leandro G. G. Eusébio

## 📌 Descrição
API REST desenvolvida com Spring Boot para gerenciamento de produtos e pedidos.

Permite realizar operações de CRUD de produtos e também a criação de pedidos com múltiplos produtos associados, e calcula o valor total.

---

## 🚀 Tecnologias
- Java 21
- Spring Boot
- Spring Data JPA
- Maven
- H2 Database

---

## 📂 Estrutura do Projeto
- **Controller** → recebe requisições HTTP
- **Service** → contém a lógica de negócio
- **Repository** → acesso ao banco de dados
- **Model** → representa as entidades
- **Exception** → tratamento global de erros

---

## 🔗 Relacionamento

A API implementa um relacionamento **ManyToMany** entre Pedido e Produto:

- Um pedido pode conter vários produtos  
- Um produto pode estar em vários pedidos  

Ao criar um pedido, a API recebe apenas os IDs dos produtos e busca os dados completos no banco antes de salvar.

---

## 💰 Cálculo de Total

O total do pedido é calculado automaticamente no backend com base no preço e quantidade dos produtos.

Isso garante segurança e evita manipulação de valores pelo cliente.

---

## 🔥 Endpoints de Produto

📌 Criar produto  
`POST /produtos`

📌 Listar produtos  
`GET /produtos`

📌 Buscar por ID  
`GET /produtos/{id}`

📌 Atualizar produto  
`PUT /produtos/{id}`

📌 Deletar produto  
`DELETE /produtos/{id}`

---

## 📦 Endpoints de Pedido

📌 Criar pedido  
`POST /pedidos`

📌 Listar pedidos  
`GET /pedidos`

---

## 🧪 Exemplo JSON - Produto

```json
{
  "nome": "Mouse",
  "preco": 100,
  "quantidade": 10
}
## 🧪 Exemplo JSON - Pedido
{
  "cliente": "Leandro",
  "produtos": [
    { "id": 1 },
    { "id": 2 }
  ]
}
⚠️ Tratamento de Erros
Produto não encontrado
{
  "status": 404,
  "erro": "Produto não encontrado",
  "data": "2026-04-21T..."
}
Erro de validação
{
  "status": 400,
  "erro": "O nome não pode estar vazio",
  "data": "2026-04-21T..."
}
💡 Observação

Ao criar um pedido, a API não salva apenas os IDs dos produtos.
Ela busca os produtos no banco de dados para garantir que os dados estejam completos e consistentes.

🚀 Como rodar o projeto
git clone https://github.com/leandro-2025/API-produtos-java.git
cd produtos
./mvnw spring-boot:run

A API estará disponível em:

http://localhost:8080



