package test;

import study.Calculator;
import study.WrongOperatorException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /, %): ");
        String operator = sc.next();

        try {
            int result = Calculator.calculate(num1, num2, operator);
            System.out.println("Result: " + result);
        } catch (WrongOperatorException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Math Error: " + e.getMessage());
        }

        sc.close();
    }
}
