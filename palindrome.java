public class Main {
    public static void main(String[] args) {
        String input = "malayalam";

        boolean isPalindrome = checkPalindrome(input);
        System.out.println(isPalindrome);
    }

    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
