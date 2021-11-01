package homework.practiceHomework;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework homework = new PracticeHomework();
        //փոխակերպել տրված րոպեն վայրկյանի
        int minutes = 15;
        System.out.println(minutes + " րոպեն " + homework.convert(minutes) + " վայրկյան է։");


//ընդունել տարին, վերադարձնել օրերի քանակը
        int years = 7;
        System.out.println(years + " տարին " + homework.calcAge(years) + " օր է։");


//վերադարձնել տրված թվի հաջորդ թիվը
        int number = 33;
        System.out.println(number + "-ի հաջորդ թիվը " + homework.nextNumber(number) + "-ն է։");


//վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false
        int a = 15, b = 27;
        if (homework.isSameNum(a, b)) {
            System.out.println(homework.isSameNum(a, b) + "     քանի որ a=" + a + " և b=" + b + " թվերը " + "հավասար են։");
        } else {
            System.out.println(homework.isSameNum(a, b) + "     քանի որ a=" + a + " և b=" + b + " թվերը " + "հավասար չեն։");
        }


//վերադարձնել true - եթե թիվը փոքր կամ հավասար է 0 - ին։
//մնացած դեպքերում վերադարձնել false
        int number2 = -15;
        if (homework.lessThanOrEqualToZero(number2)) {
            System.out.println(homework.lessThanOrEqualToZero(number2) + "      քանի որ " + number2 + "<0:");//==??
        } else {
            System.out.println(homework.lessThanOrEqualToZero(number2) + "     քանի որ " + number2 + ">0:");
        }


//վերադարձնել ընդունող բուլյանի ժխտված արժեքը
        boolean value = false;
        if (homework.reverseBool(value)) {
            System.out.println(homework.reverseBool(value) + "      քանի որ false-ի ժխտված արժեքը true-ն է։");
        } else {
            System.out.println(homework.reverseBool(value) + "      քանի որ true-ի ժխտված արժեքը false-ն է։");
        }


//վերադարձնել երկու մասիվի ամենամեծ length-ը
        int[] array1 = {10, 5, 71, 21, 1, 50, 7, 1, 99, 100, 5, 71, 21, 1};
        int[] array2 = {110, 5, 71, 21, 12, 57, 5, 15, 99, 100};
        if (homework.maxLength(array1, array2) == array1.length) {
            System.out.println(homework.maxLength(array1, array2) + "        I զանգվածի երկարությունը գերազանցում է II զանգվածի երկարությունը։");
        } else {
            System.out.println(homework.maxLength(array1, array2) + "        II զանգվածի երկարությունը գերազանցում է I զանգվածի երկարությունը։");
        }
    }
}