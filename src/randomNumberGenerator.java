public class randomNumberGenerator {
    public static void main(String[] args) {
        // Using a loop to print 10 random numbers
        for (int i = 0; i < 10; i++) {
            double randomNumber = Math.random(); // Generate a random number between 0.0 (inclusive) and 1.0 (exclusive)
            System.out.println("Random Number " + (i + 1) + ": " + randomNumber);
        }
    }
}
