package DemeterLaw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Project {
    
    //to access a hungry fish
    
    Ocean o = new Ocean();

    Fish fish[] = o.getHungryFish(); // Demeter law OK!!!!


}

class Fish {
    Random generator = new Random();

    private boolean food;
    
    public Fish(boolean food) {
        this.food = food;
    }

    public boolean isHungry(){

        if(generator.nextInt(1) == 1){
            return true;
        }
        return false;
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

    public Fish[] getHungryFish(){
        Fish hungryFishes[] = new Fish[5];
        int k = 0;

        for(int i = 0; i < 5; i++){
            if(fishes[i].isHungry()){
                hungryFishes[k] = fishes[i];
                k++;
            }
        }



        return hungryFishes;
    }


}

