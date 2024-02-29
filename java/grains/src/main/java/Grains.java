import java.math.BigInteger;

class Grains {

    private static final int SQUARES_ON_CHESS_BOARD = 64;
    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return BigInteger.valueOf(2).pow(square - 1);
    }

    BigInteger grainsOnBoard() {
        return BigInteger.valueOf(2).pow(SQUARES_ON_CHESS_BOARD).subtract(BigInteger.ONE);
    }

}
