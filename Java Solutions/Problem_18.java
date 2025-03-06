public class Problem_18 {
    public static void main(String[] args) {
        int num = 5;  
        char letter = 'D';  

        while (num > 0) {
            //This is for Print numbers
            int tempNum = num;
            while (tempNum > 0) {
                System.out.print(tempNum + " ");
                tempNum--;
            }
            System.out.println();

            // this is for Print letters only if num > 1
            if (num > 1) {
                char tempChar = letter;
                while (tempChar >= 'A') {
                    System.out.print(tempChar + " ");
                    tempChar--;
                }
                System.out.println();
            }

            num -= 2;  
            letter -= 2;  
        }
    }
}
