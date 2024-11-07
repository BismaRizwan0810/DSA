//TO MOVE ZERO TO AN END
public class MoveZerotoEnd {
    public static void main(String[] args) {
        // Initialize an array
        int[] arr = {1, 0, 8, 0, 7, 0, 5};

        // Call the method to move zeros to the end
        moveZeroToEnd(arr);

        // Print the array after moving zeros to the end
        System.out.print("Array after moving zeros to the end: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    // Method to move zeros to the end
    public static void moveZeroToEnd(int[] arr)
    {
        // To track the position of non-zero elements
        int index = 0;

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
            {
                // If current element is not zero, place it at the index
                arr[index] = arr[i];
                // Move index forward
                if (i != index)
                {
                    // Set the old position to zero
                    arr[i] = 0;
                }
                index++;
            }
        }
    }
}
