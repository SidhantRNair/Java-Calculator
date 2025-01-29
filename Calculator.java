import java.util.*;

class Calculator{
		//addition function
	int sum(){
		int[] input_numbers;
		Input in = new Input();
		input_numbers = in.input();
		int add = input_numbers[0] + input_numbers[1];
		return add;
}
	int sub(){
		//subtration function
		int[] input_numbers;
		Input in = new Input();
		input_numbers = in.input();
		int difference = input_numbers[0] - input_numbers[1];
		return difference;
}
	int div(){
		//division function
		int[] input_numbers;
		Input in = new Input();
		input_numbers = in.input();
		int quotient = input_numbers[0] / input_numbers[1];
		return quotient;
}
		
	int mul(){
		//multiplication function
		int[] input_numbers;
		Input in = new Input();
		input_numbers = in.input();
		int prod = input_numbers[0] * input_numbers[1];
		return prod;
}
	int[] generateFibonacci() {
		//generating  fibbonacci series of length specified by user
    		int[] input_numbers;
    		InputFib in = new InputFib(); 
    		input_numbers = in.input();
    		int n = input_numbers[0];
    		int[] sequence = new int[n];

    		if (n > 0) sequence[0] = 0;
    		if (n > 1) sequence[1] = 1;

    		for (int i = 2; i < n; i++) {
        		sequence[i] = sequence[i - 1] + sequence[i - 2];
    }
    		return sequence;
}


}

