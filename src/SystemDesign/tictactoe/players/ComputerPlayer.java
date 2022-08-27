package SystemDesign.tictactoe.players;

public class ComputerPlayer extends Player{
    
    String symbol;
    public ComputerPlayer(String symbol){
        this.symbol=symbol;
    }
    @Override
    public void makeMove() {
        
    }

    public String getSymbol() {
        return symbol;
    }
}
