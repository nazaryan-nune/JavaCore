package inITSpace.scannerExample;

import java.util.Scanner;

public class ScannerExampleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a");
        int a = scanner.nextInt();
        System.out.println(a);
        System.out.println("please input b");
        int b= scanner.nextInt();

        System.out.println(b);
        System.out.println(a+b);

    }
}
