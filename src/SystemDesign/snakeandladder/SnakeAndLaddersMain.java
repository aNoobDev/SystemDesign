package SystemDesign.snakeandladder;

import SystemDesign.snakeandladder.users.Player;

public class SnakeAndLaddersMain {
    
    public static void main(String[] args){
        
        System.out.println("Hellow");
        Game g=new Game(10);
        g.addPlayer(new Player("A"));
        g.addPlayer(new Player("B"));
        g.addPlayer(new Player("C"));
        g.launchGame();
        
    }
}
