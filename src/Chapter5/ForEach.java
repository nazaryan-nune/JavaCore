package Chapter5;

//for ցիկլի կիրառումը for each ոճով
public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        //օգտագործել for ցիկլը՝ for each ոճով, արժեքների գումարը հաշվելու համար

        for (int x : nums) {
            System.out.println("Արժեքը հավասար է՝ " + x);
            sum += x;
        }
        System.out.println("Գումարումը հավասար է՝ " + sum);
    }
}