### Creational Pattern / Padrão Criacional

Os padrões criacionais fornecem vários mecanismos de criação de objetos, que aumentam a flexibilidade e reutilização de código já existente.

O padrão criacional escolhido foi o "Factory Method", que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.

Neste exemplo em especifico, existem várias subclasses da classe "Shape" que representam os vários formatos de figuras que existem. Este padrão sugere que o programador substitua chamadas diretas de construção (usando o "new", por exemplo), por chamadas de um método de uma classe "Fábrica" ou "Factory". Com isso, é possivel sobrescrever a chamada do metodo fábrica em uma subclasse  e alterar a classe dos produtos que estão sendo criados.

Com base no exemplo, podemos notar que existe apenas uma "ShapeFactory", porém duas subclasses "CircleFactory" e "RectangleFactory", as quais criam objetos especificos de sua respectiva classe. Além disso, normalmente a classe Factory possui alguma outra regra de negócio embutida, que neste caso foi representado por "Other stuff".

