public class Problem_17 {
    public static boolean isValid(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "")
                 .replace("{}", "")
                 .replace("[]", "");
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
    	// You can change here and see another Examples are valid or Invalid
    	String s = "({})";
                
        //Here we are checking true or false
        System.out.println("Is valid? " + isValid(s)); 
    }
}
