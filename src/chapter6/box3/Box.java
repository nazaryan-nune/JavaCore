package chapter6.box3;
//Այս ծրագրում կիրառվում է Box կլասում ներմուծված մեթոդ

public class Box {
    double width;
    double height;
    double depth;

    //արտածել  զուգահեռանիստի ծավալը
    void volume() {
        System.out.print("Ծավալը հավասար է՝ ");
        System.out.println(width * height * depth);
    }
}