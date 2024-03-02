class Proverb {

    private String proverb = "";
    String[] words;
    String[] lines = {
            "And all for the want of a %s.",
            "For want of a %s the %s was lost."
    };

    Proverb(String[] words) {
        this.words = words;
        if (words.length > 0) {
            for (int i = 1; i < words.length; i++) {
                proverb += String.format(lines[1], words[i - 1], words[i]) + "\n";
            }
            proverb += String.format(lines[0], words[0]);
        }
    }

    String recite() {
        return proverb;
    }
}
