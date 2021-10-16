package Chapter5;

//Ցուցադրել do-while ցիկլի օպերատորի կիրառությունը
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("քայլ " + n);
            n--;
        } while (n > 0);
    }
}