package chapter7.example1;

public class OverloadDemo {
    void test() {
        System.out.println("Պարամետրերը բացակայում են");
    }

    //գերբեռնվող մեթոդ, որը ստուգում է ամբողջթիվ պարամետրի առկայությունը
    void test(int a) {
        System.out.println("a: " + a);
    }

    //գերբեռնվող մեթոդ, որը ստուգում է երկու ամբողջթիվ պարամետրերի առկայությունը
    void test(int a, int b) {
        System.out.println("a և b: " + a + " " + b);
    }

    //գերբեռնվող մեթոդ, որը ստուգում է double տիպի պարամետրի առկայությունը
    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}