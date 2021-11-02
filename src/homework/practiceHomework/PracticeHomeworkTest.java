package homework.practiceHomework;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework homework = new PracticeHomework();
        //փոխակերպել տրված րոպեն վայրկյանի

        System.out.println(15 + " րոպեն " + homework.convert(15) + " վայրկյան է։");


//ընդունել տարին, վերադարձնել օրերի քանակը

        System.out.println(7 + " տարին " + homework.calcAge(7) + " օր է։");


//վերադարձնել տրված թվի հաջորդ թիվը

        System.out.println(33 + "-ի հաջորդ թիվը " + homework.nextNumber(33) + "-ն է։");


//վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false

        if (homework.isSameNum(15, 27)) {
            System.out.println(homework.isSameNum(15, 27) + "     քանի որ a=" + 15 + " և b=" + 27 + " թվերը " + "հավասար են։");
        } else {
            System.out.println(homework.isSameNum(15, 27) + "     քանի որ a=" + 15 + " և b=" + 27 + " թվերը " + "հավասար չեն։");
        }


//վերադարձնել true - եթե թիվը փոքր կամ հավասար է 0 - ին։
//մնացած դեպքերում վերադարձնել false

        if (homework.lessThanOrEqualToZero(-15)) {
            System.out.println(homework.lessThanOrEqualToZero(-15) + "      քանի որ " + -15 + "<0:");//==??
        } else {
            System.out.println(homework.lessThanOrEqualToZero(-15) + "     քանի որ " + -15 + ">0:");
        }


//վերադարձնել ընդունող բուլյանի ժխտված արժեքը

        if (homework.reverseBool(false)) {
            System.out.println(homework.reverseBool(false) + "      քանի որ false-ի ժխտված արժեքը true-ն է։");
        } else {
            System.out.println(homework.reverseBool(false) + "      քանի որ true-ի ժխտված արժեքը false-ն է։");
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