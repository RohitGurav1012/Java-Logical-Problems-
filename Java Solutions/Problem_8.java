import java.util.HashMap;

public class Problem_8 {
    public static void main(String[] args) {
        String input = "aabbcdddededfg";
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch : input.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        System.out.println(charCount);
    }
}
