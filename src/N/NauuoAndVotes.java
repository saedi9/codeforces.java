package N;

import java.util.Scanner;
import java.util.stream.Stream;

public class NauuoAndVotes {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        int[] l = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (l[0] > l[1]) {
            if (l[0] - l[1] > l[2]) {
                System.out.println("+");
            } else {
                if(l[2]==0)System.out.println("+");
                System.out.println("?");
            }
        } else if (l[0] < l[1]) {
            if (l[1] - l[0] > l[2]) {
                System.out.println("-");
            } else {
                if(l[2]==0)System.out.println("-");
                System.out.println("?");
            }
        } else {
            if (l[1] - l[0] >= l[2]) {
                System.out.println("0");
            } else {
                System.out.println("?");
            }
        }
    }
}
