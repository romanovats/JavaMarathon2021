package day17;

public class ChessBoard {

    private ChessPiece[][] chessPieces;

    ChessBoard(ChessPiece[][] chessPieces) {
        this.chessPieces = chessPieces;
    }

    public void print() {
        for (int i=0; i< chessPieces.length; i++) {
            for (int j =0; j<chessPieces.length; j++) {
                System.out.print(chessPieces[i][j].getSymbol());
            }
            System.out.print(System.lineSeparator());
        }
    }
}
