import java.util.Scanner;
    public class CalculatorTest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter number1, operator, and number2 separated by a space: ");
            double num1 = scanner.nextDouble();
            String operator = scanner.next();
            double num2 = scanner.nextDouble();


            // Object
            Calculator calculator = new Calculator(num1, operator, num2);

            switch (operator) {
                case "+" -> calculator.add();
                case "-" -> calculator.subtract();
                case "*" -> calculator.multiply();
                case "/" -> calculator.divide();
                case "^" -> calculator.power();
                case "%" -> calculator.modulo();
                default -> System.out.println("Invalid operator.");
            }
        }
    }

