## Facade

Padrão de projeto estrutural que fornece uma interface simplificada para uma biblioteca, um framework, ou qualquer conjunto complexo de classes.

### Quando usar

- Utilize o padrão Facade quando você precisa ter uma interface limitada mas simples para um subsistema complexo.

> Com o passar do tempo, subsistemas ficam mais complexos. Até mesmo aplicar padrões de projeto tipicamente leva a criação de mais classes. Um subsistema pode tornar-se mais flexível e mais fácil de se reutilizar em vários contextos, mas a quantidade de códigos padrão e de configuração que ele necessita de um cliente cresce cada vez mais. O Facade tenta consertar esse problema fornecendo um atalho para as funcionalidades mais usadas do subsistema que corresponde aos requerimentos do cliente.

- Utilize o Facade quando você quer estruturar um subsistema em camadas.

> Crie fachadas para definir pontos de entrada para cada nível de um subsistema. Você pode reduzir o acoplamento entre múltiplos subsistemas fazendo com que eles se comuniquem apenas através de fachadas.

### Estrutura

![Estrutura Facade](https://refactoring.guru/images/patterns/diagrams/facade/structure.png)

<sub><sup>* imagem de https://refactoring.guru</sup></sub>

### Prós

- Você pode isolar seu código da complexidade de um subsistema.

### Contras

- Uma fachada pode se tornar um objeto deus acoplado a todas as classes de uma aplicação.

#### Mais informações

[Refactoring.Guru / Facade](https://refactoring.guru/pt-br/design-patterns/facade)

### Código de exemplo em java

Interface simples para uma biblioteca de conversão de vídeo complexa

Neste exemplo, o Facade simplifica a comunicação com uma estrutura complexa de conversão de vídeo.

O Facade fornece a uma única classe com um método único que lida com toda a complexidade de configurar as classes corretas da estrutura e recuperar o resultado em um formato correto.

> src/main/java/br/com/hioktec/designpatterns/estruturais/facade
