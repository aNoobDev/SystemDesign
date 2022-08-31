package SystemDesign.snakeandladder;

import SystemDesign.snakeandladder.factories.PlayerFactory;

public class SnakeAndLaddersMain {
    
    public static void main(String[] args){
        
        System.out.println("Hellow");
        Game g= PlayerFactory.createPlayers(10,4);
        g.launchGame();
        System.out.println("Game Ends");
        
    }
}
