package Chapter5;

//Ցիկլի մարմինը կարող է դատարկ լինել
public class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;

        //հաշվել i և j փոփոխականների միջին արժեքը

        while (++i < --j) ; //այս ցիկլը չունի մարմին
        System.out.println("Միջին արժեքը հավասար է " + i);
    }
}