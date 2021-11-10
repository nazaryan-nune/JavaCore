package chapter7.example10;

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();

        //Այս օպերատորները ճիշտ են, ուստի а և Ь անդամները տվյալ կլասի հասանելի են непосредственно
        ob.a = 10;
        ob.b = 20;
// Այս օպերատորը ճիշտ չէ և հանգեցնում է սխալի
        //ob.c=100; //ՍԽԱԼ!

//տվյալ կլասի c անդամի հասանելիությունը պետք է իրականացվի իր կլասի մեթոդներով
        ob.setc(100); //ՃԻՇՏ Է!
        System.out.println("a, b և c` " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
