### Demeter Law / Lei de Demeter

<p>
  A lei de Demeter estipula que uma classe só deve acessar o objeto que estiver mais proximo de si, ou seja, não pode exister longas cadeias de metodos apenas para conseguir um atributo mais adiante. Deve extinguir (A.getB().getC().getD().getE().getSomething()).
</p>
<p>
  Nesse exemplo temos Ocean que possui uma coleção de Fish, que por sua vez podem estar com fome ou não, baseado no método (bool isHungry()). Para acessarmos os peixes e sabermos se estão com fome, é necessário Ocean.getRandomFish().isHungry(), o que fere a lei de Demeter.
</p>
