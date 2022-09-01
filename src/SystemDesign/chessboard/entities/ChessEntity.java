package SystemDesign.chessboard.entities;

import SystemDesign.chessboard.Colour;
import SystemDesign.chessboard.Position;

public abstract class ChessEntity {
    
    public abstract void possibleMoves(Position position);
    public abstract void getMove();
    public abstract void capture();
    Colour colour;
}
