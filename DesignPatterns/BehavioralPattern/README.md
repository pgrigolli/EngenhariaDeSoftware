## Behavioral Pattern / Padrão Comportamental

Padrões comportamentais são voltados aos algoritmos e a designação de responsabilidades entre objetos.

O padrão escolhido foi o "Observer", o qual permite que o programador defina um mecanismo de assinatura para notificar múltiplos objetos sobre quaisquer eventos que aconteçam com o objeto que eles estão observando.

Quando não se utiliza esse padrão, podemos perceber dois problemas: recursos desnecessarios sendo gastos para verificar se um evento aconteceu ou não com o objeto, ou toda vez que o evento acontecer, aquele objeto em especifico mandar notificações para todos.

Com a aplicação desse padrão, o observer estará ligado a um objeto observável, e para que aconteceça a notificação, basta apenas uma chamada de método notify() ou notifyAll() por exemplo.

### Diagrama UML deste exemplo
![ObserverDesignPatternUML drawio](https://github.com/pgrigolli/EngenhariaDeSoftware/assets/141965505/1e944336-9ec3-4404-a75c-863e0204813d)
