package chapter6.box5;
//Այս ծրագրում կիրառվում է պարամետրերով մեթոդ

public class Box {
    double width;
    double height;
    double depth;


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