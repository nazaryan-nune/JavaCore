package chapter3;

public class Promote {
    public static void main(String[] args) {
        byte b = 42;
        char с = 'а';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / с) - (d * s);
        System.out.println((f * b) + "+" + (i / с) + "-" + (d * s));
        System.out.println("result = " + result);
    }
}
