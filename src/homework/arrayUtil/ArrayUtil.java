package homework.arrayUtil;

public class ArrayUtil {

    //1.Տպել մասիվի բոլոր էլեմենտները

    void printArrayElements(int[] array) {
        System.out.print("Մասիվի էլեմենտներն են՝ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //2. Տպել մասիվի ամենամեծ թիվը

    int arrayMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //3․ Տպել մասիվի ամենափոքր թիվը

    int arrayMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


    //4․ Տպել մասիվի բոլոր զույգ էլեմենտները

    int[] onlyEvens(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 == 0) {
                count++;
            }
        }
        int[] evenNumbers = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 == 0) {
                evenNumbers[index++] = array[i];
            }
        }
        return evenNumbers;
    }


    //5․ Տպել մասիվի բոլոր կենտ էլեմենտները

    int[] onlyOdds(int[] array) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
//                System.out.println(array[i]);
                count++;
            }
        }
        int[] oddNumbers = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddNumbers[index++] = array[i];
            }
        }
        return oddNumbers;
    }


    //6. Տպել զույգերի քանակը

    int evenNumbersAmount(int[] array) {
        int evenNumbersAmount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 == 0) {
                evenNumbersAmount++;
            }
        }
        return evenNumbersAmount;
    }


    //7․ Տպել կենտերի քանակը
    int oddNumbersAmount(int[] array) {
        int oddNumbersAmount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddNumbersAmount++;
            }
        }
        return oddNumbersAmount;
    }


    //8․ Տպել մասիվի բոլոր թվերի միջին թվաբանականը

    double arrayArithmeticAverage(int[] array) {
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        return average;
    }


    //9․ Տպել մասիվի էլեմենտների գումարը

    int arrayElementsSum(int[] array) {
        int arrayElementsSum = 0;
        for (int i = 0; i < array.length; i++) {
            arrayElementsSum += array[i];
        }
        return arrayElementsSum;
    }

}