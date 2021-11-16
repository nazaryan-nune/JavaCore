package newHomework;

public class CharUtil {
    public static void main(String[] args) {

        //1) Ունենք հետևյալ մասիվը՝
        //char[] bolola = {'b','o','l','o','l','a'};
        //ունենք նաև մի սինվոլ՝ char c = 'o';
        //Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։

        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int oSymbolAmount = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                oSymbolAmount++;
            }
        }
        System.out.println(oSymbolAmount);


        //2)Ունենք հետևյալ մասիվը՝
        //char[] bolola = {'b','o','l','o','l','a'};
        //պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։

        System.out.println(bolola[bolola.length / 2] + " and " + bolola[(bolola.length / 2) + 1]);


        //3)Ունենք հետևյալ մասիվը՝՝
        //char[] bolola = {'b','o','l','o','l','a'};
        //պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false

        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1] == 'y') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //4)Ունենք հետևյալ մասիվը՝
        //char[] bolol = {'b','a',b','o','l','a'};
        //Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սիմվոլ։

        char[] bolol = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean arraySymbolsContains = false;
        for (int i = 0; i < bolol.length - 2; i++) {
            if (bolol[i] == 'b' && bolol[i + 2] == 'b') {
                arraySymbolsContains = true;
                break;
            }
        }
        System.out.println(arraySymbolsContains);

        //5) Ունենք հետևյալ մասիվը՝
        //char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        //Պետք է գրել կոդ, որը text մասիվից կստանա char[] result մասիվ, որը կլինի նույն տեքստը, առանց պռաբելների(իրար կողք կտպի barev)։
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        int starIndex = 0;
        int endIndex = text.length - 1;

        while (starIndex < endIndex && text[starIndex] == ' ') {
            starIndex++;
        }
        while (starIndex < endIndex && text[endIndex] == ' ') {
            endIndex--;
        }
        char[] result = new char[(endIndex - starIndex) + 1];
        int resultIndex = 0;
        for (int i = starIndex; i <= endIndex; i++) {
            result[resultIndex++] = text[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}