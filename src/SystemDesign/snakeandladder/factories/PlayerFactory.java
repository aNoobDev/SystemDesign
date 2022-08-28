package SystemDesign.snakeandladder.factories;

import SystemDesign.snakeandladder.Game;
import SystemDesign.snakeandladder.users.Player;

import java.util.Random;

public class PlayerFactory {
    
    public static Game createPlayers(int n,int players){
        Random random=new Random();
        Game g=new Game(n);
        while(players-->0){
            char name = (char) (random. nextInt(26) + 'a');
            Player p=new Player((name+"").toUpperCase());
            g.addPlayer(p);
        }
        return g;
    }
}
