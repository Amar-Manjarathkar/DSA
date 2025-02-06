import java.util.Scanner;

public class Array_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element u want to search ");
        int element = sc.nextInt();

        int arr [] = {10,20,85,45,96};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==element) {
                System.out.println("Element is present at " + i +" Index");   
            } 
        }

    }
    
}
