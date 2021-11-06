package inITSpace.calculator;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.plus(5, 7));
        System.out.println(calculator.minus(5, 7));
        System.out.println(calculator.divide(5, 7));
        System.out.println(calculator.multiple(5, 7));
    }
}