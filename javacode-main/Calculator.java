    import java.util.Scanner;
    // Class calculator
    class Calculator {
        double num1;
        String operator;
        double num2;

        public Calculator(double num1, String operator, double num2) {
            this.num1 = num1;
            this.operator = operator;
            this.num2 = num2;
        }

        public void add() {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }

        public void subtract() {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }

        public void multiply() {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        }

        public void divide() {
            if (num2 != 0) {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        }

        public void power() {
            System.out.println(num1 + " ^ " + num2 + " = " + Math.pow(num1, num2));
        }

        public void modulo() {
            System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        }
    }


