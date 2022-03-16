## Memento

Padrão de projeto comportamental que permite que você salve e restaure o estado anterior de um objeto sem revelar os detalhes de sua implementação.

### Quando usar

- Utilize o padrão Memento quando você quer produzir retratos do estado de um objeto para ser capaz de restaurar um estado anterior do objeto.

> O padrão Memento permite que você faça cópias completas do estado de um objeto, incluindo campos privados, e armazená-los separadamente do objeto. Embora a maioria das pessoas vão lembrar desse padrão graças ao caso “desfazer”, ele também é indispensável quando se está lidando com transações (isto é, se você precisa reverter uma operação quando se depara com um erro).

- Utilize o padrão quando o acesso direto para os campos/getters/setters de um objeto viola seu encapsulamento.

> O Memento faz o próprio objeto ser responsável por criar um retrato de seu estado. Nenhum outro objeto pode ler o retrato, fazendo do estado original do objeto algo seguro e confiável.

### Estrutura

Implementação baseada em classes aninhadas

> A implementação clássica do padrão dependente do apoio para classes aninhadas, disponível em muitas linguagens de programação populares (C++, C#, Java).

![Estrutura Memento 1](https://refactoring.guru/images/patterns/diagrams/memento/structure1.png)

<sub><sup>* imagem de https://refactoring.guru</sup></sub>

Implementação baseada em uma interface intermediária

> Há uma implementação alternativa, adequada para linguagens de programação que não suportam classes aninhadas (PHP)

![Estrutura Memento 2](https://refactoring.guru/images/patterns/diagrams/memento/structure2.png)

<sub><sup>* imagem de https://refactoring.guru</sup></sub>

Implementação com um encapsulamento ainda mais estrito

> Há ainda outra implementação que é útil quando você não quer deixar a mínima chance de outras classes acessarem o estado da originadora através do memento.

![Estrutura Memento 3](https://refactoring.guru/images/patterns/diagrams/memento/structure3.png)

<sub><sup>* imagem de https://refactoring.guru</sup></sub>

### Prós

- Você pode produzir retratos do estado de um objeto sem violar seu encapsulamento.

- Você pode simplificar o código da originadora permitindo que a cuidadora mantenha o histórico do estado da originadora.

### Contras

- A aplicação pode consumir muita RAM se os clientes criarem mementos com muita frequência.

- Cuidadoras devem acompanhar o ciclo de vida da originadora para serem capazes de destruir mementos obsoletos.

- A maioria das linguagens de programação dinâmicas, tais como PHP, Python, e JavaScript, não conseguem garantir que o estado dentro do memento permaneça intacto.

#### Mais informações

[Refactoring.Guru / Memento](https://refactoring.guru/pt-br/design-patterns/memento)

### Código de exemplo em java

Editor de formas e desfazer/refazer complexo

Este editor gráfico permite alterar a cor e a posição das formas na tela. No entanto, qualquer modificação pode ser desfeita e repetida.

O “desfazer” é baseado na colaboração entre os padrões Memento e Command. O editor rastreia um histórico dos comandos executados. Antes de executar qualquer comando, ele faz um backup e o conecta ao objeto de comando. Após a execução, ele adiciona o comando executado para o histórico.

Quando um usuário solicita o desfazer, o editor busca um comando recente do histórico e restaura o estado do backup mantido dentro desse comando. Se o usuário solicitar outro desfazer, o editor utilizará o próximo comando do histórico e assim por diante.

Os comandos revertidos são mantidos no histórico até que o usuário faça algumas modificações nas formas na tela. Isso é crucial para refazer comandos desfeitos.

> src/main/java/br/com/hioktec/designpatterns/comportamentais/memento
