import java.util.Scanner;
public class array_1 {
    public static void main(String[] args) {
        //This is a array program which takes the size and the data in the array as user input 
        System.out.println("Enter the Size of an Array :-");
        Scanner obj=new Scanner(System.in);
        int n = obj.nextInt(); 
        int arr2 [] = new int[n]; // create 
        // array creation and traversal based on user input 
        for (int i = 0; i < arr2.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter integer values:- "+i+" ");
             arr2[i] = sc.nextInt();     // insert  
        }
        System.out.println("The Given array is :-");
        
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");  // output the array 

        }
        
    }
    
}
