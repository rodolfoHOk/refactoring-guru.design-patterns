## Adapter

Padrão de projeto estrutural que permite objetos com interfaces incompatíveis colaborarem entre si.

### Quando usar

- Utilize a classe Adaptador quando você quer usar uma classe existente, mas sua interface não for compatível com o resto do seu código.

> O padrão Adapter permite que você crie uma classe de meio termo que serve como um tradutor entre seu código e a classe antiga, uma classe de terceiros, ou qualquer outra classe com uma interface estranha.

- Utilize o padrão quando você quer reutilizar diversas subclasses existentes que não possuam alguma funcionalidade comum que não pode ser adicionada a superclasse.

> Você pode estender cada subclasse e colocar a funcionalidade faltante nas novas classes filhas. Contudo, você terá que duplicar o código em todas as novas classes, o que cheira muito mal.

> Uma solução muito mais elegante seria colocar a funcionalidade faltante dentro da classe adaptadora. Então você encobriria os objetos com as funcionalidades faltantes dentro do adaptador, ganhando tais funcionalidades de forma dinâmica. Para isso funcionar, as classes alvo devem ter uma interface em comum, e o campo do adaptador deve seguir aquela interface.

### Estrutura

Adaptador de objeto:

![Estrutura Adapter objeto](https://refactoring.guru/images/patterns/diagrams/adapter/structure-object-adapter.png)

<sub><sup>* imagem de https://refactoring.guru</sup></sub>

Adaptador de classe (Somente linguagens com multiplas heranças:

![Estrutura Adapter classe](https://refactoring.guru/images/patterns/diagrams/adapter/structure-class-adapter.png)

<sub><sup>* imagem de https://refactoring.guru</sup></sub>

### Prós

- Princípio de responsabilidade única. Você pode separar a conversão de interface ou de dados da lógica primária do negócio do programa.

- Princípio aberto/fechado. Você pode introduzir novos tipos de adaptadores no programa sem quebrar o código cliente existente, desde que eles trabalhem com os adaptadores através da interface cliente.

### Contras

- A complexidade geral do código aumenta porque você precisa introduzir um conjunto de novas interfaces e classes. Algumas vezes é mais simples mudar a classe serviço para que ela se adeque com o resto do seu código.

#### Mais informações

[Refactoring.Guru / Adapter](https://refactoring.guru/pt-br/design-patterns/adapter)

### Código de exemplo em java

Colocando pinos quadrados em orifícios redondos

Este exemplo simples mostra como um adaptador pode fazer com que objetos incompatíveis funcionem juntos.

> src/main/java/br/com/hioktec/designpatterns/estruturais/adapter