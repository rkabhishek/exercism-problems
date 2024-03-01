class IsbnVerifier {

    boolean isValid(String stringToVerify) {

         if (!stringToVerify.matches("[0-9X-]+")) {
             return false;
         }

         stringToVerify = stringToVerify.replaceAll("-", "");
         int length = stringToVerify.length();

         if (length != 10) {
             return false;
         }

         if (stringToVerify.indexOf('X') != length - 1 && stringToVerify.indexOf('X') != -1) {
             return false;
         }


        int[] nums = new int[10];
        int j = nums.length - 1;
        int sum = 0;

        for (int i = 0; i < stringToVerify.toCharArray().length; i++) {
            char c = stringToVerify.charAt(i);
            if (c == '-')
                continue;
            else if (c == 'X') {
                nums[j] = 10;
            } else {
                nums[j] = c - 48;
            }
            j--;
            if (j < 0)
                break;
        }

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] * (i + 1);
        }

        return sum % 11 == 0;
    }

}
