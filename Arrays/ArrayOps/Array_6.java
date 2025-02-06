import java.util.Arrays;

public class Array_6 {
    public static void main(String[] args) {
        // Arrays largest element using JAVA 8 Stream 
        int arr [] = {10000,20,45000,6465};
        int max = Arrays.stream(arr).max().getAsInt(); 
        System.out.println("The largest element is "+max);
    }
    
}
