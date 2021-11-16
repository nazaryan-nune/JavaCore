package chapter6.box7;
//Ծրագրի այս օրինակում զուգահեռանիստի չափումների ինիցիալիզացման համար Box կլասում
// կիրառվում է պարամետրացված կոնստրուկտոր

public class Box {
    double width;
    double height;
    double depth;


    //Սա Box կլասի կոնստրուկտոր է
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //հաշվել և վերադարձնել ծավալը
    double volume() {
        return width * height * depth;
    }
}