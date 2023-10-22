package S;

import java.util.Scanner;

public class Scarborough {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        char[] s = sc.nextLine().toCharArray();
        for (int i = 0; i < m; i++) {
            String[] temp = sc.nextLine().split(" ");
            int l = Integer.parseInt(temp[0]);
            int r = Integer.parseInt(temp[1]);
            for (int j = l; j <= r; j++) {
                if (s[j-1]==temp[2].charAt(0)) s[j-1] = temp[3].charAt(0);
            }
        }
        System.out.println(s);
    }
}
