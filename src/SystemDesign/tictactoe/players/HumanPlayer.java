package SystemDesign.tictactoe.players;

public class HumanPlayer extends Player{
    
    String symbol;
    public HumanPlayer(String symbol){
        
        this.symbol=symbol;
    }
    @Override
    public void makeMove() {
        
    }

    public String getSymbol() {
        return symbol;
    }
}
