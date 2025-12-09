public class Main {
    public static void main(String[] args) {
        int n = 5;
        int fact = factorial(n);
        System.out.println(fact);
    }

    public static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
