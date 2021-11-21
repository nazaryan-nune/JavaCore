package chapter7.example18Page215;
//Ցուցադրել varargs կիրառությունը

public class VarArgs {
    //հայտարարվում է արգումենտների փոփոխվող քանակությամբ մեթոդ
    static void vaTest(int... v) {
        System.out.print("Արգումենտների քանակ՝ " + v.length + " Պարունակությունը՝ ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Դիտարկենք  vaTest() մեթոդի կանչելու հնարավոր ձևերը
        vaTest(10);//1 արգումենտ
        vaTest(1, 2, 3);//3 արգումենտ
        vaTest();//առանց արգումենտների
    }
}