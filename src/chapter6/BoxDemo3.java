package chapter6;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        // myBox1 օբյեկտի փոփոխականներին վերագրել արժեքներ
        myBox2.width = 10;
        myBox2.height = 20;
        myBox2.depth = 15;

        // myBox2 օբյեկտի փոփոխականներին վերագրել արժեքներ
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        //հաշվել առաջին զուգահեռագծի ծավալը
        myBox1.volume();

        //հաշվել երկրորդ զուգահեռագծի ծավալը
        myBox2.volume();
    }
}