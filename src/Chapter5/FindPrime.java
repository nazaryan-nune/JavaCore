package Chapter5;

// Проверить на простые числа
public class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;
        num = 14;
        if (num < 2) {
            isPrime = false;
        } else {
            isPrime = true;
        }
        for (int i = 2; i < num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Պարզ թիվ");
        } else {
            System.out.println("Բաղադրյալ թիվ");
        }
    }
}