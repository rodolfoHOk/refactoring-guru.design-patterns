## Chain of Responsibility

Padrão de projeto comportamental que permite que você passe pedidos por uma corrente de handlers. Ao receber um pedido, cada handler decide se processa o pedido ou o passa adiante para o próximo handler na corrente.

### Quando usar

- Utilize o padrão Chain of Responsibility quando é esperado que seu programa processe diferentes tipos de pedidos em várias maneiras, mas os exatos tipos de pedidos e suas sequências são desconhecidos de antemão.

> O padrão permite que você ligue vários handlers em uma corrente e, ao receber um pedido, perguntar para cada handler se ele pode ou não processá-lo. Dessa forma todos os handlers tem a chance de processar o pedido.

- Utilize o padrão quando é essencial executar diversos handlers em uma ordem específica.

> Já que você pode ligar os handlers em uma corrente em qualquer ordem, todos os pedidos irão atravessar a corrente exatamente como você planejou.

- Utilize o padrão CoR quando o conjunto de handlers e suas encomendas devem mudar no momento de execução.

> Se você providenciar setters para um campo de referência dentro das classes handler, você será capaz de inserir, remover, ou reordenar os handlers de forma dinâmica.

### Estrutura

![Estrutura Chain of Responsibility](https://refactoring.guru/images/patterns/diagrams/chain-of-responsibility/structure.png)

<sub><sup>* imagem de https://refactoring.guru</sup></sub>

### Prós

- Você pode controlar a ordem de tratamento dos pedidos.

- Princípio de responsabilidade única. Você pode desacoplar classes que invocam operações de classes que realizam operações.

- Princípio aberto/fechado. Você pode introduzir novos handlers na aplicação sem quebrar o código cliente existente.

### Contras

- Alguns pedidos podem acabar sem tratamento.

#### Mais informações

[Refactoring.Guru / Chain of Responsibility](https://refactoring.guru/pt-br/design-patterns/chain-of-responsibility)

### Código de exemplo em java

Filtrando o acesso

Este exemplo mostra como uma solicitação que contém dados do usuário passa por uma cadeia sequencial de manipuladores que executam várias tarefas, como autenticação, autorização, e validação.

Este exemplo é um pouco diferente da versão canônica do padrão fornecida por vários autores. A maioria dos exemplos do padrão é construída com a noção de procurar o handler correto, iniciá-lo, e sair da cadeia depois disso. Mas aqui executamos todos os handlers até que um que não possa lidar com uma solicitação seja encontrado. Esteja ciente de que esse ainda é o padrão Chain of Responsibility, mesmo que o fluxo seja um pouco diferente.

> src/main/java/br/com/hioktec/designpatterns/comportamentais/chainOfResponsibility
