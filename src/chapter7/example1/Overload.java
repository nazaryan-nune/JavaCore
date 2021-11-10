package chapter7.example1;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        //կանչել test() մեթոդի բոլոր տարբերակները
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("ob.test(123.25) կանչի արդյունքը՝ " + result);
    }
}