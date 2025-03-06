package package2;

public class Problem_2 {
    public static void main(String[] args) {
        int num = 12345; 
        int reversed = 0;

        while (num != 0) {
            int lastDigit = num % 10;  
            reversed = reversed * 10 + lastDigit;  
            num = num / 10;  
        }

        System.out.println("Reversed Integer number: " + reversed);
    }
}
