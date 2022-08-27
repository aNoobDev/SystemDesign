package SystemDesign.tictactoe.factories;

import SystemDesign.tictactoe.enums.PlayerType;
import SystemDesign.tictactoe.enums.Symbol;
import SystemDesign.tictactoe.players.ComputerPlayer;
import SystemDesign.tictactoe.players.HumanPlayer;
import SystemDesign.tictactoe.players.Player;

public class PlayerFactory {
    
    public static Player createPlayer(PlayerType p, Symbol symbol){
        
        switch(p){
            
            case HUMAN : return new HumanPlayer(symbol);
            case COMPUTER : return new ComputerPlayer(symbol);
            default : return null;
        }
    }
}
