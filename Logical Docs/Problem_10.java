package package2;

public class Problem_10 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1, 35};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
                 if (num > largest) { 
                secondLargest = largest; 
                largest = num; 
            } else if (num > secondLargest && num != largest) { 
                secondLargest = num; 
            }
        }

           if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest number found.");
        }   else {
            System.out.println("Second Largest Number: " + secondLargest);
        }
    }
}
