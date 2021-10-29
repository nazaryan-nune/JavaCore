package chapter5;

//Ցիկլերը կարող են լինել ներդրված
public class Nested {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 10; i++) {
            for (j = i; j < 10; j++) {
                System.out.print(". ");
            }
            System.out.println();
        }
    }
}