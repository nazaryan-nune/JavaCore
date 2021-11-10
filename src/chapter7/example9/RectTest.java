package chapter7.example9;
//ռեկուրսիայի ևս մեկ օրինակ

public class RectTest {
    int values[];

    RectTest(int i) {
        values = new int[i];
    }

    //ռեկուրսիվ արտածել զանգվածի տարրերը
    void printArray(int i) {
        if (i == 0) {
            return;
        } else {
            printArray(i - 1);
            System.out.println("[" + (i - 1) + "] " + values[i - 1]);
        }
    }
}