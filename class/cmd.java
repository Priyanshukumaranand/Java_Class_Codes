public class cmd {
    public static void main(String[] args) {
        // Check if the correct number of arguments is provided
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers as command-line arguments.");
            return;
        }

        try {
            // Parse the command-line arguments to integers
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);

            // Calculate the sum of the two numbers
            int sum = number1 + number2;

            // Display the result
            System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please make sure both arguments are integers.");
        }
    }
}
