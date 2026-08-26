package TwoPointers;

public class ValidPalindrome {

    public static void main(String[] args) {

        String name = "malayalam";

        boolean palindrome = true;

        int left = 0;
        int right = name.length() - 1;

        while (left < right) {

            if (name.charAt(left) != name.charAt(right)) {

                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (palindrome) {
            System.out.println("Valid Palindrome");
        } else {
            System.out.println("Not A Palindrome");
        }
    }
}