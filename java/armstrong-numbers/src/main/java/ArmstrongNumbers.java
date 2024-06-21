class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int digitCount = countDigits(numberToCheck);
        int sum = 0;
        int temp = numberToCheck;

        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + (int)Math.pow(rem, digitCount);
            temp /= 10;
        }

        return sum == numberToCheck;
    }

    private int countDigits(int num){

        if (num == 0)
            return 1;

        int count = 0;

        while (num > 0) {
            num /= 10;
            count++;
        }

        return count;
    }
}
