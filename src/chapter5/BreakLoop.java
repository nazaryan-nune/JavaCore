package chapter5;

//break օպերատորի կիրառումը ցիկլից դուրս գալու համար
public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 10) {
                break;   //դուրս գալ ցիկլից, եթե i փոփոխականի արժեքը հավասար է 10
            }
            System.out.println("i: " + i);
        }
        System.out.println("Ցիկլը ավարտված է։ ");
    }
}