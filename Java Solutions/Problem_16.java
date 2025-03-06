import java.util.Arrays;

public class Problem_16 {
    public static int find_K_Largest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k]; 
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2}; 
        int k = 2; 

        int result = find_K_Largest(arr, k);
        System.out.println("Kth largest element: " + result);
    }
}
