import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select operation:");
        System.out.println("1: Add");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4: Divide");

        System.out.print("Enter operation number: ");
        int operation = scanner.nextInt();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;
        switch (operation) {
            case 1: 
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2: 
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3: 
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4: 
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default:  
                System.out.println("Invalid operation selected.");
                break;
        }
    }
}