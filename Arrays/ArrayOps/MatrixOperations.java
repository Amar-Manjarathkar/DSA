import java.util.Scanner;

public class MatrixOperations {
    // Function to take matrix input
    public static void InputMatrices(int mat[][], int n, Scanner sc, String name) {
        System.out.println("Enter elements for " + name + " Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    // Function to add matrices
    public static int[][] AddMatrices(int mat1[][], int mat2[][], int n) {
        int result[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }

    // Function to subtract matrices
    public static int[][] SubMatrices(int mat1[][], int mat2[][], int n) {
        int result[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        return result;
    }

    // Function to multiply matrices
    public static int[][] MultMatrices(int mat1[][], int mat2[][], int n) {
        int result[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }

    // Function to display a matrix
    public static void DisplayMatrices(int mat[][], int n, String op) {
        System.out.println("Result of " + op + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " "); // Use print() for proper formatting
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the SQUARE matrix: ");
        int n = sc.nextInt();

        int mat1[][] = new int[n][n];
        int mat2[][] = new int[n][n];

        // Input matrices
        InputMatrices(mat1, n, sc, "First");
        InputMatrices(mat2, n, sc, "Second");

        // Perform operations and display results
        DisplayMatrices(AddMatrices(mat1, mat2, n), n, "Addition");
        DisplayMatrices(SubMatrices(mat1, mat2, n), n, "Subtraction");
        DisplayMatrices(MultMatrices(mat1, mat2, n), n, "Multiplication");

        sc.close(); // Close scanner
    }
}
