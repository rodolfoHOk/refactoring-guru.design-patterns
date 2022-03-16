# Design Patterns em Java

> Estudos de Design Patterns do site [Refactoring Guru](https://refactoring.guru/pt-br/design-patterns)

### Introdução

Padrões de projeto (design patterns) são soluções típicas para problemas comuns em projeto de software. Cada padrão é como uma planta de construção que você pode customizar para resolver um problema de projeto particular em seu código.

Os padrões de projeto são um kit de ferramentas para soluções tentadas e testadas para problemas comuns em projeto de software. Mesmo que você nunca tenha encontrado esses problemas, saber sobre os padrões é ainda muito útil porque eles ensinam como resolver vários problemas usando princípios de projeto orientado a objetos.

### Classificação dos padrões

- Padrões criacionais: fornecem mecanismos de criação de objetos que aumentam a flexibilidade e a reutilização de código.


- Padrões estruturais: explicam como montar objetos e classes em estruturas maiores, enquanto ainda mantém as estruturas flexíveis e eficientes.


- Padrões comportamentais: cuidam da comunicação eficiente e da assinalação de responsabilidades entre objetos.

### Padrões criacionais

- [Factory Method](factoryMethod.md): fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.


- [Abstract Factory](abstractFactory.md): permite que você produza famílias de objetos relacionados sem ter que especificar suas classes concretas.


- [Builder](builder.md): permite a você construir objetos complexos passo a passo. O padrão permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção.


- [Prototype](prototype.md): permite copiar objetos existentes sem fazer seu código ficar dependente de suas classes.


- [Singleton](singleton.md): permite a você garantir que uma classe tenha apenas uma instância, enquanto provê um ponto de acesso global para essa instância.

### Padrões estruturais

- [Adapter](adapter.md): permite objetos com interfaces incompatíveis colaborarem entre si.


- [Bridge](bridge.md): permite que você divida uma classe grande ou um conjunto de classes intimamente ligadas em duas hierarquias separadas, abstração e implementação, que podem ser desenvolvidas independentemente umas das outras.


- [Composite](composite.md): permite que você componha objetos em estruturas de árvores e então trabalhe com essas estruturas como se elas fossem objetos individuais.


- [Decorator](decorator.md): permite que você acople novos comportamentos para objetos ao colocá-los dentro de invólucros de objetos que contém os comportamentos.


- [Facade](facade.md): fornece uma interface simplificada para uma biblioteca, um framework, ou qualquer conjunto complexo de classes


- [Flyweight](flyweight.md): permite a você colocar mais objetos na quantidade de RAM disponível ao compartilhar partes comuns de estado entre os múltiplos objetos ao invés de manter todos os dados em cada objeto.


- [Proxy](proxy.md): permite que você forneça um substituto ou um espaço reservado para outro objeto. Um proxy controla o acesso ao objeto original, permitindo que você faça algo ou antes ou depois do pedido chegar ao objeto original.


### Padrões comportamentais

- [Chain of Responsibility](chainOfResponsibility.md): permite que você passe pedidos por uma corrente de handlers. Ao receber um pedido, cada handler decide se processa o pedido ou o passa adiante para o próximo handler na corrente.


- [Command](command.md): transforma um pedido em um objeto independente que contém toda a informação sobre o pedido. Essa transformação permite que você parametrize métodos com diferentes pedidos, atrase ou coloque a execução do pedido em uma fila, e suporte operações que não podem ser feitas.


- [Iterator](iterator.md): permite a você percorrer elementos de uma coleção sem expor as representações dele (lista, pilha, árvore, etc.)


- [Mediator](mediator.md): permite que você reduza as dependências caóticas entre objetos. O padrão restringe comunicações diretas entre objetos e os força a colaborar apenas através do objeto mediador.


- [Memento](memento.md): permite que você salve e restaure o estado anterior de um objeto sem revelar os detalhes de sua implementação.
