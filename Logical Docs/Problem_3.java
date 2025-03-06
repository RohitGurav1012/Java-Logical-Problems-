package package2;

public class Problem_3 {
    public static void main(String[] args) {
        int a = 10, b = 12;

        a = a + b;  
        b = a - b;  
        a = a - b;  

       
        System.out.println("Swapped Values: a = " + a + ", b = " + b);
    }
}
