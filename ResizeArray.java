//RESIZE AN ARRAY
import java.util.Arrays;

public class ResizeArray {
    public static void main(String[] args) {
        // Original array
        int[] arr = {20, 40, 50, 60, 90};

        // Resize the array to a larger size
        int newSize = 9;
        arr = resizeArray(arr, newSize);

        // Print the resized array
        System.out.println("Resized Array: " + Arrays.toString(arr));
    }

    // Method to resize the array
    public static int[] resizeArray(int[] arr, int newSize) {
        int[] newArr = new int[newSize];
        //Copy exsiting elements
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }
}
