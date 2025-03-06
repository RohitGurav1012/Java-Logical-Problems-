package package2;

import java.util.Scanner;

public class Problem_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
     

        int first = 0, second = 1, next;
        
        System.out.print("Fibonacci Series: " + first + " " + second + " ");
        
        for (int i = 2; i < n; i++) {
            next = first + second; 
            System.out.print(next + " ");
            first = second; 
            second = next;
        }
    }
}
