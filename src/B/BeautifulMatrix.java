package B;

import java.util.Scanner;
import java.util.stream.Stream;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 0, column = 0, tot_mo = 0;
        boolean found = false;
        for (int i = 0; i < 5; i++) {
            if (found) break;
            int[] num = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < 5; j++) {
                if (num[j] == 1) {
                    row = j;
                    column = i;
                    found=true;
                    break;
                }
            }
        }
        tot_mo = Math.abs(row - 2) + Math.abs(column - 2);
        System.out.println(tot_mo);
    }
}
