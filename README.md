# Spring Boot Example
This project is a quick and easy example of using spring boot. It can be shared as a showcase or live coding or demo.

## Dependencies
* JPA for SQL database
* H2 as embedded database
* Web for REST resources

## Model

So far, only one simple `Order` entity.
#### To do
* Item
* Client
* ...

## Architecture

1. JPA Repository as adapter to SQL database - Manipulates entity
2. Service to handle business logic - Manipulates entity
3. Spring MVC REST resource to publish API's - TODO manipulates DTO

## To do

* More model entities with relations
* DTO + mapstruct
* Cache ?
* Docker
* profiles
