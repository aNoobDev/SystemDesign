package SystemDesign.chessboard.players;

import SystemDesign.chessboard.Colour;
import SystemDesign.chessboard.Position;
import SystemDesign.chessboard.entities.*;

public abstract class Player {
    
    Colour colour;
    String name;
    King king;
    Queen queen;
    Pawn pawn;
    Rook rook;
    Bishop bishop;
    Knight knight;
    public abstract void makeMove(Position position);
}
