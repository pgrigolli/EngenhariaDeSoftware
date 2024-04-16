package LiskovSubstitution;

public class Project {
    
}


class Bird{

    void peck(){
    }

}

class Penguim extends Bird {

    super.peck(); // But they can peck!!!

    
}

class Falcon extends Bird {

    void fly(){

    }
    super.peck();
    // Falcons can fly AND peck!
}

