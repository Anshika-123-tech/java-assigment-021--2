import java.util.Scanner;

public class UserInterface {

    Scanner sc = new Scanner(System.in);
    Calculator calc = new Calculator();

    public void performAddition() {
        System.out.println("Choose Add Method:");
        System.out.println("1. add(int, int)");
        System.out.println("2. add(double, double)");
        System.out.println("3. add(int, int, int)");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter two integers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Result: " + calc.add(a, b));
        } else if (choice == 2) {
            System.out.print("Enter two doubles: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            System.out.println("Result: " + calc.add(a, b));
        } else if (choice == 3) {
            System.out.print("Enter three integers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("Result: " + calc.add(a, b, c));
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public void performSubtraction() {
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Result: " + calc.subtract(a, b));
    }

    public void performMultiplication() {
        System.out.print("Enter two double numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Result: " + calc.multiply(a, b));
    }

    public void performDivision() {
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            System.out.println("Result: " + calc.divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void mainMenu() {
        while (true) {
            System.out.println("\n=== Calculator Application ===");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 5:
                    System.out.println("Thank you for using the Calculator!");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    public static void main(String[] args) {
        new UserInterface().mainMenu();
    }
}
