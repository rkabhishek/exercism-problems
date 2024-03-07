import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

class DnDCharacter {

    private final static int DICE_ROLLS = 4;
    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int hitPoints;

    DnDCharacter() {
        strength = getAbilityScore();
        dexterity = getAbilityScore();
        constitution = getAbilityScore();
        intelligence = getAbilityScore();
        wisdom = getAbilityScore();
        charisma = getAbilityScore();
        hitPoints = 10 + modifier(constitution);
    }

    private int getAbilityScore() {
        List<Integer> scores = rollDice();
        return ability(scores);
    }

    int ability(List<Integer> scores) {
        List<Integer> mutableCopy = new ArrayList<>(scores);
        Collections.sort(mutableCopy, Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += mutableCopy.get(i);
        }
        return sum;
    }

    List<Integer> rollDice() {
        Random random = new Random();
        List<Integer> diceRolls = new ArrayList<>();

        for (int i = 0 ; i < DICE_ROLLS; i++) {
            diceRolls.add(1 + random.nextInt(6));
        }

        return diceRolls;
    }

    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }

    int getStrength() {
       return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
       return charisma;
    }

    int getHitpoints() {
        return hitPoints;
    }
}
