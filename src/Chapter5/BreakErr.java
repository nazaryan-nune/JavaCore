package Chapter5;

//Այս ծրագիրը պարունակում է սխալ
public class BreakErr {
    public static void main(String[] args) {
        one:
        for (int i = 0; i < 3; i++) {
            System.out.print("Անցում " + i + ": ");
        }
        for (int j = 0; j < 100; j++) {
            if (j == 10) {
                break one; //ՍԽԱԼ
            }
            System.out.print(j + " ");
        }
    }
}