class SqueakyClean {

    static String clean(String identifier) {
        String identifierWithoutSpaces = replaceSpaceWithUnderscore(identifier);
        String identifierInCamelCase = convertKebabToCamelCase(identifierWithoutSpaces);
        String identifierAfterRemovingLeetSpeak = convertLeetSpeakToNormalText(identifierInCamelCase);
        String identifierAfterRemovingNonLetters = identifierAfterRemovingLeetSpeak.replaceAll("[^a-zA-Z_]", "");

        return identifierAfterRemovingNonLetters;
    }

    private static String replaceSpaceWithUnderscore(String identifier) {
        return identifier.replace(' ', '_');
    }

    private static String convertKebabToCamelCase(String identifier) {
        String[] s = identifier.split("-");
        StringBuilder camelCaseString = new StringBuilder(s[0]);

        for(int i = 1; i < s.length; i++) {
            camelCaseString.append(s[i].substring(0, 1).toUpperCase()).append(s[i].substring(1));
        }

        return camelCaseString.toString();
    }

    private static String convertLeetSpeakToNormalText(String identifier) {
        return identifier.replace('4', 'a')
                .replace('3', 'e')
                .replace('0', 'o')
                .replace('1', 'l')
                .replace('7', 't');
    }

}
