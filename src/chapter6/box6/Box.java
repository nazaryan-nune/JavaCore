package chapter6.box6;
//Ծրագրի այս օրինակում զուգահեռանիստի չափումների ինիցիալիզացման համար Box կլասում կիրառվում է կոնստրուկտոր

public class Box {
    double width;
    double height;
    double depth;


    //Սա Box կլասի կոնստրուկտոր է

    Box() {
        System.out.println("Box օբյեկտի կոնստրուկտավորում");
        width = 10;
        height = 10;
        depth = 10;
    }

    //հաշվել և վերադարձնել ծավալը
    double volume() {
        return width * height * depth;
    }
}