package calculator;

public class Calculator {

    public double sum(int firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sum(int x, int y){
        return x+y;
    }
    public int sum(int x, int y, int z){
        return x+y+z;
    }
    public double sum(double x, double y){
        return x+y;
    }

    public int substract(int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        return result;
    }

    public int multiply(int firstNumber, int secondNumber){
        int result = firstNumber * secondNumber;
        return result;
    }

    public int divide(int firstNumber, int secondNumber){
        int result = firstNumber / secondNumber;
        return result;
    }

    public int modulus(int firstNumber, int secondNumber){
        int result = firstNumber % secondNumber;
        return result;
    }



}
