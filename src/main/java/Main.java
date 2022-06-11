import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        int typeOper;
        System.out.println("Hello, it is the Calculator\n" +
                "which help you to execute simple math: ");
        System.out.println("X: " + x + "; Y: " + y);

        Scanner in = new Scanner(System.in);
        System.out.print("Input a new number X (type INT): ");
        x = in.nextInt();
        System.out.print("Input a new number Y (type INT): ");
        y = in.nextInt();
        System.out.printf("Your new numbers X: %d; Y: %d  \n", x, y);
        System.out.print("""
                Choose one of the operation type as described below
                1 -> Summation
                2 -> Subtraction
                3 -> Multiplication
                4 -> Division
                :\s""");
        typeOper = in.nextInt();
        in.close();

        System.out.println("--------Summary-------");

        if (typeOper == 1) {
            Calc calculator = new Calc(x, y);
            calculator.sum();
        } else if (typeOper == 2) {
            Calc calculator = new Calc(x, y);
            calculator.subtract();
        } else if (typeOper == 3) {
            Calc calculator = new Calc(x, y);
            calculator.multiply();
        } else if (typeOper == 4) {
            Calc calculator = new Calc(x, y);
            calculator.divide();
        } else {
            System.out.print("""
                The selected operation type is invalid.
                Enter from 1 to 4.
                Try again!
                """);
        }
    }
}
