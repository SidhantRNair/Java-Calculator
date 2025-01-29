import java.util.*;
import java.util.Arrays;

class Main {
// main function for calling all functions using switch case
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Division");
            System.out.println("3. Multiplication");
            System.out.println("4. Subtraction");
            System.out.println("5. Fibonacci Sequence");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int sum = calculator.sum();
                    System.out.println("The sum is: " + sum);
                    break;
                case 2:
                    try {
                        int div = calculator.div();
                        System.out.println("The quotient is: " + div);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 3:
                    int mul = calculator.mul();
                    System.out.println("The product is: " + mul);
                    break;
                case 4:
                    int diff = calculator.sub();
                    System.out.println("The difference is: " + diff);
                    break;
                case 5:
                    int[] fibonacciSequence = calculator.generateFibonacci();
                    System.out.println("Fibonacci Sequence: " + Arrays.toString(fibonacciSequence));
                    break;
                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println(); 
    }
}
}
