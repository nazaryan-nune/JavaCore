package chapter7.example2;
//Կիրառել տիպերի ավտոմատ փոխակերպումը գերբեռնման դեպքում

public class OverloadDemo {
    void test() {
        System.out.println("Պարամետրերը բացակայում են");
    }

    //Գերբեռնվող մեթոդ, որը ստուգում է երկու ամբողջթիվ պարամետրերի առկայությունը
    void test(int a, int b) {
        System.out.println("a և b: " + a + " " + b);
    }

    //Գերբեռնվող մեթոդ, որը ստուգում է double տիպի պարամետրի առկայությունը
    void test(double a) {
        System.out.println("Ներքին փոխակերպում test(double a) կանչի պահին՝ " + a);
    }
}