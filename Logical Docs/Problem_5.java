package package2;

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        //  StringBuilder 
        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("Reversed string: " + reversed);
    }
}

