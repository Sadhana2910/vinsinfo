public class Main {
    public static void main(String[] args) {
        int n = 5;
        int sum = sumOfNaturalNumbers(n);
        System.out.println(sum);
    }

    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
