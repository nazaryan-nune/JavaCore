package Chapter5;

//Օգտագործել սիմվոլային տողերը switch օպերատորը ղեկավարելու համար
public class StringSwitch {
    public static void main(String[] args) {
        String str = "երկու";
        switch (str) {
            case "մեկ":
                System.out.println("մեկ");
                break;
            case "երկու":
                System.out.println("երկու");
                break;
            case "երեք":
                System.out.println("երեք");
                break;
            default:
                System.out.println("չի համընկնում");
        }
    }
}