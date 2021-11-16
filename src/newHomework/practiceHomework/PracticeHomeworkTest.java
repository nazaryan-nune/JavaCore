package newHomework.practiceHomework;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework homework = new PracticeHomework();

        //փոխակերպել տրված րոպեն վայրկյանի
        System.out.println(homework.convert(15));


        //ընդունել տարին, վերադարձնել օրերի քանակը
        System.out.println(homework.calcAge(7));


        //վերադարձնել տրված թվի հաջորդ թիվը
        System.out.println(homework.nextNumber(33));


        //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false


        System.out.println(homework.isSameNum(15, 27));


        //վերադարձնել true - եթե թիվը փոքր կամ հավասար է 0 - ին։
        //մնացած դեպքերում վերադարձնել false


        System.out.println(homework.lessThanOrEqualToZero(-15));


        //վերադարձնել ընդունող բուլյանի ժխտված արժեքը

        System.out.println(homework.reverseBool(false));


        //վերադարձնել երկու մասիվի ամենամեծ length-ը

        int[] array1 = {10, 5, 71, 21, 1, 50, 7, 1, 99, 100, 5, 71, 21, 1};
        int[] array2 = {110, 5, 71, 21, 12, 57, 5, 15, 99, 100};


        System.out.println(homework.maxLength(array1, array2));

    }
}