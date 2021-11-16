package chapter6.box4;
//volume() մեթոդը վերադարձնում է զուգահեռանիստի ծավալը
public class Box {
    double width;
    double height;
    double depth;

    //հաշվել և վերադարձնել զուգահեռանիստի ծավալը
    double volume() {
        return  width * height * depth;
    }
}