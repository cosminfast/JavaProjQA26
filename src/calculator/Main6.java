package calculator;


import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        LogicalOperations logicalOperations = new LogicalOperations();

        List<Integer> integerList = logicalOperations.getListToNumber(100);

        integerList.add(0, 1);

        //Scrieti o metoda Java, care sa primeasca doi parametrii:
        // un parametru de tip Lista, iar celalalt un numar intreg.
        // Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista
        // , fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.
//        logicalOperations.printListFromNumber(integerList,80);

//        logicalOperations.printList(integerList);

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(3.3,3.3));
    }
}
