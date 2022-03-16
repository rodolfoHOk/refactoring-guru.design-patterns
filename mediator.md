## Mediator

Padrão de projeto comportamental que permite que você reduza as dependências caóticas entre objetos. O padrão restringe comunicações diretas entre objetos e os força a colaborar apenas através do objeto mediador.

### Quando usar

- Utilize o padrão Mediator quando é difícil mudar algumas das classes porque elas estão firmemente acopladas a várias outras classes.

> O padrão lhe permite extrair todas as relações entre classes para uma classe separada, isolando quaisquer mudanças para um componente específico do resto dos componentes.

- Utilize o padrão quando você não pode reutilizar um componente em um programa diferente porque ele é muito dependente de outros componentes.

> Após você aplicar o Mediator, componentes individuais se tornam alheios aos outros componentes. Eles ainda podem se comunicar entre si, mas de forma indireta, através do objeto mediador. Para reutilizar um componente em uma aplicação diferente, você precisa fornecer a ele uma nova classe mediadora.

- Utilize o Mediator quando você se encontrar criando um monte de subclasses para componentes apenas para reutilizar algum comportamento básico em vários contextos.

> Como todas as relações entre componentes estão contidas dentro do mediador, é fácil definir novas maneiras para esses componentes colaborarem introduzindo novas classes mediadoras, sem ter que mudar os próprios componentes.

### Estrutura

![Estrutura Mediator](https://refactoring.guru/images/patterns/diagrams/mediator/structure.png)

<sub><sup>* imagem de https://refactoring.guru</sup></sub>

### Prós

- Princípio de responsabilidade única. Você pode extrair as comunicações entre vários componentes para um único lugar, tornando as de mais fácil entendimento e manutenção.

- Princípio aberto/fechado. Você pode introduzir novos mediadores sem ter que mudar os próprios componentes.

- Você pode reduzir o acoplamento entre os vários componentes de um programa.

- Você pode reutilizar componentes individuais mais facilmente.

### Contras

- Com o tempo um mediador pode evoluir para um Objeto Deus.

#### Mais informações

[Refactoring.Guru / Mediator](https://refactoring.guru/pt-br/design-patterns/mediator)

### Código de exemplo em java

Aplicação de notas

Este exemplo mostra como organizar muitos elementos da interface de usuário para que eles cooperem com a ajuda de um mediador, mas não dependam um do outro.

> src/main/java/br/com/hioktec/designpatterns/comportamentais/mediator
