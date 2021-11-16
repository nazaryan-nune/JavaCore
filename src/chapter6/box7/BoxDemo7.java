package chapter6.box7;

public class BoxDemo7 {
    public static void main(String[] args) {
        //հայտարարել, առանձնացնել հիշողություն և ինիցիալիզացնել Box տիպի օբյեկտները
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);
        double vol;

        //հաշվել առաջին զուգահեռանիստի ծավալը
        vol = myBox1.volume();
        System.out.println("Ծավալը հավասար է՝ " + vol);

        //հաշվել երկրորդ զուգահեռանիստի ծավալը
        vol = myBox2.volume();
        System.out.println("Ծավալը հավասար է՝ " + vol);
    }

}
