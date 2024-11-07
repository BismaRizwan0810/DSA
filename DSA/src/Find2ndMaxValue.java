//FIND 2nd MAX VALUE
public class Find2ndMaxValue {
    public static void main(String[] args) {
        // Initialize an array
        int[] arr = {10, 40, 70, 25, 90, 10, 30};

        // Call the method to find the second maximum value
        int secondMax = findSecondMaxValue(arr);

        // Print the second maximum value
        if (secondMax != Integer.MIN_VALUE) {
            System.out.println("The second maximum value in the array is: " + secondMax);
        } else {
            System.out.println("No second maximum value exists.");
        }
    }

    // Method to find the second maximum value in an array
    public static int findSecondMaxValue(int[] arr) {
        // Handle case where there is no second max (array with less than 2 elements)
        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        // Initialize the max and second max variables
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Loop through the array to find the maximum and second maximum values
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;  // Update second max
                max = arr[i];     // Update max
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];  // Update second max
            }
        }

        return secondMax;
    }
}
