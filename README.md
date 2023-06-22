### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com

# DSList [![NPM](https://img.shields.io/npm/l/react)](https://github.com/RenataHassum/dslist/blob/main/LICENSE) 

# Sobre o projeto

O DS List é um projeto backend construída com Spring Boot durante o Intensivão Java Spring desenvolvido pela instituição de ensino <a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a>

O projeto DSList consiste em uma pesquisa de jogos que permite aos usuários encontrar informações sobre diferentes games, oferecendo recursos de busca com base no gênero e na classificação dos jogos.

Além disso, possui a funcionalidade de reorganizar a lista de jogos de acordo com suas preferências, simplesmente segurando e soltando o card do jogo no front-end (atualmente, o front-end ainda não está implementado).

## Frontend
![Frontend](https://github.com/RenataHassum/assets/blob/main/dslist_assets/frontend1.jpg?raw=true)
![Frontend](https://github.com/RenataHassum/assets/blob/main/dslist_assets/frontend2.jpg?raw=true)

## Modelo conceitual
![Modelo Conceitual](https://github.com/RenataHassum/assets/blob/main/dslist_assets/modelo%20conceitual.jpg?raw=true)

## Padrão camadas
![Padrão camadas](https://github.com/RenataHassum/assets/blob/main/padrao_camadas.jpg?raw=true)

# Passo a passo Postman Collection

## [![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/22138191-c96baf43-77a2-4b69-9d4c-3fe8d88f6e6c?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D22138191-c96baf43-77a2-4b69-9d4c-3fe8d88f6e6c%26entityType%3Dcollection%26workspaceId%3D80b2643a-b237-4b8d-9a9c-6bc3311a77f4)

## Não é necessário realizar a configuração de ambiente do projeto

## Games / Genres endpoints
#### Liberado para todos os usuários

`GET Games List`
- Retorna a lista completa de jogos

`GET Game by ID`
- Retorna as informações de um jogo específico com base no seu ID

`GET Genre List`
- Retorna os gêneros dos videogames disponíveis

`GET Games by list of genre ID`
- Retorna os jogos que pertencem a um gênero específico, com base no ID do gênero

`POST Games List replacement`
- Permite que o usuário organize a lista de jogos de acordo com sua preferência, definindo a ordem dos jogos no front-end através de ações de arrastar e soltar
- Após a requisição ser concluída com sucesso (código de resposta '200'), confirme no endpoint `GET Games by list of genre ID` que as posições dos jogos de ID 8, 9 e 10 tenham sido alteradas

# Opcional clone do projeto
```bash
# Pré-requisitos: Java 17
# clonar repositório
git clone git@github.com:RenataHassum/dslist.git

# entrar na pasta do projeto back end
cd dslist
cd backend

# executar o projeto
./mvnw spring-boot:run
```

# Tecnologias | Implantação em produção
## Backend
- Java
- Springboot
- JPA / Hibernate
- Maven
- H2 Database
- PostgreSQL
- ORM
- Implantação backend: Railway
- Implantação banco de dados: Postgresql

# Técnicas | Competências
- Monorepositório Git
- Modelo Conceitual com ORM e Seed de Banco de Dados: Utiliza mapeamento objeto-relacional (ORM)
- Arquitetura em Camadas: Segue uma arquitetura em camadas bem organizada, promovendo separação de responsabilidades e manutenibilidade
- Web Services RESTful: Implementa web services RESTful, seguindo o padrão DTO para transferência de dados
- Operações CRUD completas: Criar, Ler, Atualizar, Excluir, Procurar
- Tratamento de Exceções: Utiliza mecanismos para tratar exceções e fornecer mensagens de erro claras aos usuários
- Consultas ao Banco de Dados com JPA, JPQL e SQL: abordando o problema das consultas N+1

# Agradecimentos
<a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a> - Professor Nélio Alves

# Autora
### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com
Fico à disposição para qualquer esclarecimento, não hesite em me contatar
