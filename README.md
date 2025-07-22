# API (Interface de Programação de Aplicações) de Tarefa
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![Postman](https://img.shields.io/badge/Postman-FF6C37.svg?style=for-the-badge&logo=Postman&logoColor=white)

Este projeto é uma API (Interface de Programação de Aplicações) para um sistema de gerenciamento de pedidos de comida, onde cada pedido deve ter um nome do cliente, um endereço de entrega, um valor total e uma lista de itens pedidos. Os usuários podem criar, editar e excluir pedidos, que serão operações CRUD, utilizando JAVA, Spring Boot, com documenção Swagger, conforme solicitado nos exercícios do Curso TI 360 TECH - Formação de Profissional 4.0, do Weslley Borges - Executivo de TI, para obter maior conhecimento na linguagem.

## Responsabilidades da API (Interface de Programação de Aplicações)
- Retornar uma lista de todas as comidas cadastradas,
- Retornar a comida cadastradas, filtrando por código, retornando "OK - Tarefa Encontrada", "ERRO - Tarefa não localizada" ou "Erro Inesperado,
- Cadastrar novas comidas,
- Excluir comidas cadastradas.

## Ferramenta utilizada para realização de testes
Para verificar se o código estava funcionando corretamente foi utilizada as Ferramentas POSTMAN e SWAGGER, apresentando a mensagem abaixo relacionada no Body do cadastro:

{

    "id": 1,
    "Nome do Cliente": "Teste",
    "Endereço de entrega": "Teste",
    "Valor total": "78,94",
    "Pedido": "Teste"    
}
