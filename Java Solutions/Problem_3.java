import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int i = 1;
        while (i <= n) {
            if ((i > 5 && i <= 10) || (i > 15 && i <= 19)) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
            i++;
        }

    }
}
