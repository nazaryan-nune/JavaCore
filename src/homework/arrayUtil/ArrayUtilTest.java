package homework.arrayUtil;

public class ArrayUtilTest {
    public static void main(String[] args) {

        ArrayUtil aU = new ArrayUtil();

        //1.Տպել մասիվի բոլոր էլեմենտները
        int[] array = {2, -1, 5, 0, 8, -10, 32, 22, 11, -12, 77};
        aU.printArrayElements(array);


        //2.Տպել երկու մասիվներից, որն է պարունակում ամենամեծ թիվը
        int[] array2 = {1, 1, 0, 18, 20, 37, -12, 72};
        int arrayMax = aU.arrayMax(array);
        int array2Max = aU.arrayMax(array2);
        if (arrayMax > array2Max) {
            System.out.println("Ամենամեծ թիվը array-ի մեջ է՝ " + arrayMax);
        } else {
            System.out.println("Ամենամեծ թիվը array2-ի մեջ է՝ " + array2Max);
        }


        //3.Տպել երկու մասիվներից, որն է պարունակում ամենափոքր թիվը
        int arrayMin = aU.arrayMin(array);
        int array2Min = aU.arrayMin(array2);
        if (arrayMin < array2Min) {
            System.out.println("Ամենափոքր թիվը array-ի մեջ է՝ " + arrayMin);
        } else {
            System.out.println("Ամենափոքր թիվը array2-ի մեջ է՝ " + array2Min);
        }


        //4․ Տպել մասիվի բոլոր զույգ էլեմենտները
        aU.even(array);
        System.out.println();


        //5․ Տպել մասիվի բոլոր կենտ էլեմենտները
        aU.odd(array);
        System.out.println();


        //6.Տպել երկու մասիվներից, որն է պարունակում զույգ թվերի մեծ քանակ
        int arrayEvenNumbers = aU.evenNumbersAmount(array);
        int array2EvenNumbers = aU.evenNumbersAmount(array2);
        if (arrayEvenNumbers > array2EvenNumbers) {
            System.out.println("Զույգ թվերի մեծ քանակ պարունակում է array-ը` " + arrayEvenNumbers);
        } else {
            System.out.println("Զույգ թվերի մեծ քանակ պարունակում է array2-ը` " + array2EvenNumbers);//
        }


        //7.Տպել երկու մասիվներից, որն է պարունակում կենտ թվերի փոքր քանակ
        int arrayOddNumbers = aU.oddNumbersAmount(array);
        int array2OddNumbers = aU.oddNumbersAmount(array2);
        if (arrayOddNumbers < array2OddNumbers) {
            System.out.println("Կենտ թվերի փոքր քանակ պարունակում է array-ը` " + arrayOddNumbers);
        } else {
            System.out.println("Կենտ թվերի փոքր քանակ պարունակում է array2-ը` " + array2OddNumbers);
        }


        //8․ Տպել մասիվի բոլոր թվերի միջին թվաբանականը
        System.out.println("Մասիվի բոլոր թվերի միջին թվաբանականը` " + aU.arrayArithmeticAverage(array));


        //9․ Տպել մասիվի էլեմենտների գումարը

        System.out.println("array2 զանգվածի տարրերի գումարը՝ " + aU.arrayElementsSum(array2));
    }
}