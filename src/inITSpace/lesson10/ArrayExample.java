package inITSpace.lesson10;

public class ArrayExample {
    public static void main(String[] args) {
        //առաջադրանք 1․
        //տպել, թե որ էլեմենտներն են կրկնվում, իսկ կրկնման քանակը կարևոր չէ
        //տպել, օրինակ՝ 3-ը կրկնվում է, 6-ը կրկնվում է

        int[] array = {3, 6, 7, 9, 2, 3, 6, 13, 4, 5, 3};

        //ամեն ցիկլի ժամանակ համեմատում է զանգվածի տվյալ տարրը [i] մնացած տարրերի [j] հետ։
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i] + "-ը կրկնվում է");
                    break;
                }
            }
        }


        //առաջադրանք 2․
        //տպել true, եթե բոլոր էլեմենտները զույգ են,
        // եթե ոչ՝ false

        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}