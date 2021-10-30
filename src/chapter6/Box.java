package chapter6;

public class Box {
    double width;
    double height;
    double depth;

//    //արտածել  զուգահեռագծի ծավալը
//    void volume() {
//        System.out.print("Ծավալը հավասար է՝ ");
//        System.out.println(width * height * depth);
//    }


    //հաշվել և վերադարձնել ծավալը
    double volume() {
        return width * height * depth;
    }


    //հատկանշել զուգահեռագծի չափերը
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}