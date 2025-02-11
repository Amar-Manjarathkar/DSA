

public class app {
    public static int search(int arr[], int target) {
       
       for (int i = 0; i < arr.length; i++) {
        if(arr[i]==target){
            return i;
        }
           
       }
       return -1;
        
    }
    public static void main(String[] args) {
        int arr [] = {1,5,4,9,7,6};
        int target = 9;
        System.out.println(search(arr,target));
    }
    
}
