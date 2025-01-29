import java.util.*;

class Input {
	//Input for regular functions
    int[] input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first_number = scan.nextInt();

        System.out.println("Enter Second Number:");
        int second_number = scan.nextInt();

        return new int[]{first_number, second_number};
    }
}

class InputFib {
	// input for fibbonacci series
    int[] input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci terms: ");
        int num_terms = scan.nextInt();

        return new int[]{num_terms};
    }
}
