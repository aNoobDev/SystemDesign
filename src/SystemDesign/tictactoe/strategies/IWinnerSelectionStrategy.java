package SystemDesign.tictactoe.strategies;

import SystemDesign.tictactoe.gameentity.Board;

public interface IWinnerSelectionStrategy {
    
    public int winnerRule(Board b);
}
