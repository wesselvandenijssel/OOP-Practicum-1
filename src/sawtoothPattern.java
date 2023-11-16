public class sawtoothPattern {
    public static void main(String[] args) {
        // Using a loop to print the sawtooth pattern
        for (int i = 1; i <= 8; i++) {

            // Check if we're at the middle of the pattern and reset to "s"
            if (i % 2 == 0) {
                System.out.print("s");
                System.out.print("s");
                System.out.println(); // Move to the next line
            }else{
                System.out.print("s");
                System.out.println(); // Move to the next line
            }
        }
    }
}
