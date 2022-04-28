package calculator;

public class Main3 {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        LogicalOperations op = new LogicalOperations();


        System.out.println(op.getMax(12, 41));
        System.out.println(op.verifyTextFastTrack("FastTrack"));

        String text = "FastTrack";
        int number = 2;
//

        System.out.println(calc.sum(5, 1));
        System.out.println(calc.substract(5, 4));


        System.out.println(op.verifyTextAndNumber(text, number));

    }


}

