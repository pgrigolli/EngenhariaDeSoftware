### Liskov Substitution Principle / Principio de substituição de Liskov

<p>Esse principio impoe que que um objeto de uma classe filha possa ser substituida por um objeto da classe mae sem que existam problemas. A importancia desse principio se relaciona com o fato de forcar o programador a criar a abstração correta para o código, e pensar exatamente o que a classe mãe vai herdar para as classes filhas, visto que caso ocorra algum erro, o programador, ao atender esse principio, terá problemas na sua implementação e execução.</p>

Neste exemplo, esse principio é quebrado pois quando se cria uma classe mae "Bird" e um metodo fly (voar), espera-se que toda classe filha, neste caso, todo tipo de passaro possa voar, o que não se aplica à classe Penguim.
