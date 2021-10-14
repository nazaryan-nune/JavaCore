package Homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, -1, 5, 8, -10, 32, -22, 11, -12, 77};

        //1.Տպել մասիվի բոլոր էլեմենտները
        System.out.print("Մասիվի էլեմենտներն են՝ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println('\n');


        //2. Տպել մասիվի ամենամեծ թիվը
        int arrayMaxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > arrayMaxNumber) {
                arrayMaxNumber = array[i];
            }
        }
        System.out.println("Մասիվի ամենամեծ թիվը` " + arrayMaxNumber + '\n');


        //3․ Տպել մասիվի ամենափոքր թիվը
        int arrayMinNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < arrayMinNumber) {
                arrayMinNumber = array[i];
            }
        }
        System.out.println("Մասիվի ամենափոքր թիվը` " + arrayMinNumber + '\n');


        //4․ Տպել մասիվի բոլոր զույգ էլեմենտները
        System.out.print("Մասիվի զույգ էլեմենտներն են՝ ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println('\n');


        //5․ Տպել մասիվի բոլոր կենտ էլեմենտները
        System.out.print("Մասիվի կենտ էլեմենտներն են՝ ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println('\n');


        //6. Տպել զույգերի քանակը
        int evenNumbersAmount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbersAmount++;
            }
        }
        System.out.println("Մասիվի զույգ էլեմենտների քանակը՝ " + evenNumbersAmount + '\n');


        //7․ Տպել կենտերի քանակը
        int oddNumbersAmount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddNumbersAmount++;
            }
        }
        System.out.println("Մասիվի կենտ էլեմենտների քանակը՝ " + oddNumbersAmount + '\n');


        //8․ Տպել մասիվի բոլոր թվերի միջին թվաբանականը
        double arrayArithmeticAverage = 0;
        for (int i = 0; i < array.length; i++) {
            arrayArithmeticAverage += array[i];
        }
        System.out.println("Մասիվի բոլոր թվերի միջին թվաբանականը` " + arrayArithmeticAverage / array.length + '\n');


        //9․ Տպել մասիվի էլեմենտների գումարը
        int arrayElementsSum = 0;
        for (int i = 0; i < array.length; i++) {
            arrayElementsSum += array[i];
        }
        System.out.println("Մասիվի էլեմենտների գումարը` " + arrayElementsSum);
    }
}