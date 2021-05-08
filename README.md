# DSVendas 
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/webfaria/projeto-sds3/blob/main/LICENSE) 

# Sobre o projeto

https://cleber-dsvendas.netlify.app/

DSVendas é uma aplicação web construída durante a 3ª edição da **Semana DevSuperior** (#sds3), evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

A aplicação consiste em uma analise de desempenho de vendas realizadas por diferentes perspectivas, que apresenta gráficos com taxa de sucesso em % e total das vendas  por vendedor.


## Layout Home
![Web 1]()

## Layout Dashboard
![Web 2]()

## Modelo conceitual
![Modelo Conceitual](https://github.com/devsuperior/bds-assets/blob/main/sds/sds3-mc.png)

## Modelo arquitetural
![Modelo Conceitual](https://github.com/devsuperior/bds-assets/blob/main/sds/camadas.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Front end
- HTML / CSS / JS / TypeScript
- ReactJS
- Apex Charts
## Implantação em produção
- Back end: Heroku
- Front end web: Netlify
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/webfaria/projeto-sds3.git

# entrar na pasta do projeto por nome projeto-sds3
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/webfaria/projeto-sds3.git

# entrar na pasta do projeto nome projeto-sds3
cd frontend

# instalar dependências
yarn install

# executar o projeto
yarn start
```

# Autor

Cleber Faria

https://www.linkedin.com/in/webfaria
