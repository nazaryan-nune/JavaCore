package chapter6.box6;

public class BoxDemo6 {
    public static void main(String[] args) {
        //հայտարարել, առանձնացնել հիշողություն և ինիցիալիզացնել Box տիպի օբյեկտներ
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        //հաշվել առաջին զուգահեռագծի ծավալը
        vol = myBox1.volume();
        System.out.println("Ծավալը հավասար է՝ " + vol);

        //հաշվել երկրորդ զուգահեռագծի ծավալը
        vol = myBox2.volume();
        System.out.println("Ծավալը հավասար է՝ " + vol);
    }
}