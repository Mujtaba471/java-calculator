public class Calculator {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;

        // Addition
        double sum = add(num1, num2);
        System.out.println("Sum: " + sum);

        // Subtraction
        double difference = subtract(num1, num2);
        System.out.println("Difference: " + difference);

        // Multiplication
        double product = multiply(num1, num2);
        System.out.println("Product: " + product);

        // Division
        double quotient = divide(num1, num2);
        System.out.println("Quotient: " + quotient);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero!");
            return Double.NaN;
        }
    }
}
public class Calculator {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;

        // Addition
        double sum = add(num1, num2);
        System.out.println("Sum: " + sum);

        // Subtraction
        double difference = subtract(num1, num2);
        System.out.println("Difference: " + difference);

        // Multiplication
        double product = multiply(num1, num2);
        System.out.println("Product: " + product);

        // Division
        double quotient = divide(num1, num2);
        System.out.println("Quotient: " + quotient);

        // Modulus
        double remainder = modulus(num1, num2);
        System.out.println("Remainder: " + remainder);

        // Exponentiation
        double exponentiation = power(num1, num2);
        System.out.println("Exponentiation: " + exponentiation);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero!");
            return Double.NaN;
        }
    }

    // New method for modulus
    public static double modulus(double a, double b) {
        return a % b;
    }

    // New method for exponentiation
    public static double power(double a, double b) {
        return Math.pow(a, b);
    }
}
