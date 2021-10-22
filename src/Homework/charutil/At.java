package Homework.charutil;

public class At {
    public static void main(String[] args) {

        char[] text = {' ', ' ', 'b', 'a', 'r',' ', ' ',' ', ' ',' ', ' ',' ', ' ', 'e', ' ', ' ',' ', ' ',' ', ' ','v', ' ', ' ' };
        int numberFirstSpaces = 0;
        int numberRecentSpaces = 0;
        int n = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                numberFirstSpaces = i;
                break;
            }
        }

        for (int j = text.length - 1; j < text.length; j--) {
            if (text[j] != ' ') {
                numberRecentSpaces = text.length - j - 1;
                break;
            }
        }
        char[] result = new char[text.length - (numberFirstSpaces + numberRecentSpaces)];

        System.out.print("result զանգվածի տարրերն են՝   ");
        for (int m = numberFirstSpaces; m < (text.length - numberRecentSpaces); m++) {
                result[n] = text[m];
                System.out.print(result[n]);
                n++;

        }
        System.out.println();
    }
}
