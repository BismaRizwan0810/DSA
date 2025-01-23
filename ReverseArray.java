//REVERSE AN ARRAY
public class ReverseArray {
    public static void main(String[] args) {
        // Initialize an array
        int[] arr = {1, 2, 3, 4, 5};

        // Print original array
        System.out.print("Original Array: ");
        printArray(arr);

        // Reverse the array
        reverseArray(arr);

        // Print reversed array
        System.out.print("Reversed Array: ");
        printArray(arr);
    }

    // Method to reverse the array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Swap elements from start to end
        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
