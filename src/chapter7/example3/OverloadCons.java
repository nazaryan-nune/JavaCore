package chapter7.example3;

public class OverloadCons {
    public static void main(String[] args) {
        //ստեղծել զուգահեռանիստներ՝ օգտագործելով տարբեր կոնստրուկտորներ
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        //ստանալ առաջին զուգահեռանիստի ծավալը
        vol = mybox1.volume();
        System.out.println("mybox1 ծավալը հավասր է՝ " + vol);

        //ստանալ երկրորդ զուգահեռանիստի ծավալը
        vol = mybox2.volume();
        System.out.println("mybox2 ծավալը հավասր է՝ " + vol);

        //ստանալ խորանարդի ծավալը
        vol = mycube.volume();
        System.out.println("mycube ծավալը հավասր է` " + vol);
    }
}