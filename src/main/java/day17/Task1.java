package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece pawnWhite1 = ChessPiece.PAWN_WHITE;
        ChessPiece pawnWhite2 = ChessPiece.PAWN_WHITE;
        ChessPiece pawnWhite3 = ChessPiece.PAWN_WHITE;
        ChessPiece pawnWhite4 = ChessPiece.PAWN_WHITE;

        ChessPiece rookBlack1 = ChessPiece.ROOK_BLACK;
        ChessPiece rookBlack2 = ChessPiece.ROOK_BLACK;
        ChessPiece rookBlack3 = ChessPiece.ROOK_BLACK;
        ChessPiece rookBlack4 = ChessPiece.ROOK_BLACK;

        ChessPiece[] masChessPiece = new ChessPiece[8];
        masChessPiece[0] = pawnWhite1;
        masChessPiece[1] = pawnWhite2;
        masChessPiece[2] = pawnWhite3;
        masChessPiece[3] = pawnWhite4;
        masChessPiece[4] = rookBlack1;
        masChessPiece[5] = rookBlack2;
        masChessPiece[6] = rookBlack3;
        masChessPiece[7] = rookBlack4;

        for (ChessPiece chessPiece : masChessPiece) {
            System.out.print(chessPiece.getSymbol() + " ");
        }
    }
}
