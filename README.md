# Bradesco Cloud Native

Java RESTful API criada para o Bootcamp Bradesco Java Cloud Native.

## Principais Tecnologias
- **Java 17**: Utilizei a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
- **Spring Boot 3**: Trabalhei com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração;
- **Spring Data JPA**: Explorarei como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL;
- **OpenAPI (Swagger)**: Criei uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;
- **Railway**: facilita o deploy e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD.


## Diagrama de Classes

```mermaid
classDiagram
    class User {
        String name
        Account account
        Feature[] features
        Card card
        News[] news
    }

    class Account {
        String number
        String agency
        Number balance
        Number limit
    }

    class Feature {
        String icon
        String description
    }

    class Card {
        String number
        Number limit
    }

    class News {
        String icon
        String description
    }

    User "1" *-- "1" Account
    User "1" *-- "N" Feature
    User "1" *-- "1" Card
    User "1" *-- "N" News
```
