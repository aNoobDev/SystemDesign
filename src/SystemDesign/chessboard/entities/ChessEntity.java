package SystemDesign.chessboard.entities;

import SystemDesign.chessboard.Colour;

public abstract class ChessEntity {
    
    public abstract void possibleMoves();
    public abstract void move();
    public abstract void capture();
    Colour colour;
}
