### Interface Segregation / Segregação de Interface

<p>
  Este principio é um caso particular do Single Responsability (Unica Responsabilidade), porém para interfaces, ou seja, tem como objetivo atribuir uma unica função á interface. Para que isso ocorra, acontece a segregação de uma interface maior em outras menores e mais especificas. Isso facilita a escalabilidade do software e caso exista alguma mudança, só será necessário alterar uma parte do código (a interface em questão).
</p>

<p>
  Neste caso existe uma interface "TaxService", onde possui vários metodos de calculo de imposto, especifico para cada nacionalidade, além de um método padrão para todas as pessoas. Este código não segue o principio, pois em um implementação dessa interface, só existiria um método para o pais escolhido, fazendo com que os outros não fossem usados. 
</p>
