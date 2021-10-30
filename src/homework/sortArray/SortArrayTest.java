package homework.sortArray;

public class SortArrayTest {
    public static void main(String[] args) {

        SortArray sA = new SortArray();

        int[] array = {10, 20, 5, 7, -8, 14, 100, 15, 78, 99, 0, 88, 75};

        //1. Զանգվածի տարրերը դասավորել աճման կարգով
        sA.arraySortToMax(array);

        System.out.println();
        //2. Զանգվածի տարրերը դասավորել նվազման կարգով
        sA.arraySortToMin(array);
    }
}