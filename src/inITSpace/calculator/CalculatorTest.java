package inITSpace.calculator;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.plus(5, 7));
        System.out.println(calculator.minus(15, 27));
        System.out.println(calculator.divide(10, 3));
        System.out.println(calculator.multiple(45, 17));
    }
}