## Template Method

Padrão de projeto comportamental que define o esqueleto de um algoritmo na superclasse mas deixa as subclasses sobrescreverem etapas específicas do algoritmo sem modificar sua estrutura.

### Quando usar

- Utilize o padrão Template Method quando você quer deixar os clientes estender apenas etapas particulares de um algoritmo, mas não todo o algoritmo e sua estrutura.

> O Template Method permite que você transforme um algoritmo monolítico em uma série de etapas individuais que podem facilmente ser estendidas por subclasses enquanto ainda mantém intacta a estrutura definida em uma superclasse.

- Utilize o padrão quando você tem várias classes que contém algoritmos quase idênticos com algumas diferenças menores. Como resultado, você pode querer modificar todas as classes quando o algoritmo muda.

> Quando você transforma tal algoritmo em um Template Method, você também pode erguer as etapas com implementações similares para dentro de uma superclasse, eliminando duplicação de código. Códigos que variam entre subclasses podem permanecer dentro das subclasses.

### Estrutura

![Estrutura Template Method](https://refactoring.guru/images/patterns/diagrams/template-method/structure.png)

<sub><sup>* imagem de https://refactoring.guru</sup></sub>

### Prós

- Você pode deixar clientes sobrescrever apenas certas partes de um algoritmo grande, tornando-os menos afetados por mudanças que acontece por outras partes do algoritmo.

- Você pode elevar o código duplicado para uma superclasse.

### Contras

- Alguns clientes podem ser limitados ao fornecer o esqueleto de um algoritmo.

- Você pode violar o princípio de substituição de Liskov ao suprimir uma etapa padrão de implementação através da subclasse.

- Implementações do padrão Template Method tendem a ser mais difíceis de se manter quanto mais etapas eles tiverem.

#### Mais informações

[Refactoring.Guru / Template Method](https://refactoring.guru/pt-br/design-patterns/template-method)

### Código de exemplo em java

Substituindo etapas padrão de um algoritmo

Neste exemplo, o padrão Template Method define um algoritmo de trabalho com uma rede social. As subclasses que correspondem a uma rede social específica, implementam essas etapas de acordo com a API fornecida pela rede social.

> src/main/java/br/com/hioktec/designpatterns/comportamentais/templateMethod
