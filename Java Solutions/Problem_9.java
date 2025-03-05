public class Problem_9 {
    public static void main(String[] args) {
        String input = "00010110"; 
        int sum = 0;
        
        int i = 0;
        while (i < input.length()) {
            char ch = input.charAt(i);
            if (ch == '0') {
                sum += 1; // here value of (0) = 1
            } else if (ch == '1') {
                sum += 2; // here value of (1) = 2
            }
            i++;
        }
        
        System.out.println(sum); 
    }
}
