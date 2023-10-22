package S;

import java.util.Arrays;
import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), max = 0, min = 0;
        int[] cn = new int[n];
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            cn[i] = sc.nextInt();
        }
        int s = 0, e = n - 1;
        while (s <= e) {
            if (flag) {
                if (cn[s] > cn[e]) { max += cn[s];flag = false;s++; }
                else { max += cn[e];flag = false;e--; }
            }else {
                if (cn[s] > cn[e]) { min += cn[s];flag = true;s++; }
                else { min += cn[e];flag = true;e--; }
            }
        }
        System.out.println(max + " " + min);
    }
}
