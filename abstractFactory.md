## Abstract Factory

Padrão de projeto criacional que permite que você produza famílias de objetos relacionados sem ter que especificar suas classes concretas.

### Quando usar

- Quando seu código precisa trabalhar com diversas famílias de produtos relacionados, mas que você não quer depender de classes concretas daqueles produtos - eles podem ser desconhecidos de antemão ou você simplesmente quer permitir uma futura escalabilidade.

> O Abstract Factory fornece a você uma interface para a criação de objetos de cada classe das famílias de produtos. Desde que seu código crie objetos a partir dessa interface, você não precisará se preocupar em criar uma variante errada de um produto que não coincida com produtos já criados por sua aplicação.

### Estrutura

![Estrutura Abstract Factory](https://refactoring.guru/images/patterns/diagrams/abstract-factory/structure.png)

<sub><sup>* imagem de https://refactoring.guru</sup></sub>

### Prós

- Você pode ter certeza que os produtos que você obtém de uma fábrica são compatíveis entre si.

- Você evita um vínculo forte entre produtos concretos e o código cliente.

- Princípio de responsabilidade única. Você pode extrair o código de criação do produto para um lugar, fazendo o código ser de fácil manutenção.

- Princípio aberto/fechado. Você pode introduzir novas variantes de produtos sem quebrar o código cliente existente.

### Contras

- código pode tornar-se mais complicado do que deveria ser, uma vez que muitas novas interfaces e classes são introduzidas junto com o padrão.

#### Mais informações

[Refactoring.Guru / abstract-factory](https://refactoring.guru/pt-br/design-patterns/abstract-factory)

### Código de exemplo em java

Famílias de componentes da GUI multiplataforma e sua produção

Neste exemplo, botões e caixas de seleção atuarão como produtos. Eles têm duas variantes: macOS e Windows.

O Abstract Factory define uma interface para criar botões e caixas de seleção. Existem duas fábricas concretas, que retornam ambos os produtos em uma única variante.

O código cliente trabalha com fábricas e produtos usando suas interfaces abstratas. Ele faz com que o mesmo código cliente funcione com muitas variantes de produtos, dependendo do tipo de objeto fábrica.

> src/main/java/br/com/hioktec/designpatterns/criacionais/abstractfactory