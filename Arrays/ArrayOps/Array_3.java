
import java.util.Arrays;
import java.util.Scanner;

public class Array_3 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println("Given array ;-" + Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index that u want to delete from array :-");
        int index = sc.nextInt();
        // Deleting element
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid Index");
        } else {
            int newArr[] = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != index) {
                    newArr[j++] = arr[i];
                }
            }
            System.out.println("Updated Array " + Arrays.toString(newArr));
        }
        sc.close();
    }

}
