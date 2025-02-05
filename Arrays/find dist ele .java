import java.util.HashSet;
import java.util.Set;

class CountDistinctElements {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("Number of distinct elements: " + countDistinct(arr));
    }

    public static int countDistinct(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }
}