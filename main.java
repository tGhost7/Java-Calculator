import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		System.out.println("Calculator");
		System.out.print("First Number: ");
		Scanner first_number = new Scanner(System.in);
		long first_value = first_number.nextInt();
		System.out.print("Second Number: ");
		Scanner second_number = new Scanner(System.in);
		long second_value = second_number.nextInt();
		System.out.print("Operator <+, -, *, />: ");
		Scanner action_string = new Scanner(System.in);
		String action_value = action_string.nextLine();
		if (action_value.equals("+")) {
			long equals = first_value + second_value;
			System.out.println(equals);
		} else if (action_value.equals("-")) {
			long equals = first_value - second_value;
			System.out.println(equals);
		} else if (action_value.equals("*")) {
			long equals = first_value * second_value;
			System.out.println(equals);
		} else if (action_value.equals("/")) {
			long equals = first_value / second_value;
			System.out.println(equals);
		} else {
			System.out.println("Error!");
		}
	}
}