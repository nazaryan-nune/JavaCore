package chapter7.example4;
//Օբյեկտները փոխանցվում են մեթոդներին որպես պարամետրեր

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    //վերադարձնել true տրամաբանական արժեք, եթե որպես o պարամետր
    // նշված է կանչող օբյեկտը
    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }
}