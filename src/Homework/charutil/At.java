package Homework.charutil;

public class At {
    public static void main(String[] args) {

        char[] bolol = {'t', 'a', 'b', 'o', 'l', 'b' };
        boolean arraySymbolsContains = false;
        for (int i = 0; i < bolol.length - 2; i++) {
            if (bolol[i] == 'b' && bolol[i + 2] == 'b') {
                arraySymbolsContains = true;
            }
        }
        System.out.println(arraySymbolsContains + "      //քանի որ զանգվածը <<bob>> բառը պարունակում է" + "\n");

    }
}
