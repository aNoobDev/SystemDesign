package SystemDesign.tictactoe.players;

import SystemDesign.tictactoe.enums.Symbol;
import SystemDesign.tictactoe.gameentity.Board;

import java.util.Scanner;

public class HumanPlayer extends Player{
    
    Symbol symbol;
    Scanner sc;
    public HumanPlayer(Symbol symbol){
        
        this.symbol=symbol;
        this.sc=new Scanner(System.in);
    }
    @Override
    public void makeMove(Board b) {
        int x=sc.nextInt();
        int y=sc.nextInt();
        b.grid[x][y]=this.symbol==Symbol.X?1:0;
    }

    public Symbol getSymbol() {
        return symbol;
    }
}
