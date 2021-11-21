package chapter7.example19Page216;
//Օգտագործել varargs ստանդարտ արգումենտների հետ

public class VarArgs2 {
    //Այս օրինակում msg-սովորական պարամետր է, իսկ v փոփոխվող երկարության պարամետր

    static void vaTest(String msg, int... v) {
        System.out.print(msg + " " + " պարունակությունը՝ ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Դիտարկենք  vaTest() մեթոդի կանչելու հնարավոր ձևերը
        vaTest("փոփոխվող երկարության 1 պարամետր", 10);
        vaTest("փոփոխվող երկարության 3 պարամետր", 1, 2, 3);
        vaTest("առանց փոփոխվող երկարության պարամետրի");

    }
}
