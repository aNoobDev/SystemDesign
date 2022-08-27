package SystemDesign.tictactoe.strategies;

import SystemDesign.tictactoe.gameentity.Board;

public class ModernWinner implements IWinnerSelectionStrategy{
    
    @Override
    public int winnerRule(Board b){
        System.out.println("New Rule");
        return 1;
    }
}
