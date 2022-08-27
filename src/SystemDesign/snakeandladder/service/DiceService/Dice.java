package SystemDesign.snakeandladder.service.DiceService;

import java.util.Random;

public class Dice {
    
    public static int roll(){
        
        return new Random().nextInt(6);
    }
}
