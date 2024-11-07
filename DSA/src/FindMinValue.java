//FIND MINIMUM VAUE
public class FindMinValue {
    public static void main(String[] args) {
        // Initialize an array
        int[] arr = {13, 45, 7, 23, 56, 1, 90};

        // Call the method to find the minimum value
        int minValue = findMinValue(arr);

        // Print the minimum value
        System.out.println("The minimum value in the array is: " + minValue);
    }

    // Method to find the minimum value in an array
    public static int findMinValue(int[] arr) {
        // Assume the first element is the minimum
        int min = arr[0];

        // Loop through the array to find the minimum value
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];  // Update min if a smaller value is found
            }
        }

        return min;
    }
}
