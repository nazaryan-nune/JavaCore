package chapter7.example15Page206;
//կատարելագործված Stack կլասը, որում օգտագործվում
// է զանգվածի երկարության հատկությունը

public class Stack {
    private int[] stack;
    private int tos;

    //ստեկի համար առանձնացնել հիշողություն և այն ինիցիալիզացնել
    Stack(int size) {
        stack = new int[size];
        tos = -1;
    }

    //ներմուծել տարր
    void push(int item) {
        if (tos == stack.length - 1) {
            //օգտագործել զանգվածի երկարության հատկությունը
            System.out.println("Stack is full");
        } else {
            stack[++tos] = item;
        }
    }

    //արտահանել տարր
    int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}