public class Problem_18 {
    public static void main(String[] args) {
        int[] numberRows = {5, 4, 3, 2, 1}; // Numbers pattern
        char[] charRows = {'D', 'C', 'B', 'A'}; // Characters pattern
        
        // First Row (Numbers)
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Second Row (Characters)
        for (char ch = 'D'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // Third Row (Numbers)
        for (int i = 3; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Fourth Row (Characters)
        for (char ch = 'B'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // Fifth Row (Single Number)
        System.out.println("1");
    }
}
