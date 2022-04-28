package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {

    public int getInt() {
        Scanner scan = new Scanner(System.in);
        int x;
        do {
            try {
                System.out.println("Enter a number:");
                x = scan.nextInt();
                return x;
            } catch (InputMismatchException e) {
                System.err.println("Given value '"+scan.nextLine()+"' is not valid. Please enter a numeric value.");
            }
        }while (true);
    }

}
