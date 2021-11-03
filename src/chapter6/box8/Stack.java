package chapter6.box8;
//Այս կլասում սահմանվում է ամբողջաթիվ ստեկ, որտեղ կարելի է պահել մինչև 10 ամբողջաթիվ արժեք

public class Stack {
    int[] stack = new int[10];
    int tos;

    // инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    // ստեկում ներմուծել տարր
    void push(int item) {
        if (tos == 9) {
            System.out.println("Ստեկը լրացված է");
        } else {
            stack[++tos] = item;
        }
    }

    // ստեկից հանել տարր
    int pop() {
        if (tos < 0) {
            System.out.println("ստեկը դատարկ է");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}