package SystemDesign.tictactoe;

import SystemDesign.tictactoe.gameentity.Board;
import SystemDesign.tictactoe.players.Player;
import SystemDesign.tictactoe.strategies.IWinnerSelectionStrategy;

public class Game {
    
    Player player1;
    Player player2;
    Board board;
    boolean currentPlayer;
    IWinnerSelectionStrategy winnerSelectionStrategy;
    public Game(int boardSize, Player player1, Player player2, IWinnerSelectionStrategy winnerSelectionStrategy){
        board=new Board(boardSize);
        this.player1=player1;
        this.player2=player2;
        this.winnerSelectionStrategy=winnerSelectionStrategy;
    }

    void run() {
        int totalTurns = board.getSize() * board.getSize();
        int turns = 0;

        while(turns < totalTurns) {
            board.print();
            Player currentPlayer = getCurrentPlayer();
            System.out.println("Player "+currentPlayer.getSymbol()+"'s turn");
            currentPlayer.makeMove(board);
            int winner = winnerSelectionStrategy.winnerRule(board);
            if(winner > -1) {
                board.print();
                printWinner(winner);
                return;
            }

            updateCurrentPlayer();
            turns++;
        }
        System.out.println("No result!!");
    }

    void printWinner(int winner) {
        if(winner == 0) {
            System.out.println("Player O wins the game!!");
        }else if(winner == 1) {
            System.out.println("Player X wins the game!!");
        }
    }


    public Player getCurrentPlayer(){
        
        return this.currentPlayer?player1:player2;
    }
    public void updateCurrentPlayer(){
        
        currentPlayer= !currentPlayer;
    }
}
