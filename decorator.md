## Decorator

Padrão de projeto estrutural que permite que você acople novos comportamentos para objetos ao colocá-los dentro de invólucros de objetos que contém os comportamentos.


### Quando usar

- Utilize o padrão Decorator quando você precisa ser capaz de projetar comportamentos adicionais para objetos em tempo de execução sem quebrar o código que usa esses objetos.

> O Decorator lhe permite estruturar sua lógica de negócio em camadas, criar um decorador para cada camada, e compor objetos com várias combinações dessa lógica durante a execução. O código cliente pode tratar de todos esses objetos da mesma forma, como todos seguem a mesma interface comum.

- Utilize o padrão quando é complicado ou impossível estender o comportamento de um objeto usando herança.

> Muitas linguagens de programação tem a palavra chave final que pode ser usada para prevenir a extensão de uma classe. Para uma classe final, a única maneira de reutilizar seu comportamento existente seria envolver a classe com seu próprio invólucro usando o padrão Decorator.

### Estrutura

![Estrutura Decorator](https://refactoring.guru/images/patterns/diagrams/decorator/structure.png)

<sub><sup>* imagem de https://refactoring.guru</sup></sub>

### Prós

- Você pode estender o comportamento de um objeto sem fazer um nova subclasse.

- Você pode adicionar ou remover responsabilidades de um objeto no momento da execução.

- Você pode combinar diversos comportamentos ao envolver o objeto com múltiplos decoradores.

- Princípio de responsabilidade única. Você pode dividir uma classe monolítica que implementa muitas possíveis variantes de um comportamento em diversas classes menores.

### Contras

- É difícil remover um invólucro de uma pilha de invólucros.

- É difícil implementar um decorador de tal maneira que seu comportamento não dependa da ordem do pilha de decoradores.

- A configuração inicial do código de camadas pode ficar bastante feia.

#### Mais informações

[Refactoring.Guru / Decorator](https://refactoring.guru/pt-br/design-patterns/decorator)

### Código de exemplo em java

Decoradores de codificação e compactação

Este exemplo mostra como você pode ajustar o comportamento de um objeto sem alterar seu código.

Inicialmente, a classe de lógica de negócio só podia ler e gravar dados em texto sem formatação. Em seguida, criamos várias pequenas classes de wrapper que adicionam novo comportamento após a execução de operações padrão em um objeto empacotado.

O primeiro wrapper criptografa e descriptografa dados, e o segundo compacta e extrai dados.

Você pode até combinar esses invólucros envolvendo um decorador com outro.

> src/main/java/br/com/hioktec/designpatterns/estruturais/decorator
