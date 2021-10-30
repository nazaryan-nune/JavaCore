package chapter6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        // Box կլասի յուրաքանչյուր օբյեկտ ինիցիալիզացնել
        myBox1.setDim(10, 20, 15);
        myBox1.setDim(3, 6, 9);

        //ստանալ առաջին զուգահեռագծի ծավալը
        vol = myBox1.volume();
        System.out.println("Ծավալը հավասար է՝ " + vol);

        //ստանալ երկրորդ զուգահեռագծի ծավալը
        vol = myBox2.volume();
        System.out.println("Ծավալը հավասար է՝ " + vol);
    }
}
