package homework.practiceHomework;

public class PracticeHomework {

    //փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել
    long convert(int minutes) {
        return minutes * 60;
    }

    //ընդունել տարին, վերադարձնել օրերի քանակը
    int calcAge(int years) {
        return years * 365;
    }

    //վերադարձնել տրված թվի հաջորդ թիվը
    int nextNumber(int number) {
        return ++number;
    }

    //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false
    boolean isSameNum(int a, int b) {
        return a == b;
    }


    //վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։ Մնացած դեպքերում վերադարձնել false
    boolean lessThanOrEqualToZero(int number2) {
        return number2 <= 0;
    }


    //վերադարձնել ընդունող բուլյանի ժխտված արժեքը
    boolean reverseBool(boolean value) {
        return !value;
    }


    //վերադարձնել երկու մասիվի ամենամեծ length-ը
    int maxLength(int[] array1, int[] array2) {
        return array1.length > array2.length ? array1.length : array2.length;
    }
}