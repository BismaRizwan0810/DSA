
//CHECK STRING IS A PALINDROME OR NOT
public class CheckPalindrome {
    public static void main(String[] args) {
        // string
        String str = "NOON";

        // Call the method to check if the string is a palindrome
        boolean isPalindrome = isPalindrome(str);

        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    // Method to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right)
        {
            if (str.charAt(left) != str.charAt(right))
            {
                // If characters don't match, it's not a palindrome,then it returns 0
                return false;
            }
            left++;
            right--;
        }

        // If all characters match, it's a palindrome then its return 1
        return true;
    }
}
