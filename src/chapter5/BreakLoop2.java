package chapter5;

//break օպերատորի կիրառումը while ցիկլից դուրս գալու համար
public class BreakLoop2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            if (i == 10) {
                break;  //դուրս գալ ցիկլից, եթե i փոփոխականի արժեքը հավասար է 10
            }
            System.out.println("i:" + i);
            i++;
        }
        System.out.println("Ցիկլը ավարտված է։ ");
    }
}