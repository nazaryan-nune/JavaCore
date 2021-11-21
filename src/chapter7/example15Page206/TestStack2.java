package chapter7.example15Page206;

public class TestStack2 {
    public static void main(String[] args) {

        Stack myStack1 = new Stack(5);
        Stack myStack2 = new Stack(8);

        //ներմուծել տարրեր
        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }

        //արտածել տարրեր
        for (int i = 0; i < 5; i++) {
            System.out.print(myStack1.pop() + " ");
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            System.out.print(myStack2.pop() + " ");
        }
    }
}