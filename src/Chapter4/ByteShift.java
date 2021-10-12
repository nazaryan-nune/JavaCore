package Chapter4;

//byte տիպի արժեքի շեղումը ձախ
public class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("a-ի նախնական արժեքը՝ " + a);
        System.out.println("i և b՝ " + i + " " + b);
    }
}