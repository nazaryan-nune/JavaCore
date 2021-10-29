package chapter5;

//switch օպերատորի կիրառման պարզ օրինակ
public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i հավասար է զրո։");
                    break;
                case 1:
                    System.out.println("i հավասար է մեկ։");
                    break;
                case 2:
                    System.out.println("i հավասար է երկու։");
                    break;
                case 3:
                    System.out.println("i հավասար է երեք։");
                    break;
                default:
                    System.out.println("i մեծ է երեքից։");
            }
        }
    }
}