package package2;

public class Problem_1 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1, 35};

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest; 
                firstLargest = num;  
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;  
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There was No Second Largest Element.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}
