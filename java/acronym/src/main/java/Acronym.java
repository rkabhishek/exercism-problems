class Acronym {

    private String acronym;

    Acronym(String phrase) {
        phrase = phrase.replaceAll("[^a-zA-Z-\\s]", "");
        phrase = phrase.toUpperCase();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);
            if (Character.isLetter(ch)) {
                if (i == 0 || (phrase.charAt(i - 1) == ' ' || phrase.charAt(i - 1) == '-')) {
                    sb.append(ch);
                }
            }
        }
        acronym = sb.toString();
    }

    String get() {
        return acronym;
    }
}
