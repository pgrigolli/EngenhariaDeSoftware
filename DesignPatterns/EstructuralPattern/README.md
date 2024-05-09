## Structural Pattern / Padrão Estrutural

Os padrões estruturais explicam como montar objetos e classes em estruturas maiores mas ainda mantendo essas estruturas flexíveis e eficientes.

O padrão estrutural escolhido foi o "Adapter", que se baseia em permitir que interfaces incompatíveis colaborem entre si.

Neste exemplo em especifico, existe um sensor de temperatura que mede em Celsius, porém foi requisitado pelo cliente que a temperatura fosse demonstrada em Fahrenheit. Para solucionar esse problema, foi utilizado uma classe "TemperatureAdapter", que obtia a temperatura em Celsius e dentro da própria classe mudava essa informação para a escala Fahrenheit, mantendo o encapsulamento do código.

### Diagrama UML deste exemplo

![AdapterDesignPatternUML drawio](https://github.com/pgrigolli/EngenhariaDeSoftware/assets/141965505/b97b4916-4b58-4b41-aa9b-02bca8dc219a)
