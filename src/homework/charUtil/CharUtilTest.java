package homework.charUtil;

public class CharUtilTest {
    public static void main(String[] args) {

        CharUtil cU = new CharUtil();

//        //1. Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը
//        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
//
//        System.out.println(cU.bololaSymbol(bolola, 'l'));
//
//
//        //2. Պետք է գրել կոդ, որը կտպի մասիվի մեջտեղի 2 սինվոլները
//        System.out.println(cU.middelNext(bolola));
//
//
//        //3․ Տպել true, եթե մասիվը վերջանում է ly-ով, եթե ոչ՝ false
//        System.out.println(cU.findSymbols(bolola, 'l', 'y'));
//
//
//        //4. Տպել true, եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սիմվոլ
//        char[] bolol = {'b', 'a', 'b', 'o', 'l', 'a'};
//        System.out.println(cU.findText(bolol, 'b'));


        //5. Պետք է գրել կոդ, որը text մասիվից կստանա char[] result մասիվ, որը կլինի նույն տեքստը, առանց պռաբելների(իրար կողք կտպի barev)
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        char[] result = cU.trim(text);
        for (char i : result) {
            System.out.print(i);
        }
    }
}