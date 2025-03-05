public class Problem_7 {
    public static void main(String[] args) {
        int i = 3; // Start from 3
        
        while (i >= 1) { 
            int spaces = 3 - i; // Number of spaces before numbers
            while (spaces > 0) {
                System.out.print("  "); // Print spaces
                spaces--;
            }

            int j = i; // Start printing numbers from 'i' down to 1
            while (j >= 1) {
                System.out.print(j + " ");
                j--;
            }

            System.out.println(); // Move to the next line
            i--; // Decrease i to go to the next row
        }
    }
}
