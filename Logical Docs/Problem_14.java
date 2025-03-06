//2 differnt logic



package package2;

//Method 1 Checking each element with others

/*
public class Problem_14 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 4, 8, 2, 9, 7};

        System.out.println("Duplicates found:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}

*/

//Method 2 Using HashSet

import java.util.HashSet;

public class Problem_14 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 4, 8, 2, 9, 7};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        System.out.println("Duplicates found:");
        for (int num : arr) {
            if (!seen.add(num)) 
            { 
                duplicates.add(num);
            }
        }

        for (int num : duplicates)
        {
            System.out.print(num + " ");
        }
    }
}
