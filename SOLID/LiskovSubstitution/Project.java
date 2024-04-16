package LiskovSubstitution;

public class Project {
    
}


class Bird{

    void peck(){
    }

}

class FlyingBirds extends Bird{

    void fly(){

    }
}

class Penguim extends Bird {

    super.peck(); // But they can peck!!!

    
}

class Falcon extends FlyingBirds {

    super.fly();
    super.peck();
    // Falcons can fly AND peck!
}

