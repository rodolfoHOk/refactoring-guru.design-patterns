## State

Padrão de projeto comportamental que permite que um objeto altere seu comportamento quando seu estado interno muda. Parece como se o objeto mudasse de classe.

### Quando usar

- Utilize o padrão State quando você tem um objeto que se comporta de maneira diferente dependendo do seu estado atual, quando o número de estados é enorme, e quando o código estado específico muda com frequência.

> O padrão sugere que você extraia todo o código estado específico para um conjunto de classes distintas. Como resultado, você pode adicionar novos estados ou mudar os existentes independentemente uns dos outros, reduzindo o custo da manutenção.

- Utilize o padrão quando você tem uma classe populada com condicionais gigantes que alteram como a classe se comporta de acordo com os valores atuais dos campos da classe.

> O padrão State permite que você extraia ramificações dessas condicionais para dentro de métodos de classes correspondentes. Ao fazer isso, você também limpa para fora da classe principal os campos temporários e os métodos auxiliares envolvidos no código estado específico.

- Utilize o State quando você tem muito código duplicado em muitos estados parecidos e transições de uma máquina de estado baseada em condições.

> O padrão State permite que você componha hierarquias de classes estado e reduza a duplicação ao extrair código comum para dentro de classes abstratas base.

### Estrutura

![Estrutura State](https://refactoring.guru/images/patterns/diagrams/state/structure-pt-br.png)

<sub><sup>* imagem de https://refactoring.guru</sup></sub>

### Prós

- Princípio de responsabilidade única. Organiza o código relacionado a estados particulares em classes separadas.

- Princípio aberto/fechado. Introduz novos estados sem mudar classes de estado ou contexto existentes.

- Simplifica o código de contexto ao eliminar condicionais de máquinas de estado pesadas.

### Contras

- Aplicar o padrão pode ser um exagero se a máquina de estado só tem alguns estados ou raramente muda eles.

#### Mais informações

[Refactoring.Guru / State](https://refactoring.guru/pt-br/design-patterns/state)

### Código de exemplo em java

Interface de um tocador de mídia

Neste exemplo, o padrão State permite que os mesmos controles do tocador de mídia se comportem de maneira diferente, dependendo do estado atual da reprodução. A classe principal do tocador contém uma referência a um objeto de estado, que executa a maior parte do trabalho para o tocador. Algumas ações podem acabar substituindo o objeto de estado por outro, o que altera a maneira como o tocador reage às interações do usuário.

> src/main/java/br/com/hioktec/designpatterns/comportamentais/state
