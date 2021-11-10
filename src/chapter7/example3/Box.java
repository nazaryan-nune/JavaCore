package chapter7.example3;
//Այս օրինակում Box class-ում կոնստրուկտորները սահմանվում են զուգահեռանիստի
//չափսերը երեք տարբեր եղանակներով ինիցիալիզացնելու համար

public class Box {
    double width;
    double height;
    double depth;

    //կոնստրուկտոր, որն օգտագործվում է, երբ
    //նշվում են բոլոր չափումները

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //կոնստրուկտոր, որն օգտագործվում է, երբ
    //ոչ մի չափում հայտնի չէ

    Box() {
        width = -1; //-1 արժեք օգտագործել չինիցիալիզացված  զուգահեռանիստ հատկանշելու համար
        height = -1;
        depth = -1;
    }

    //կոնստրուկտոր, որն օգտագործվում է, երբ ստեղծվում է խորանարդ

    Box(double len) {
        width = height = depth = len;
    }

    //հաշվարկել և վերադարձնել ծավալը
    double volume() {
        return width * height * depth;
    }
}