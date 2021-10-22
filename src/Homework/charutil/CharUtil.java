package Homework.charutil;

public class CharUtil {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a' };
        System.out.print("Զանգվածի տարրերն են՝ ");

        for (int i = 0; i < bolola.length; i++) {

            System.out.print(bolola[i] + " ");
        }
        System.out.println('\n');


        //1) Ունենք հետևյալ մասիվը՝
        //char[] bolola = {'b','o','l','o','l','a'};
        //ունենք նաև մի սինվոլ՝ char c = 'o';
        //Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
        char c = 'o';
        int oSymbolAmount = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == 'o') {
                oSymbolAmount++;
            }
        }
        System.out.println("c փոփոխականի արժեքը՝ 'o' սիմվոլը, զանգվածում հանդիպում է " + oSymbolAmount + " անգամ։" + '\n');


        //2)Ունենք հետևյալ մասիվը՝
        //char[] bolola = {'b','o','l','o','l','a'};
        //պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
        System.out.println("Զանգվածի «միջին և հաջորդ» տարրերն են` " + bolola[bolola.length / 2] + " և " + bolola[(bolola.length / 2) + 1] + "։" + '\n');


        //3)Ունենք հետևյալ մասիվը՝՝
        //char[] bolola = {'b','o','l','o','l','a'};
        //պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1] == 'y') {
            System.out.println("true" + " `զանգվածի վերջին տարրերն են ly" + '\n');
        } else {
            System.out.println("false" + "      //ly -- զանգվածի նախավերջին և վերջին տարրերը չեն:" + '\n');
        }

        //4)Ունենք հետևյալ մասիվը՝
        //char[] bolola = {'b','a',b','o','l','a'};
        ////Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։

        char[] bolol = {'b', 'a', 'b', 'o', 'l', 'a' };
        boolean arraySymbolsContains = false;
        for (int i = 0; i < bolol.length; i++) {
            if (bolol[i] == 'b' && bolol[i + 2] == 'b') {
                arraySymbolsContains = true;
                break;
            }
        }
        System.out.println(arraySymbolsContains + "      //զանգվածը <<bob>> բառը պարունակում է" + "\n");

        //5)
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
        char[] result = new char[text.length];

        for (int i = 0; i < text.length; i++) {
            if (text[i] == 'b' || text[i] == 'a' || text[i] == 'r' || text[i] == 'e' || text[i] == 'v') ;
            result[i] = text[i];
        }
        System.out.print("result զանգվածի տարրերն են՝ ");
        System.out.println(result);
    }
}