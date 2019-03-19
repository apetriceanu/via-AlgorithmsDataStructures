package dk.via;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String expression, doMore;

        try {
            Scanner in = new Scanner(System.in);

            do {
                Calculator c = new Calculator();
                System.out.print("Type your postfix: ");
                expression = in.nextLine();

                System.out.println();
                System.out.println("Result: " + c.calculate(expression));
                System.out.println("Want to calculate more? ");
                doMore = in.nextLine();
                System.out.println();
            } while (doMore.equalsIgnoreCase("y"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}