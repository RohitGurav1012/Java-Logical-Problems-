package package2;

import java.util.Scanner;

public class Problem_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = scanner.nextInt();

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) System.out.print(num + " ");
        }
    }
}
