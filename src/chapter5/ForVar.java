package chapter5;

//for ցիկիլի օպերատորի առանձին հատվածներ կարող են բացակայել
public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;
        i = 0;
        for (; !done; ) {
            System.out.println("i հավասար է " + i);
            if (i == 10) {
                done = true;
            }
            i++;
        }
    }
}