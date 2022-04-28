package calculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
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

    public List<Integer> getList(){
        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers in the list: ");
        do {
            try {
                list.add(scan.nextInt());
            }catch (InputMismatchException e){
                if (scan.nextLine().equalsIgnoreCase("q")){
                    break;
                }else {
                    System.out.println("Invalid value given" );
                }
            }

        }while (true);
        return list;
    }



}
