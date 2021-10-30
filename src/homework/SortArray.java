package homework;

public class SortArray {
    public static void main(String[] args) {
        //Զանգվածի տարրերը դասավորել աճման կարգով
        int[] array = {10, 20, 5, 7, -8, 14, 100, 15, 78, 99, 0, 88, 75};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        //Զանգվածի տարրերը դասավորել նվազման կարգով
//        int[] array = {10, 20, 5, 7, -8, 14, 100, 15, 78, 99, 0, 88, 75};
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 1; j < array.length; j++) {
//                if (array[j] > array[j - 1]) {
//                    int temp = array[j];
//                    array[j] = array[j - 1];
//                    array[j - 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
    }
}