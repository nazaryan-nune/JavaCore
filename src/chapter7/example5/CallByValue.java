package chapter7.example5;

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;
        System.out.println("a և b մինչ կանչը՝ " + a + " " + b);
        ob.meth(a, b);
        System.out.println("a և b կանչից հետո՝ " + a + " " + b);
    }
}