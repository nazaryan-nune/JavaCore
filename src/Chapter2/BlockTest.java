package Chapter2;

public class BlockTest {
    public static void main(String[] args) {
        int x, y;
        // адресатом этого оператора цикла служит блок кода
        y = 20;

        for (x = 0; x < 10; x++) {
            System.out.println("Знaчeниe х: "+x);
            System.out.println("Знaчeниe y: "+y);
            y = y - 2;
        }
    }
}
