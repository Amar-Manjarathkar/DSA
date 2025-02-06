public class Array_5 {
    static int arr1[] = {10,20,3000,40,75,7004,165,946,1233};
    static int largest(){
        int max = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]>max){
                max = arr1[i];
            }
    
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Largest Element is "+ largest());
    }
    
}
