package author;

public class AuthorStorage {

    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private Author[] array = new Author[10];

    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել, եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //և ավելացնենք

    public void add(Author author) {
        if (size == array.length) {
            extend();
        }
        array[size++] = author;


    }

    //1․ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․ քցել հին մասիվի էլեմենտները նորի մեջ
    //3․հին մասիվի հղումը կապենք նոր մասիվի հղման հետ

    private void extend() {
        Author[] newArray = new Author[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաներում է, վերադարձնել մասիվի index-երրորդ էլեմենտը։
    // Հակառակ դեպքում վերադարձնել -1
    public Author getByIndex(int index) {
        if (index < 0 || index > size) {
            System.err.println("ArrayIndexOutOfBoundsException:" + index);
            return null;
        } else {
            return array[index];
        }
    }

    //տպել մասիվի ավելացված էլեմենտնրը
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
            System.out.println();
        }
    }
}