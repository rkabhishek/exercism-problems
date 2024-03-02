class Proverb {

    private String proverb = "";
    private final String[] lines = {
            "And all for the want of a %s.",
            "For want of a %s the %s was lost.\n"
    };

    Proverb(String[] words) {

        StringBuilder sb = new StringBuilder();
        if (words.length == 0) {
            return;
        }
        
        for (int i = 1; i < words.length; i++) {
            sb.append(String.format(lines[1], words[i - 1], words[i]));
        }

        sb.append(String.format(lines[0], words[0]));
        proverb = sb.toString();
    }

    String recite() {
        return proverb;
    }
}
