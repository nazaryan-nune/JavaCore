package homework.dynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();

        for (int i = 0; i < 17; i++) {
            da.add(i);
        }

        da.print();

        System.out.println();
        System.out.println(+da.getByIndex(24));
    }
}