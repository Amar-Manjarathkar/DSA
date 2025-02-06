import java.util.Scanner;

public class Array_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element you want to search: ");
        int element = sc.nextInt();

        int[] arr = {10, 20, 85, 45, 96};
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Element is present at index " + i);
                found = true;
                break;  // Exit loop early if element is found
            }
        }
        if (!found) {
            System.out.println("Element not found in the array.");
        }
        sc.close();  // Close the Scanner
    }
    
}
