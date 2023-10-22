package P;

import java.util.Scanner;
import java.util.stream.Stream;

public class Presents {
    public static void main(String[] args) {
        Scanner bf = new Scanner(System.in);
        int len = Integer.parseInt(bf.nextLine());
        int[] num = new int[len];
        for (int i = 1; i <= len; i++) {
            int p = bf.nextInt();
            num[p-1]=i;
        }
        for (int x : num) {
            System.out.print(x + " ");
        }
    }
}
