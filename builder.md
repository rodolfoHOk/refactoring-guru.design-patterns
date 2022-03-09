## Builder

Padrão de projeto criacional que permite a você construir objetos complexos passo a passo. O padrão permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção.

### Quando usar

- Use o padrão Builder para se livrar de um “construtor telescópico”.

> Digamos que você tenha um construtor com dez parâmetros opcionais. Chamar um monstro desses é muito inconveniente; portanto, você sobrecarrega o construtor e cria diversas versões curtas com menos parâmetros. Esses construtores ainda se referem ao principal, passando alguns valores padrão para qualquer parâmetro omitido.

- Use o padrão Builder quando você quer que seu código seja capaz de criar diferentes representações do mesmo produto (por exemplo, casas de pedra e madeira).

> O padrão Builder pode ser aplicado quando a construção de várias representações do produto envolvem etapas similares que diferem apenas nos detalhes.

- Use o Builder para construir árvores Composite ou outros objetos complexos.

> O padrão Builder permite que você construa produtos passo a passo. Você pode adiar a execução de algumas etapas sem quebrar o produto final. Você pode até chamar etapas recursivamente, o que é bem útil quando você precisa construir uma árvore de objetos.

### Estrutura

![Estrutura uilder](https://refactoring.guru/images/patterns/diagrams/builder/structure.png)

<sub><sup>* imagem de https://refactoring.guru</sup></sub>

### Prós

- Você pode construir objetos passo a passo, adiar as etapas de construção ou rodar etapas recursivamente.

- Você pode reutilizar o mesmo código de construção quando construindo várias representações de produtos.

- Princípio de responsabilidade única. Você pode isolar um código de construção complexo da lógica de negócio do produto.

### Contras

- A complexidade geral do código aumenta uma vez que o padrão exige criar múltiplas classes novas.

#### Mais informações

[Refactoring.Guru / builder](https://refactoring.guru/pt-br/design-patterns/builder)

### Código de exemplo em java

Produção de um automóvel passo a passo

Neste exemplo, o padrão Builder permite a construção passo a passo de diferentes modelos de carros.

O exemplo também mostra como o Builder produz produtos de diferentes tipos (manual do carro) usando as mesmas etapas de construção.

O diretor controla a ordem da construção. Ele sabe quais etapas de construção chamar para produzir este ou aquele modelo de carro. Ele funciona com builders apenas por meio de sua interface comum. Isso permite passar diferentes tipos de builders para o diretor.

O resultado final é recuperado do objeto builder porque o diretor não pode saber o tipo de produto resultante. Somente o objeto builder sabe o que exatamente ele cria.
