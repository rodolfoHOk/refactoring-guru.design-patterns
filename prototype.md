## Prototype

Padrão de projeto criacional que permite copiar objetos existentes sem fazer seu código ficar dependente de suas classes.

### Quando usar

- Utilize o padrão Prototype quando seu código não deve depender de classes concretas de objetos que você precisa copiar.

> Isso acontece muito quando seu código funciona com objetos passados para você de um código de terceiros através de alguma interface. As classes concretas desses objetos são desconhecidas, e você não pode depender delas mesmo que quisesse

- Utilize o padrão quando você precisa reduzir o número de subclasses que somente diferem na forma que inicializam seus respectivos objetos. Alguém pode ter criado essas subclasses para ser capaz de criar objetos com uma configuração específica.

> O padrão Prototype permite que você use um conjunto de objetos pré construídos, configurados de diversas formas, como protótipos.

### Estrutura

Básica:

![Estrutura Prototype](https://refactoring.guru/images/patterns/diagrams/prototype/structure.png)

<sub><sup>* imagem de https://refactoring.guru</sup></sub>

Com registro:

![Estrutura Prototype com Registro](https://refactoring.guru/images/patterns/diagrams/prototype/structure-prototype-cache.png)

<sub><sup>* imagem de https://refactoring.guru</sup></sub>

### Prós

- Você pode clonar objetos sem acoplá-los a suas classes concretas.

- Você pode se livrar de códigos de inicialização repetidos em troca de clonar protótipos pré-construídos.

- Você pode produzir objetos complexos mais convenientemente.

- Você tem uma alternativa para herança quando lidar com configurações pré determinadas para objetos complexos.

### Contras

- Clonar objetos complexos que têm referências circulares pode ser bem complicado.

#### Mais informações

[Refactoring.Guru / Prototype](https://refactoring.guru/pt-br/design-patterns/prototype)

### Código de exemplo em java

Copiando formas gráficas

O padrão Prototype está disponível e pronto para uso em Java com a interface Cloneable.

Vamos dar uma olhada em como o Prototype pode ser implementado sem a interface Cloneable padrão.

> src/main/java/br/com/hioktec/designpatterns/criacionais/prototype
