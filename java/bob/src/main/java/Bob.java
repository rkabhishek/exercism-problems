class Bob {

    String hey(String input) {
        input = input.trim();
        boolean questioning = input.endsWith("?");
        boolean shouting = hasAtleastOneLetter(input) && input.equals(input.toUpperCase());

        if (input.equals("")) {
            return "Fine. Be that way!";
        } else if (questioning && shouting) {
            return "Calm down, I know what I'm doing!";
        } else if (questioning) {
            return "Sure.";
        } else if (shouting) {
            return "Whoa, chill out!";
        } else {
            return "Whatever.";
        }
    }

    private boolean hasAtleastOneLetter(String input) {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch) ) {
                return true;
            }
        }
        return false;
    }
}