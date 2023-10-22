package V;

import java.util.Scanner;
import java.util.stream.Stream;

public class VitalyAndNight {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), res = 0;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int[] l = Stream.of(sc.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x=l.length/m;
            for (int j = 0; j < l.length; j+=x) {
                for (int k = j; k < j+x; k++) {
                    if (l[k] == 1) {
                        res++;
                        break;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
