package SystemDesign.tictactoe.factories;

import SystemDesign.tictactoe.Game;
import SystemDesign.tictactoe.enums.PlayerType;
import SystemDesign.tictactoe.enums.Symbol;
import SystemDesign.tictactoe.players.Player;
import SystemDesign.tictactoe.strategies.ConventionalWinner;

public class GameFactories {
    
    public static Game launch(int n,PlayerType player1, PlayerType player2){
        Player p1=PlayerFactory.createPlayer(player1, Symbol.X);
        Player p2=PlayerFactory.createPlayer(player2, Symbol.O);
        Game game =new Game(n,p1,p2,new ConventionalWinner());
        
        return game;
    }
}
