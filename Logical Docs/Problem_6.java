package package2;

public class Problem_6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 9}; 
        int start = arr[0]; 
        int end = arr[arr.length - 1]; 
        
        System.out.print("Missing elements: ");
        for (int i = start; i <= end; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(i + " ");
           }
        }
    }
}

