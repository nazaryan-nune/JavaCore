package homework.figurePainter;

public class FigurePainter {

    void figureOne(int a, char v) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    void figureTwo(int b, char w) {
        for (int i = 0; i < b; i++) {
            for (int j = b; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(w + " ");
            }
            System.out.println();
        }
    }

    void figureThree(int c, char x) {
        for (int i = 0; i < c; i++) {
            for (int j = c; j > i; j--) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    void figureFour(int d, char y) {
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = d; j > i; j--) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    void figureFive(int e, char z) {
        for (int i = 0; i < e; i++) {
            for (int j = e; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(z + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < e - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = e - 1; j > i; j--) {
                System.out.print(" " + z);
            }
            System.out.println();
        }
    }
}