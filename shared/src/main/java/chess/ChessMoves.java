package chess;

import java.util.Collection;

public interface ChessMoves {
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition);
}
