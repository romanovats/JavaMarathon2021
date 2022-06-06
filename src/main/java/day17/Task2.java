package day17;

public class Task2 {
    public static void main(String[] args) {

        ChessPiece[][] chessPieces = new ChessPiece[8][8];
        ChessBoard chessBoard = new ChessBoard(chessPieces);

        ChessPiece empty = ChessPiece.EMPTY;
        ChessPiece rookBlack = ChessPiece.ROOK_BLACK;
        ChessPiece kingBlack = ChessPiece.KING_BLACK;
        ChessPiece pawnBlack = ChessPiece.PAWN_BLACK;
        ChessPiece knightBlack = ChessPiece.KNIGHT_BLACK;
        ChessPiece queenBlack = ChessPiece.QUEEN_BLACK;
        ChessPiece bishopBlack = ChessPiece.BISHOP_BLACK;
        ChessPiece bishopWhite = ChessPiece.BISHOP_WHITE;
        ChessPiece pawnWhite = ChessPiece.PAWN_WHITE;
        ChessPiece queenWhite = ChessPiece.QUEEN_WHITE;
        ChessPiece rookWhite = ChessPiece.ROOK_WHITE;
        ChessPiece kingWhite = ChessPiece.KING_WHITE;

        chessPieces[0][0] = rookBlack;
        chessPieces[0][1] = empty;
        chessPieces[0][2] = empty;
        chessPieces[0][3] = empty;
        chessPieces[0][4] = empty;
        chessPieces[0][5] = rookBlack;
        chessPieces[0][6] = kingBlack;
        chessPieces[0][7] = empty;

        chessPieces[1][0] = empty;
        chessPieces[1][1] = rookWhite;
        chessPieces[1][2] = empty;
        chessPieces[1][3] = empty;
        chessPieces[1][4] = pawnBlack;
        chessPieces[1][5] = pawnBlack;
        chessPieces[1][6] = empty;
        chessPieces[1][7] = pawnBlack;

        chessPieces[2][0] = pawnBlack;
        chessPieces[2][1] = empty;
        chessPieces[2][2] = knightBlack;
        chessPieces[2][3] = empty;
        chessPieces[2][4] = empty;
        chessPieces[2][5] = empty;
        chessPieces[2][6] = pawnBlack;
        chessPieces[2][7] = empty;

        chessPieces[3][0] = queenBlack;
        chessPieces[3][1] = empty;
        chessPieces[3][2] = empty;
        chessPieces[3][3] = bishopWhite;
        chessPieces[3][4] = empty;
        chessPieces[3][5] = empty;
        chessPieces[3][6] = empty;
        chessPieces[3][7] = empty;

        chessPieces[4][0] = empty;
        chessPieces[4][1] = empty;
        chessPieces[4][2] = empty;
        chessPieces[4][3] = bishopBlack;
        chessPieces[4][4] = pawnWhite;
        chessPieces[4][5] = empty;
        chessPieces[4][6] = empty;
        chessPieces[4][7] = empty;

        chessPieces[5][0] = empty;
        chessPieces[5][1] = empty;
        chessPieces[5][2] = empty;
        chessPieces[5][3] = empty;
        chessPieces[5][4] = bishopWhite;
        chessPieces[5][5] = pawnWhite;
        chessPieces[5][6] = empty;
        chessPieces[5][7] = empty;

        chessPieces[6][0] = pawnWhite;
        chessPieces[6][1] = empty;
        chessPieces[6][2] = empty;
        chessPieces[6][3] = queenWhite;
        chessPieces[6][4] = empty;
        chessPieces[6][5] = pawnWhite;
        chessPieces[6][6] = empty;
        chessPieces[6][7] = pawnWhite;

        chessPieces[7][0] = empty;
        chessPieces[7][1] = empty;
        chessPieces[7][2] = empty;
        chessPieces[7][3] = empty;
        chessPieces[7][4] = empty;
        chessPieces[7][5] = rookWhite;
        chessPieces[7][6] = kingWhite;
        chessPieces[7][7] = empty;

        chessBoard.print();
    }
}
