package chapter6.box4;
//volume() մեթոդը վերադարձնում է զուգահեռագծի ծավալը
public class Box {
    double width;
    double height;
    double depth;

    //արտածել  զուգահեռագծի ծավալը
    double volume() {
        return  width * height * depth;
    }
}