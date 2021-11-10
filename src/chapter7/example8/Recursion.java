package chapter7.example8;

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("3-ի ֆակտորիալը հավասր է՝ " + f.fact(3));
        System.out.println("4-ի ֆակտորիալը հավասր է՝ " + f.fact(4));
        System.out.println("5-ի ֆակտորիալը հավասր է՝ " + f.fact(5));
    }
}