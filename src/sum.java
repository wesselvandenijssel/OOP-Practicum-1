public class sum {
    public static void main(String[] args) {
        int sum = 0; // Initialize the sum variable

        // Using a loop to add numbers from 0 to 39
        for (int i = 0; i <= 39; i++) {
            sum += i; // Add the current number to the sum
        }

        System.out.println("The sum of numbers from 0 to 39 is: " + sum);
    }
}
