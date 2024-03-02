class Scrabble {
    private final int score;

    Scrabble(String word) {
        word = word.toUpperCase();
        int score = 0;
        for (char c: word.toCharArray()) {
            switch (c) {
                case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T':
                    score += 1;
                    break;
                case 'D', 'G':
                    score += 2;
                    break;
                case 'B', 'C', 'M', 'P':
                    score += 3;
                    break;
                case 'F', 'H', 'V', 'W', 'Y':
                    score += 4;
                    break;
                case 'K':
                    score += 5;
                    break;
                case 'J', 'X':
                    score += 8;
                    break;
                case 'Q', 'Z':
                    score += 10;
                    break;
            }
        }
        this.score = score;
    }

    int getScore() {
       return score;
    }
}
