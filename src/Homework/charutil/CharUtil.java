package Homework.charutil;

public class CharUtil {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        System.out.print("Զանգվածի տարրերն են՝ ");

        for (int i = 0; i < bolola.length; i++) {

            System.out.print(bolola[i] + " ");
        }
        System.out.println('\n');


        //1)
        char c = 'o';
        int oSymbolAmount = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == 'o') {
                oSymbolAmount++;
            }
        }
        System.out.println("c փոփոխականի արժեքը՝ 'o' սիմվոլը, զանգվածում հանդիպում է " + oSymbolAmount + " անգամ։" + '\n');


        //2)
        System.out.println("Զանգվածի «միջին և հաջորդ» տարրերն են` " + bolola[bolola.length / 2] + " և " + bolola[(bolola.length / 2) + 1] + "։" + '\n');


        //3)
        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1] == 'y') {
            System.out.println("true" + " `զանգվածի վերջին տարրերն են ly" + '\n');
        } else {
            System.out.println("false" + "      //ly -- զանգվածի վերջին տարրերը չեն:" + '\n');
        }

    }
}