
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0; // Initialize the result variable

        while (true) {
            System.out.println("Enter the Operator (+, -, *, %):");
            String operator = input.next();

            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("%")) {
                System.out.println("Enter two integers:");
                int value1 = input.nextInt();
                int value2 = input.nextInt();

                if (operator.equals("+")) {
                    result = value1 + value2;
                } else if (operator.equals("-")) {
                    result = value1 - value2;
                } else if (operator.equals("*")) {
                    result = value1 * value2;
                } else if (operator.equals("%")) {
                    result = value1 % value2;
                }

                System.out.println("Result: " + result);
            } else {
                System.out.println("Invalid Operator. Please enter a valid operator.");
                input.close();
            }
        }
    }
}
