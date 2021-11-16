package newHomework;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, -1, 5, 8, -10, 32, -22, 11, -12, 77};

        //1.Տպել մասիվի բոլոր էլեմենտները
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        //2. Տպել մասիվի ամենամեծ թիվը
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);


        //3․ Տպել մասիվի ամենափոքր թիվը
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);


        //4․ Տպել մասիվի բոլոր զույգ էլեմենտները
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();


        //5․ Տպել մասիվի բոլոր կենտ էլեմենտները
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();


        //6. Տպել զույգերի քանակը
        int evenNumbersAmount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 == 0) {
                evenNumbersAmount++;
            }
        }
        System.out.println(evenNumbersAmount);


        //7․ Տպել կենտերի քանակը
        int oddNumbersAmount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 != 0) {
                oddNumbersAmount++;
            }
        }
        System.out.println(oddNumbersAmount);


        //8․ Տպել մասիվի բոլոր թվերի միջին թվաբանականը
        double arrayArithmeticAverage = 0;
        for (int i = 0; i < array.length; i++) {
            arrayArithmeticAverage += array[i];
        }
        System.out.println(arrayArithmeticAverage / array.length);


        //9․ Տպել մասիվի էլեմենտների գումարը
        int arrayElementsSum = 0;
        for (int i = 0; i < array.length; i++) {
            arrayElementsSum += array[i];
        }
        System.out.println(arrayElementsSum);
    }
}