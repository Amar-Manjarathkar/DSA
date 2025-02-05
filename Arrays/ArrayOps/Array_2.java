
import java.util.Arrays;
import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10}; // Creation and initialization

        // Insertion of an element in the array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index at which you want to insert the new element:");
        int index = sc.nextInt();
        System.out.println("Enter the new element:");
        int newVal = sc.nextInt();
        sc.close(); // Close scanner to avoid memory leak

        int newArr[] = new int[arr.length + 1];

        // Copying elements and shifting
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = newVal;  // Insert new value at the given index
            } else {
                newArr[i] = arr[j++];  // Copy old elements, skipping the inserted position
            }
        }

        // Printing the updated array
        System.out.println("Updated Array: " + Arrays.toString(newArr));
    sc.close();
    }  
}
