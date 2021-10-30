package homework.charUtil;

public class CharUtil {

    //1. Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը

    int bololaSymbol(char[] bolola, char c) {
        int oSymbolAmount = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                oSymbolAmount++;
            }
        }
        return oSymbolAmount;
    }


    //2. Պետք է գրել կոդ, որը կտպի մասիվի մեջտեղի 2 սինվոլները

    String middelNext(char[] bolola) {
        return bolola[bolola.length / 2] + " and " + bolola[(bolola.length / 2) + 1];
    }


    //3․ Տպել true, եթե մասիվը վերջանում է ly-ով, եթե ոչ՝ false

    boolean findSymbols(char[] bolola, char m, char n) {
        boolean result =false;

        if (bolola[bolola.length - 2] == m && bolola[bolola.length - 1] == n) {
            result=true;
        }
        return result;
    }


    //4. Տպել true, եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սիմվոլ

    boolean findText(char[] bolol, char e) {

        boolean arraySymbolsContains = false;
        for (int i = 0; i < bolol.length - 2; i++) {
            if (bolol[i] == e && bolol[i + 2] == e) {
                arraySymbolsContains = true;
                break;
            }
        }
        return arraySymbolsContains;
    }


    //5. Պետք է գրել կոդ, որը text մասիվից կստանա char[] result մասիվ, որը կլինի նույն տեքստը, առանց պռաբելների(իրար կողք կտպի barev)

    void newArray(char[] text) {
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