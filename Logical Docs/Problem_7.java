package package2;

import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
       
        
        boolean isPalindrome = true;
        int n = str.length();

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
