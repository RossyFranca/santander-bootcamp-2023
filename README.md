[URL PROD](https://santander-bootcamp-2023-api-prd.up.railway.app/swagger-ui/index.html)


# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.franca.santander-bootcamp-2023' is invalid and this project uses 'com.franca.santanderbootcamp2023' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.4/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.4/gradle-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)


May the force be with us

## Class Diagram

```mermaid
classDiagram
  class User {
    +name: String
    +account: Account
    +features: Feature[]
    +card: Card
    +news: News[]
  }

  class Account {
    +number: String
    +agency: String
    +balance: Float
    +limit: Float
  }

  class Feature {
    +icon: String
    +description: String
  }

  class Card {
    +number: String
    +limit: Float
  }

  class News {
    +icon: String
    +description: String
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card 
  User "1" *-- "N" News
```
