### Liskov Substitution Principle / Principio de substituição de Liskov

Esse principio impoe que que um objeto de uma classe filha possa ser substituida por um objeto da classe mae sem que existam problemas.
Neste exemplo, esse principio é quebrado pois quando se cria uma classe mae "Bird" e um metodo fly (voar), espera-se que toda classe filha, neste caso, todo tipo de passaro possa voar, o que não se aplica à classe Penguim.
