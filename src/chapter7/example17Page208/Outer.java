package chapter7.example17Page208;
//Այս ծրագիրը չի կոմպիլացվում

public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    //սա ներքին կլաս է
    class Inner {
        int y = 10; //Inner կլասի լոկալ փոփոխական

        void display() {
            System.out.println("outer_x " + outer_x);
        }
    }
//    void showy () {
//        System.out.println(y); //ՍԽԱԼ՝  y փոփոխականը հասանելի չէ։
//    }
}
