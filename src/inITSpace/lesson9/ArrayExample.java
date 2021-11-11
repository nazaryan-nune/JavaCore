package inITSpace.lesson9;

public class ArrayExample {
    public static void main(String[] args) {

        //առաջադրանք 1․
        // պետք է տպել տրված n թվի ինդեքսը:

        int[] array = {3, 6, 9, 3, 1, 5, 8, 44, 63, 21, 44};

        int n = 44;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                index = i;
                break;       //այլապես կտպի վերջի գտած n-ի ինդեքսը, օրինակ 44-ի դեպքում ինդեքսը կլինի 10։
                            // Իսկ եթե break հատկանշենք, հենց գտավ n-ը ցիկլից դուրս կգա ու կտպի առաջի n-ի ինդեքսը
            }
        }
        System.out.println(index);


        // առաջադրանք 2․
        // զանգվածի տարրերը դասաորել աճման կարգով
        // int array = {3, 6, 9, 3, 1, 5, 8, 44, 63, 21, 44};

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
    }
}