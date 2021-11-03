package chapter6.box4;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        // myBox1 օբյեկտի փոփոխականներին վերագրել արժեքներ
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        // myBox2 օբյեկտի փոփոխականներին վերագրել արժեքներ
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        //հաշվել առաջին զուգահեռագծի ծավալը
        vol = myBox1.volume();
        System.out.println("Ծավալը հավասար է՝ " + vol);

        //հաշվել երկրորդ զուգահեռագծի ծավալը
        vol = myBox2.volume();
        System.out.println("Ծավալը հավասար է՝ " + vol);
    }
}