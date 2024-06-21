public class EliudsEggs {
    public int eggCount(int number) {
        int result = 0;
        while (number > 0) {
            int rightmostBit = number & 1;
            result += rightmostBit;
            number = number >> 1;
        }
        return result;
    }
}
