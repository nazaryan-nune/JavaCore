package chapter6.box3;

public class Box {
    double width;
    double height;
    double depth;

    //արտածել  զուգահեռագծի ծավալը
    void volume() {
        System.out.print("Ծավալը հավասար է՝ ");
        System.out.println(width * height * depth);
    }
}