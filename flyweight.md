## Flyweight

Padrão de projeto estrutural que permite a você colocar mais objetos na quantidade de RAM disponível ao compartilhar partes comuns de estado entre os múltiplos objetos ao invés de manter todos os dados em cada objeto.

### Quando usar

- Utilize o padrão Flyweight apenas quando seu programa deve suportar um grande número de objetos que mal cabem na RAM disponível.

> O benefício de aplicar o padrão depende muito de como e onde ele é usado. Ele é mais útil quando:
> - uma aplicação precisa gerar um grande número de objetos similares
> - isso drena a RAM disponível no dispositivo alvo
> - os objetos contém estados duplicados que podem ser extraídos e compartilhados entre múltiplos objetos


### Estrutura

![Estrutura Flyweight](https://refactoring.guru/images/patterns/diagrams/flyweight/structure.png)

<sub><sup>* imagem de https://refactoring.guru</sup></sub>

### Prós

- Você pode economizar muita RAM, desde que seu programa tenha muitos objetos similares.

### Contras

- Você pode estar trocando RAM por ciclos de CPU quando parte dos dados de contexto precisa ser recalculado cada vez que alguém chama um método flyweight.

- O código fica muito mais complicado. Novos membros de equipe sempre se perguntarão por que o estado de uma entidade foi separado de tal forma.

#### Mais informações

[Refactoring.Guru / Flyweight](https://refactoring.guru/pt-br/design-patterns/flyweight)

### Código de exemplo em java

Renderizando uma floresta

Neste exemplo, vamos renderizar uma floresta (1.000.000 árvores)! Cada árvore será representada por seu próprio objeto que possui algum estado (coordenadas, textura e assim por diante). Embora o programa faça seu trabalho principal, naturalmente consome muita RAM.

O motivo é simples: muitos objetos árvore contêm dados duplicados (nome, textura, cor). É por isso que podemos aplicar o padrão Flyweight e armazenar esses valores em objetos separados de flyweight (a classe TreeType). Agora, em vez de armazenar os mesmos dados em milhares de objetos Tree, vamos fazer referência a um dos objetos flyweight com um conjunto específico de valores.

O código cliente não notará nada, pois a complexidade da reutilização de objetos flyweight está enterrada dentro de uma fábrica de flyweight.

> src/main/java/br/com/hioktec/designpatterns/estruturais/flyweight
