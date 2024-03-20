# Rest API

Uma API (Application Programming Interface) é uma interface que conecta usuários e serviços à um propósito oferecido por uma aplicação sem que haja necessidade de que o cliente saiba como é a implementação do serviço oferecido.
Dessa forma, os serviços são oferecidos de uma forma abstrata para os requisitantes de forma que só necessitem saber como se comunicar com a API desejada.

No caso das API Rest ou Restful, é necessário que a API siga as restrições da arquitetura Rest (Representational State Transfer). A comunicação com uma API Rest é feita por meio do HTTP utilizando formatos como JSON, HTML, PHP,...
para transferir uma representação do estado do recurso ao solicitante ou endpoint por meio de informações armazenadas no cabeçalho ou nos parâmetros da requisição. Nas requisições temos informações como metadados, permissão, cache, cookies e informações pertinentes à requisição.

De forma geral, o uso das API Rest são consideravelmente boas e adotadas por serem mais rápidas, leves e escaláveis em relação às outras alternativas.

Critérios de conformidade para ser considerado uma API Restful:

- A API deve estar no modelo cliente/servidor.
- Deve estabelecer uma conexão stateless com o cliente. Ou seja, entre uma requisição e outra, do tipo GET, feitas pelo mesmo cliente, nenhuma informação do cliente é salva e não existe nenhuma conexão entre elas.
- São armazenados dados em cache para otimizar a comunicação entre cliente e servidor.
- Ter um sistema de camadas que organiza os tipos de servidores e distribui as responsabilidades em hierarquias desconhecidas pelo cliente.
- Capacidade de enviar código sob demanda para o cliente, de forma que a API consiga ampliar as funcionalidades disponíveis para o cliente quando solicitado.

## Referências

-  https://www.redhat.com/pt-br/topics/api/what-are-application-programming-interfaces
-  https://www.redhat.com/pt-br/topics/api/what-is-a-rest-api
