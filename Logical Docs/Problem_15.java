package package2;

import java.util.HashSet;

public class Problem_15 {
    public static void main(String[] args) {
        int[] arr = {80, 60, 10, 50, 30, 100, 0, 50};
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Pairs with sum 100:");
        for (int num : arr)
        {
            int complement = 100 - num; 
            if (set.contains(complement)) 
            {
                System.out.println(num + ", " + complement);
            }
            set.add(num); 
        }
    }
}
