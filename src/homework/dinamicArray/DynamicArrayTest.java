package homework.dinamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();

        for (int i = 7; i < 17; i++) {
            da.add(i);
        }

        da.print();

        System.out.println();
        System.out.println(+da.getByIndex(7));
    }
}