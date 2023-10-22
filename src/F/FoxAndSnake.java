package F;

import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        String a="",b="";
        for (int i = 0; i < m; i++) {
            a += "#";
            b += ".";
        }
        boolean f = true;
        b = b.substring(0,b.length()-1);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(a);
            } else {
                if (f) {
                    System.out.println(b + "#");
                } else
                    System.out.println("#" + b);

                f = !f;
            }
        }
    }
}
