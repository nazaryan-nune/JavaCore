package chapter4;

//Ցուցադրել ? տերնար գործողության կիրառությունը
public class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;    //ստանալ i փոփոխականի բացարձակ արժեքը
        System.out.print(i + "-ի " + "բացարձակ արժեքը ");
        System.out.println("հավասար է " + k);
        i = -10;
        k = i < 0 ? -i : i;          //ստանալ i փոփոխականի բացարձակ արժեքը
        System.out.print(i + "-ի " + "բացարձակ արժեքը ");
        System.out.println("հավասար է " + k);
    }
}