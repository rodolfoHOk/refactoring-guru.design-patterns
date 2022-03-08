## Factory Method

Padrão criacional de projeto que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.

### Quando usar

- Quando não souber de antemão os tipos e dependências exatas dos objetos com os quais seu código deve funcionar.

> O Factory Method separa o código de construção do produto do código que realmente usa o produto. Portanto, é mais fácil estender o código de construção do produto independentemente do restante do código.

- Quando desejar fornecer aos usuários da sua biblioteca ou framework uma maneira de estender seus componentes internos.

> Herança é provavelmente a maneira mais fácil de estender o comportamento padrão de uma biblioteca ou framework.  Mas como o framework reconheceria que sua subclasse deve ser usada em vez de um componente padrão?

> A solução é reduzir o código que constrói componentes no framework em um único método fábrica e permitir que qualquer pessoa sobrescreva esse método, além de estender o próprio componente.

- Quando deseja economizar recursos do sistema reutilizando objetos existentes em vez de recriá-los sempre.

> Você precisa ter um método regular capaz de criar novos objetos e reutilizar os existentes.

### Estrutura

![Estrutura Factory Method](https://refactoring.guru/images/patterns/diagrams/factory-method/structure.png)

<sub><sup>* imagem de https://refactoring.guru</sup></sub>

### Prós

- Você evita acoplamentos firmes entre o criador e os produtos concretos.

- Princípio de responsabilidade única. Você pode mover o código de criação do produto para um único local do programa, facilitando a manutenção do código.

- Princípio aberto/fechado. Você pode introduzir novos tipos de produtos no programa sem quebrar o código cliente existente.

### Contras

- O código pode se tornar mais complicado, pois você precisa introduzir muitas subclasses novas para implementar o padrão. O melhor cenário é quando você está introduzindo o padrão em uma hierarquia existente de classes criadoras.

#### Mais informações

[Refactoring.Guru / factory-method](https://refactoring.guru/pt-br/design-patterns/factory-method)

### Código de exemplo em java

Produção de elementos da GUI de plataforma cruzada

No exemplo, os botões desempenham uma função de produto e os diálogos atuam como criadores.

Diferentes tipos de caixas de diálogo requerem seus próprios tipos de elementos. É por isso que criamos uma subclasse para cada tipo de diálogo e substituímos seus métodos fábrica.

> src/main/java/br/com/hioktec/designpatterns/criacionais/factorymethod
