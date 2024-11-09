README - API ToDoList
Descrição
A API ToDoList é uma aplicação RESTful desenvolvida em Java com o objetivo de gerenciar listas de tarefas. O projeto foi construído com uma arquitetura em camadas para garantir manutenção e expansão facilitadas, utilizando diversas tecnologias robustas e amplamente adotadas na indústria.

Tecnologias Utilizadas
1. Java
Linguagem de programação principal utilizada para o desenvolvimento da API.
2. Spring Boot
Framework que facilita a criação de aplicações Java.
Utilizado para configurar e iniciar a aplicação com dependências mínimas.
3. Spring Boot DevTools
Ferramenta que oferece funcionalidades de desenvolvimento, como reinicialização automática e atualizações em tempo real, agilizando o processo de desenvolvimento.
4. Spring Web
Módulo do Spring que fornece suporte para o desenvolvimento de aplicações web e exposição de APIs RESTful.
5. JPA (Java Persistence API)
Utilizado para mapear as classes Java para tabelas no banco de dados relacional.
Oferece uma forma padronizada de persistência de dados em Java.
6. Hibernate
Implementação do JPA que facilita o gerenciamento de dados no banco de dados.
Oferece suporte para mapeamento objeto-relacional (ORM).
7. SQL Server
Banco de dados relacional utilizado para armazenar as informações das tarefas.
Conectado à aplicação através do Hibernate para persistência de dados.
Estrutura do Projeto
A API ToDoList foi estruturada em camadas para separar as responsabilidades e manter o código organizado. As principais camadas do projeto são:

1. Model
Contém as classes que representam as entidades do banco de dados.
Exemplo: Task.
2. Repository
Interface que estende JpaRepository para fornecer métodos de operações de CRUD.
Responsável por se comunicar com o banco de dados.
3. Service
Contém a lógica de negócios da aplicação.
Faz a ponte entre as camadas Repository e Controller.
4. Controller
Camada responsável por receber as requisições HTTP e retornar as respostas apropriadas.
Exemplo: mapeamento de endpoints como GET, POST, PUT, DELETE.
API REST
A API segue os princípios RESTful, garantindo operações padronizadas e fácil integração com clientes externos.
