package V;

import java.util.Scanner;
import java.util.stream.Stream;

public class VasyaTheHipster {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        int tot_pair = 0;
        int tot_com = 0;
        int temp = 0;
        int[] num = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (num[0] <= num[1]) {
            tot_com += num[0];
            temp = num[1] - num[0];
        } else if (num[0] > num[1]) {
            tot_com += num[1];
            temp = num[0] - num[1];
        }
        tot_pair=temp/2;
        System.out.println(tot_com+" "+tot_pair);
    }
}
