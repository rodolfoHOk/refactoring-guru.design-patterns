## Bridge

Padrão de projeto estrutural que permite que você divida uma classe grande ou um conjunto de classes intimamente ligadas em duas hierarquias separadas, abstração e implementação, que podem ser desenvolvidas independentemente umas das outras.

### Quando usar

- Utilize o padrão Bridge quando você quer dividir e organizar uma classe monolítica que tem diversas variantes da mesma funcionalidade.

> Quanto maior a classe se torna, mais difícil é de entender como ela funciona, e mais tempo se leva para fazer mudanças. As mudanças feitas para uma das variações de funcionalidade podem precisar de mudanças feitas em toda a classe, o que quase sempre resulta em erros ou falha em lidar com efeitos colaterais. O padrão Bridge permite que você divida uma classe monolítica em diversas hierarquias de classe. Após isso, você pode modificar as classes em cada hierarquia independentemente das classes nas outras. Essa abordagem simplifica a manutenção do código e minimiza o risco de quebrar o código existente.

- Utilize o padrão quando você precisa estender uma classe em diversas dimensões ortogonais (independentes).

> O Bridge sugere que você extraia uma hierarquia de classe separada para cada uma das dimensões. A classe original delega o trabalho relacionado para os objetos pertencentes àquelas hierarquias ao invés de fazer tudo por conta própria.

- Utilize o Bridge se você precisar ser capaz de trocar implementações durante o momento de execução.

> Embora seja opcional, o padrão Bridge permite que você substitua o objeto de implementação dentro da abstração. É tão fácil quanto designar um novo valor para um campo.

### Estrutura

![Estrutura Bridge](https://refactoring.guru/images/patterns/diagrams/bridge/structure-pt-br.png)

<sub><sup>* imagem de https://refactoring.guru</sup></sub>

### Prós

- Você pode criar classes e aplicações independentes de plataforma.

- O código cliente trabalha com abstrações em alto nível. Ele não fica exposto a detalhes de plataforma.

- Princípio aberto/fechado. Você pode introduzir novas abstrações e implementações independentemente uma das outras.

- Princípio de responsabilidade única. Você pode focar na lógica de alto nível na abstração e em detalhes de plataforma na implementação.

### Contras

- Você pode tornar o código mais complicado ao aplicar o padrão em uma classe altamente coesa.

#### Mais informações

[Refactoring.Guru / Bridge](https://refactoring.guru/pt-br/design-patterns/bridge)

### Código de exemplo em java

Bridge entre dispositivos e controles remotos

Este exemplo mostra a separação entre as classes de controles remotos e dispositivos que eles controlam.

Os controles remotos atuam como abstrações e os dispositivos são suas implementações. Graças às interfaces comuns, os mesmos controles remotos podem funcionar com dispositivos diferentes e vice-versa.

> src/main/java/br/com/hioktec/designpatterns/estruturais/bridge
