package package2;

public class Problem_20 {
    public static void main(String[] args) {
        String str = "Hello world!";
        int upper = 0, lower = 0;

        for (char c : str.toCharArray())
        {
            if (c >= 'A' && c <= 'Z') upper++;
            if (c >= 'a' && c <= 'z') lower++;
        }

        System.out.println("Uppercase = " + upper + ", Lowercase = " + lower);
    }
}
