package SystemDesign.tictactoe.strategies;

import SystemDesign.tictactoe.gameentity.Board;

public class ConventionalWinner implements IWinnerSelectionStrategy {
    @Override
    public int winnerRule(Board board) {

            for(int i=0; i<board.getSize(); i++) {
                int rowSum = board.getRowSum(i);
                int colSum = board.getColSum(i);
                if(rowSum == board.getSize() || colSum == board.getSize()) {
                    return 1;
                }
                else if(rowSum == 0 || colSum == 0) {
                    return 0;
                }
            }
            return -1;

    }
}
