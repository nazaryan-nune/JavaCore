package chapter5;

//break օպերատորի կիրառումը for each ոճով for ցիկլում
public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //զանգվածի առաջին հինգ տարրերի գումարումը՝ for each ոճով for ցիկլի կիրառմաբ

        for (int x : nums) {
            System.out.println("Արժեքը հավասար է՝ " + x);
            sum += x;
            if (x == 5) break;
        } //ընդհատել ցիկլը, երբ x==5

        System.out.println("Զանգվածի առաջին հինգ տարրերի գումարումը հավասար է՝ " + sum);
    }
}
