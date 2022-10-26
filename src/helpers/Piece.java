package helpers;

public class Piece {

    @Override
    public String toString() {

        if (typeOfPiece == pieces.QUEEN) {
            return "Q";
        } else {
            return "-";
        }

    }

    public void setEmpty() {
        this.typeOfPiece = pieces.EMPTY;
    }

    public void setQueen() {
        this.typeOfPiece = pieces.QUEEN;
    }

    public boolean isEmpty() {
        return typeOfPiece == pieces.EMPTY;
    }

    public pieces typeOfPiece;

    public enum pieces {
        QUEEN,
        EMPTY
    }

    public Piece() {
        this.typeOfPiece = pieces.EMPTY;
    }
    
}