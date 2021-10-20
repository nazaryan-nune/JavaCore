package Chapter5;

//break օպերատորի կիրառումը՝ ներդրված ցիկլերից դուրս գալու համար
public class BreakLoop4 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.print("Անցում " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break outer; //դուրս գալ երկու ցիկլերից
                }
                System.out.print(j + " ");
            }
            System.out.println("Այս տողը չի արտածվի");
        }
        System.out.println("Ցիկլերն ավարտված են։ ");
    }
}