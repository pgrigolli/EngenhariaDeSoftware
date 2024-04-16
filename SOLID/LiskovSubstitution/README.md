Nesta branch está o código que segue ao principio de Liskov, onde a classe mãe "Bird" possui somente o metodo peck (bicar). O método fly (voar) não existe mais para essa classe visto que nem todos os pássaros voam.

No entanto, foi criado uma outra classe "FlyingBirds" (passaros que voam), classe essa que herda "Bird" e que implementa fly, e consequentemente, os pássaros que voam agora herdam "FlyingBirds", e não "Bird".
