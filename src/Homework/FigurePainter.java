package Homework;

public class FigurePainter {
    //Առաջադրանք առաջին
    public static void main(String[] args) {
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //Առաջադրանք երկրորդ
        for (int c = 0; c < 4; c++) {
            for (int d = 0; d < 3 - c; d++) {
                System.out.print("  ");
            }
            for (int e = 0; e <= c; e++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();

        //Առաջադրանք երրորդ
        for (int f = 0; f < 4; f++) {
            for (int g = 0; g < 4 - f; g++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //Առաջադրանք չորրորդ
        for (int h = 0; h < 4; h++) {
            for (int i = 0; i < h; i++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 4 - h; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //Առաջադրանք հինգերորդ
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3-k; l++) {
                System.out.print(" ");
            }
            for (int m = 0; m <= k; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int h = 0; h < 4; h++) {
            for (int i = 0; i < h; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 4 - h; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}