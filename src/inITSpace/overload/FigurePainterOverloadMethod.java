package inITSpace.overload;

public class FigurePainterOverloadMethod {

    void figureFive(int n, String c) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(c + " ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            System.out.println();

        }
    }

    void figureFive(int n) {
        figureFive(5, "*");
    }

    void figureFive(int n, char c) {
        figureFive(n, c + "");
    }

    void figureFive() {
        figureFive(10);
    }
}