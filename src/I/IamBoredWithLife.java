package I;

import java.util.Scanner;

public class IamBoredWithLife {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(fac(Math.min(sc.nextInt(),sc.nextInt())));
        sc.close();
    }

    static int fac(int a) {
        int ans = 1;
        for (int i = 2; i <= a; i++) {
            ans *= i;
        }
        return ans;
    }

}
