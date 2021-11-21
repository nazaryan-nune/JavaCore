package chapter7.example16Page207;
//Ցուցադրել ներքին կլասի կիրառությունը

public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    //սա ներքին կլաս է
    class Inner {
        void display() {
            System.out.println("outer_x = " + outer_x);
        }
    }
}