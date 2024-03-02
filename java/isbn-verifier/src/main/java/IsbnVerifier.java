class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        int sum = 0;
        int pos = 10;

        for (char c: stringToVerify.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += (c - '0') * pos;
                pos--;
            } else if (c == '-') {
                continue;
            } else if (c == 'X' && pos == 1) {
                sum += 10;
                pos--;
            } else {
                return false;
            }
        }

        return pos == 0 && sum % 11 == 0;
    }
}
