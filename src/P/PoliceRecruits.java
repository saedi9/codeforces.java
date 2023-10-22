package P;

import java.util.Scanner;
import java.util.stream.Stream;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int counter = 0;
        int[] crime = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int a = 0;
        for (int i = 0; i < n; i++) {
            if (crime[i] > 0) {
                a += crime[i];
            } else {
                if (crime[i] < 0 && a > 0) {

                    crime[i] = 0;
                    a--;

                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (crime[i] == -1) counter++;
        }
        System.out.println(counter);
    }
}
