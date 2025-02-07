import java.util.Scanner;

public class Array_2D_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the SQUARE matrix: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        // Taking input
        System.out.println("Enter the elements row-wise:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing the matrix
        System.out.println("The Matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
        
        sc.close(); // Close the scanner to prevent resource leak
    }
}
