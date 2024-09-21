import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int number1 = scanner.nextInt();

			System.out.println("Enter a 2nd number: ");
			int number2 = scanner.nextInt();

			Calculator calculator = new Calculator();

			int sum = calculator.add(number1, number2);
			int difference = calculator.subtract(number1, number2);
			int product = calculator.multiply(number1, number2);
			double quotient = calculator.divide(number1, number2);

			System.out.println("The answer of + is " + sum);
			System.out.println("The answer of - is " + difference);
			System.out.println("The answer of * is " + product);
			System.out.println("The answer of / is " + quotient);
		}
    }
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public double divide(int num1, int num2) {
        return (double) num1 / num2;
    }
}