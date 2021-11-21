package chapter7.example20Page216;

public class VarArgs3 {
    static void vaTest(int... v) {
        System.out.print("vaTest(int ... )` " + "արգումենտների քանակը՝ " + v.length + "," + " պարունակությունը՝ ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }


    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean ... )՝ " + "արգումենտների քանակը՝ " + v.length + "," + " պարունակությունը՝ ");
        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.print("vaTest(String, int ... v)՝ " + "արգումենտների քանակը՝ " + v.length + "," + " պարունակությունը՝ ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        vaTest(1, 2, 3);
        vaTest("Проверка: ", 10, 20);
        vaTest(true, false, false);
    }
}
