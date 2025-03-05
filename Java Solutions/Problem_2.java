import java.util.Scanner;

public class Problem_2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        System.out.print("Even numbers: ");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("Odd numbers: ");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        
    
    }
}
