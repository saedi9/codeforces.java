package M;

import java.util.*;

public class MakeThemOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), x;
        while (t-- > 0) {
            int n = sc.nextInt(), count = 0;
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                x = sc.nextInt();
                if ((x & 1) == 0) set.add(x);
            }
            while (!set.isEmpty()) {
                x = set.pollLast();
                x >>= 1;
                while ((x & 1) == 0) {
                    set.remove(x);
                    x >>= 1;
                    count++;
                }
                count++;
            }
            System.out.println(count);
        }
    }
}
