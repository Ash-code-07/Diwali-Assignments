package test;

import java.util.Scanner;

public class CheckAlphanumeric {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter A String : ");
        String str = sc.nextLine();

        if (str.matches("[a-zA-Z0-9]+")) {
            System.out.println("String contains only alphanumeric characters");
        } else {
            System.out.println("String contains non-alphanumeric characters");
        }
    }
}
