import java.util.Scanner;

public class Problem_12 {
    public static void Fibonacci(int n) {
        int first = 0, second = 1;
        
        for (int i = 0; i < n; i++) {
            System.out.print(first + " "); 
            int next = first + second; 
            first = second; 
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt(); 
        scanner.close();
        
        Fibonacci(n);
    }
}
