package package2;

import java.util.Scanner;

public class Problem_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n number: ");
        int n = scanner.nextInt();

        for (int numb = 2; numb <= n; numb++) {
            if (isPrime(numb)) System.out.print(numb + " ");
        }
    }

    static boolean isPrime(int numb) {
        for (int i = 2; i * i <= numb; i++) { 
            if (numb % i == 0) return false;
        }
        return true;
    }
}
