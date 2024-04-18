package DemeterLaw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Project {
    
    //to access a hungry fish
    
    Ocean o = new Ocean();

    o.getRandomFish().isHungry(); // Breaking Demeter's law.
        


}

class Fish {

    private boolean food;

    public Fish(boolean food) {
        this.food = food;
    }

    public boolean isHungry(boolean food){

        if(food == true){
            return false;
        }   
        return true;

    }

}



class Ocean{

    Fish fishes[] = new Fish[10];


    public void addFish(int quantity){
        for(int i = 0; i < quantity/2; i++){

            Fish f = new Fish(true);
            fishes[i];
            Fish f2 = new Fish(false); // Adding instances of fish in Ocean
            fishes[i + 5];

        }
    }

    Random generator = new Random();


    public Fish getRandomFish(){

        return fishes[generator.nextInt(10)];

    }


}

