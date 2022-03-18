## Visitor

Padrão de projeto comportamental que permite que você separe algoritmos dos objetos nos quais eles operam.

### Quando usar

- Utilize o Visitor quando você precisa fazer uma operação em todos os elementos de uma estrutura de objetos complexa (por exemplo, uma árvore de objetos).

> O padrão Visitor permite que você execute uma operação sobre um conjunto de objetos com diferentes classes ao ter o objeto visitante implementando diversas variantes da mesma operação, que correspondem a todas as classes alvo.

- Utilize o Visitor para limpar a lógica de negócio de comportamentos auxiliares.

> O padrão permite que você torne classes primárias de sua aplicação mais focadas em seu trabalho principal ao extrair todos os comportamentos em um conjunto de classes visitantes.

- Utilize o padrão quando um comportamento faz sentido apenas dentro de algumas classes de uma uma hierarquia de classe, mas não em outras.

> Você pode extrair esse comportamento para uma classe visitante separada e implementar somente aqueles métodos visitantes que aceitam objetos de classes relevantes, deixando o resto vazio.

### Estrutura

![Estrutura Visitor](https://refactoring.guru/images/patterns/diagrams/visitor/structure-pt-br.png)

<sub><sup>* imagem de https://refactoring.guru</sup></sub>

### Prós

- Princípio aberto/fechado. Você pode introduzir um novo comportamento que pode funcionar com objetos de diferentes classes sem mudar essas classes.

- Princípio de responsabilidade única. Você pode mover múltiplas versões do mesmo comportamento para dentro da mesma classe.

- Um objeto visitante pode acumular algumas informações úteis enquanto trabalha com vários objetos. Isso pode ser interessante quando você quer percorrer algum objeto de estrutura complexa, tais como um objeto árvore, e aplicar o visitante para cada objeto da estrutura.

### Contras

- Você precisa atualizar todos os visitantes a cada vez que a classe é adicionada ou removida da hierarquia de elementos.

- Visitantes podem não ter seu acesso permitido para campos e métodos privados dos elementos que eles deveriam estar trabalhando.

#### Mais informações

[Refactoring.Guru / Visitor](https://refactoring.guru/pt-br/design-patterns/visitor)

### Código de exemplo em java

Exportando formas para XML

Neste exemplo, gostaríamos de exportar um conjunto de formas geométricas para XML. O problema é que não queremos alterar o código de formas, diretamente ou, pelo menos, manter as alterações ao mínimo.

No final, o padrão Visitor estabelece uma infraestrutura que nos permite adicionar comportamentos à hierarquia de formas sem alterar o código existente dessas classes.

> src/main/java/br/com/hioktec/designpatterns/comportamentais/visitor
