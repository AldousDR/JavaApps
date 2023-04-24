import java.util.Scanner;

public class Methods {

    public static void mainMenu() {
        System.out.println();
        System.out.println("Please select from below choices:" +
                "\n1. Add"
                + "\n2. Subtract" +
                "\n3. Multiply" +
                "\n4. Divide" +
                "\n5. Exit the program");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your choice: ");
        char choice = scanner.next().charAt(0);

        switch (choice) {
            case '1':
                add();
                break;
            case '2':
                subtract();
                break;
            case '3':
                multiply();
                break;
            case '4':
                divide();
                break;
            case '5':
                System.out.println("Thank you for using our calculator!");
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }


    }

    public static void add(){
        double num1 = 0, num2 = 0, sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        sum = num1 + num2;
        System.out.println("Result: " + sum);
        isContinue();
    }

    public static void subtract(){
        double num1 = 0, num2 = 0, diff = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        diff = num1 - num2;
        System.out.println("Result: " + diff);
        isContinue();
    }

    public static void multiply(){
        double num1 = 0, num2 = 0, product = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        product = num1 * num2;
        System.out.println("Result: " + product);
        isContinue();
    }

    public static void divide(){
        double num1 = 0, num2 = 0, quotient = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        quotient = num1 / num2;
        System.out.println("Result: " + quotient);
        isContinue();
    }

    public static void isContinue(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to continue? Y/N");
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("y")){
            mainMenu();
        }

    }

}
