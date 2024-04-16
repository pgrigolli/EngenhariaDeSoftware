package LiskovSubstitution;

public class Project {
    
}


class Bird{

    void fly(){
    }

    void peck(){
    }

}

class Penguim extends Bird {

    super.fly(); // Penguins CAN'T FLY!!!
    super.peck(); // But they can peck!!!

    
}

class Falcon extends Bird {

    super.fly();
    super.peck();
    // Falcons can fly AND peck!
}

