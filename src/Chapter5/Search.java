package Chapter5;

//for ցիկլի կիռաումը for each ոճով
public class Search {
    public static void main(String[] args) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;
        // օգտագործել for ցիկլը for each ոճով, nums զանգվածում val փոփոխականի արժեքը որոնելու համար
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Արժեքը գտնված է");
        }
    }
}