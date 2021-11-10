package chapter7.example6;
//Օբյեկտները փոխանցվում են իրենց հղումով

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    //փոխանցել օբյեկտ
    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }
}