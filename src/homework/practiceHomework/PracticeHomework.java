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
        return number + 1;
    }

    //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false
    boolean result = false;

    boolean isSameNum(int a, int b) {
        if (a == b) {
            result = true;
        }
        return result;
    }


    //վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։ Մնացած դեպքերում վերադարձնել false
    boolean found = false;

    boolean lessThanOrEqualToZero(int number2) {
        if (number2 <= 0) {
            found = true;
        }
        return found;
    }


    //վերադարձնել ընդունող բուլյանի ժխտված արժեքը
    boolean reverseBool(boolean value) {
        return !value;
    }


    //վերադարձնել երկու մասիվի ամենամեծ length-ը
    int maxLength(int[] array1, int[] array2) {
        int arrayLength = array2.length;
        if (array1.length > array2.length) {
            arrayLength = array1.length;
        }
        return arrayLength;
    }
}