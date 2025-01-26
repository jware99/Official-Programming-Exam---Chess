package chess;

import java.util.ArrayList;
import java.util.Collection;

public class PawnMoves implements ChessMoves {

    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        Collection<ChessMove> moves = new ArrayList<>();
        ChessGame.TeamColor myTeamColor = board.getPiece(new ChessPosition(myPosition.getRow(), myPosition.getColumn())).getTeamColor();

        // white move
        if (myTeamColor == ChessGame.TeamColor.WHITE) {
            if (myPosition.getRow() + 1 <= 8) {
                if (board.getPiece(new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn())) == null) {
                    if (myPosition.getRow() + 1 == 8) {
                        moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn()), ChessPiece.PieceType.QUEEN));
                        moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn()), ChessPiece.PieceType.ROOK));
                        moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn()), ChessPiece.PieceType.BISHOP));
                        moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn()), ChessPiece.PieceType.KNIGHT));
                        System.out.println((myPosition.getRow() + 1) + " " + (myPosition.getColumn()));
                    } else {
                        moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn()), null));
                        System.out.println((myPosition.getRow() + 1) + " " + (myPosition.getColumn()));
                    }
                }
            }
            if (myPosition.getRow() == 2) {
                if (board.getPiece(new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn())) == null && board.getPiece(new ChessPosition(myPosition.getRow() + 2, myPosition.getColumn())) == null) {
                    moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() + 2, myPosition.getColumn()), null));
                    System.out.println((myPosition.getRow() + 2) + " " + (myPosition.getColumn()));
                }
            }
        }

        // black move
        if (myTeamColor == ChessGame.TeamColor.BLACK) {
            if (myPosition.getRow() - 1 >= 1) {
                if (board.getPiece(new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn())) == null) {
                    if (myPosition.getRow() - 1 == 1) {
                        moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn()), ChessPiece.PieceType.QUEEN));
                        moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn()), ChessPiece.PieceType.ROOK));
                        moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn()), ChessPiece.PieceType.BISHOP));
                        moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn()), ChessPiece.PieceType.KNIGHT));
                        System.out.println((myPosition.getRow() - 1) + " " + (myPosition.getColumn()));
                    } else {
                        moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn()), null));
                        System.out.println((myPosition.getRow() - 1) + " " + (myPosition.getColumn()));
                    }
                }
            }
            if (myPosition.getRow() == 7) {
                if (board.getPiece(new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn())) == null && board.getPiece(new ChessPosition(myPosition.getRow() - 2, myPosition.getColumn())) == null) {
                    moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() - 2, myPosition.getColumn()), null));
                    System.out.println((myPosition.getRow() - 2) + " " + (myPosition.getColumn()));
                }
            }
        }

        //white capture
        if (myTeamColor == ChessGame.TeamColor.WHITE) {
            //right capture
            if (myPosition.getRow() + 1 <= 8 && myPosition.getColumn() + 1 <= 8) {
                if (board.getPiece(new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() + 1)) != null) {
                    ChessGame.TeamColor otherPieceColor = board.getPiece(new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() + 1)).getTeamColor();
                    if (myTeamColor != otherPieceColor) {
                        if (myPosition.getRow() + 1 == 8) {
                            moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() + 1), ChessPiece.PieceType.QUEEN));
                            moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() + 1), ChessPiece.PieceType.ROOK));
                            moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() + 1), ChessPiece.PieceType.BISHOP));
                            moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() + 1), ChessPiece.PieceType.KNIGHT));
                            System.out.println((myPosition.getRow() + 1) + " " + (myPosition.getColumn() + 1));
                        } else {
                            moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() + 1), null));
                            System.out.println((myPosition.getRow() + 1) + " " + (myPosition.getColumn() + 1));
                        }
                    }
                }
            }
            //left capture
            if (myPosition.getRow() + 1 <= 8 && myPosition.getColumn() - 1 >= 1) {
                if (board.getPiece(new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() - 1)) != null) {
                    ChessGame.TeamColor otherPieceColor = board.getPiece(new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() - 1)).getTeamColor();
                    if (myTeamColor != otherPieceColor) {
                        if (myPosition.getRow() + 1 == 8) {
                            moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() - 1), ChessPiece.PieceType.QUEEN));
                            moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() - 1), ChessPiece.PieceType.ROOK));
                            moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() - 1), ChessPiece.PieceType.BISHOP));
                            moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() - 1), ChessPiece.PieceType.KNIGHT));
                            System.out.println((myPosition.getRow() + 1) + " " + (myPosition.getColumn() - 1));
                        } else {
                            moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() + 1, myPosition.getColumn() - 1), null));
                            System.out.println((myPosition.getRow() + 1) + " " + (myPosition.getColumn() - 1));
                        }
                    }
                }
            }
        }

        //black capture
        if (myTeamColor == ChessGame.TeamColor.BLACK) {
            //right capture
            if (myPosition.getRow() - 1 >= 1 && myPosition.getColumn() + 1 <= 8) {
                if (board.getPiece(new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() + 1)) != null) {
                    ChessGame.TeamColor otherPieceColor = board.getPiece(new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() + 1)).getTeamColor();
                    if (myTeamColor != otherPieceColor) {
                        if (myPosition.getRow() - 1 == 1) {
                            moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() + 1), ChessPiece.PieceType.QUEEN));
                            moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() + 1), ChessPiece.PieceType.ROOK));
                            moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() + 1), ChessPiece.PieceType.BISHOP));
                            moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() + 1), ChessPiece.PieceType.KNIGHT));
                            System.out.println((myPosition.getRow() - 1) + " " + (myPosition.getColumn() + 1));
                        } else {
                            moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() + 1), null));
                            System.out.println((myPosition.getRow() - 1) + " " + (myPosition.getColumn() + 1));
                        }
                    }
                }
            }
            //left capture
            if (myPosition.getRow() - 1 >= 1 && myPosition.getColumn() - 1 >= 1) {
                if (board.getPiece(new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() - 1)) != null) {
                    ChessGame.TeamColor otherPieceColor = board.getPiece(new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() - 1)).getTeamColor();
                    if (myTeamColor != otherPieceColor) {
                        if (myPosition.getRow() - 1 == 1) {
                            moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() - 1), ChessPiece.PieceType.QUEEN));
                            moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() - 1), ChessPiece.PieceType.ROOK));
                            moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() - 1), ChessPiece.PieceType.BISHOP));
                            moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() - 1), ChessPiece.PieceType.KNIGHT));
                            System.out.println((myPosition.getRow() - 1) + " " + (myPosition.getColumn() - 1));
                        } else {
                            moves.add(new ChessMove(myPosition, new ChessPosition(myPosition.getRow() - 1, myPosition.getColumn() - 1), null));
                            System.out.println((myPosition.getRow() - 1) + " " + (myPosition.getColumn() - 1));
                        }
                    }
                }
            }
        }


        return moves;
    }
}
