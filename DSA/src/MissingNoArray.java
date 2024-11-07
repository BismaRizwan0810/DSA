//FIND MISSING NO IN AN ARRAY
public class MissingNoArray {
    public static void main(String[] args)
    {
        // Example array with a missing number
        int[] arr = {1, 3, 4, 5, 6};

        // Call the method to find the missing number
        int missingNumber = findMissingNumber(arr);

        System.out.println("The missing number is: " + missingNumber);
    }

    // Method to find the missing number
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;  // Since one number is missing
        int expectedSum = n * (n + 1) / 2;  // Sum of first n natural numbers
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;  // The difference is the missing number
    }
}
