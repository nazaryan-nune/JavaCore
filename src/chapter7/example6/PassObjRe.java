package chapter7.example6;

public class PassObjRe {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);
        System.out.println("ob.a և ob.b մինչ կանչը՝ " + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println("ob.a և ob.b կանչից հետո՝ " + ob.a + " " + ob.b);
    }
}