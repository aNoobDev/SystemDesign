package SystemDesign.tictactoe.players;

import SystemDesign.tictactoe.enums.Symbol;
import SystemDesign.tictactoe.gameentity.Board;

public abstract class Player {
    
    Symbol symbol;
    public abstract void makeMove(Board b);
    public Symbol getSymbol(){
        return symbol;
    }
}
