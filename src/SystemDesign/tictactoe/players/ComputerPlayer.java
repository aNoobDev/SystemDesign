package SystemDesign.tictactoe.players;

import SystemDesign.tictactoe.enums.Symbol;
import SystemDesign.tictactoe.gameentity.Board;

public class ComputerPlayer extends Player{
    
    Symbol symbol;
    public ComputerPlayer(Symbol symbol){
        this.symbol=symbol;
    }
    @Override
    public void makeMove(Board b) {
        System.out.println("Computer's Move");
    }

    public Symbol getSymbol() {
        return symbol;
    }
}
