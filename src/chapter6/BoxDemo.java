package chapter6;

//Այս կլասում հայտարարվում է օբյեկտ Box տիպի

public class BoxDemo {
    public static void main(String[] args) {

        Box myBox = new Box();
        double vol;

        //myBox օբյեկտի փոփոխականներին վերագրել արժեքներ
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;
        //հաշվել զուգահեռագծի ծավալը
        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Ծավալը հավասար է՝ " + vol);
    }
}