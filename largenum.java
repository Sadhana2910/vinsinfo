public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int largest = numbers[0]; // assume first element is largest

        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Largest number: " + largest);
    }
}
