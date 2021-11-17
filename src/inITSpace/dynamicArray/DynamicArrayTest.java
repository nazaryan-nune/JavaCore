package inITSpace.dynamicArray;


public class DynamicArrayTest {
    public static void main(String[] args) {

        DynamicArray dy = new DynamicArray();

        for (int i = 0; i < 17; i++) {
            dy.add(i);
        }
        dy.print();

        System.out.println(dy.getByIndex(-5));

        dy.delete(5);
        dy.print();

        int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};//
        dy.add(numbers);
        dy.print();

        dy.add(5, -1);
        dy.print();

        dy.set(5, 0);
        dy.print();

        System.out.println(dy.isEmpty());

        System.out.println(dy.isExists(5));
    }
}