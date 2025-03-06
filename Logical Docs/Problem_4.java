package package2;

public class Problem_4 {
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; 
        }

        int[] count = new int[256];

        
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        // Check if all values are zero
        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }

        return true; 
    }

    public static void main(String[] args) {
    	//This are examples to check anagrams or not anagrams
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}

