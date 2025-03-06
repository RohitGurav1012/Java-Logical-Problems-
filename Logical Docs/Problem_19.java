package package2;

public class Problem_19 {
    public static void main(String[] args) {
        int n = 4, sum = 0, count = 0, num = 2;

        while (count < n) {
            if (isPrime(num)) {
                sum += num * num;
                count++;
            }
            num++;
        }

        System.out.println(sum);
    }

    static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
