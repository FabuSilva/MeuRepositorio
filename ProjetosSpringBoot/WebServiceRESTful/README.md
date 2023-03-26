# Construindo um Web Service RESTful

## Projeto baseado na documentação [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/) do spring boot.


Este projeto criará um serviço que aceitará solicitações HTTP GET em http://localhost:8080/greeting. Ele responderá com uma representação JSON de uma saudação, como mostra a listagem a seguir:

{"id":1,"content":"Hello, World!"}
____


Você pode personalizar a saudação com um nameparâmetro opcional na string de consulta, como mostra a listagem a seguir: http://localhost:8080/greeting?name=User 
.O **name** valor do parâmetro substitui o valor padrão de **World** e é refletido na resposta, como mostra a listagem a seguir:

{"id":1,"content":"Hello, User!"}
