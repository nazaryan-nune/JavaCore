package chapter7.example11;

public class TestStack {
    public static void main(String[] args) {

        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        //Ստեկում ներմուծել թվեր
        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            myStack2.push(i);
        }

        //Ստեկից հանել ներմուծված տարրերը
        System.out.println("myStack1 ստեկի պարունակությունը՝ ");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("myStack2 ստեկի պարունակությունը՝ ");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());

//            այս օպերատորները անթույլատրելի են
//            myStack1.tos = -2;
//            myStack2.stack[3] = 100;
        }
    }
}