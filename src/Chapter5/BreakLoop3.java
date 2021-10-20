package Chapter5;

//break օպերատորի կիրառումը ներդրված ցիկլերում
public class BreakLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Անցում " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break;             //դուրս գալ ցիկլից, j փոփոխականի արժեքը հավասար է 10
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Ցիկլերն ավարտված են։ ");
    }
}
