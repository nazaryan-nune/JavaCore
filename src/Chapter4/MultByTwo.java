package Chapter4;

//Ձախ շեղման կիրառումը, որպես 2-ով բազմապատկելու արագ միջոց
public class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;
        for (i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}