import java.util.HashMap;
import java.util.Map;

class IsogramChecker {

    boolean isIsogram(String phrase) {

        phrase = phrase.toLowerCase();
        Map<Character, Integer> letterCount = new HashMap<>();

        for(int i = 0; i < phrase.length(); i++) {

            char characterToAdd = phrase.charAt(i);
            if (characterToAdd == ' ' || characterToAdd == '-')
                continue;

            if (letterCount.containsKey(characterToAdd))
                return false;
            letterCount.put(characterToAdd, 1);
        }



        return true;
    }

}
