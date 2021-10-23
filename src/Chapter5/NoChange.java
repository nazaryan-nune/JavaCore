package Chapter5;

// for each ոճով ցիկլի փոփոխականը հասանելի է միայն կարդալու համար
public class NoChange {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : nums) {
            System.out.print(x + " ");
            x = x * 10; //այս օպերատորը ոչ մի կերպ չի ազդում nums զանգվածի վրա
        }
        System.out.println();
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
