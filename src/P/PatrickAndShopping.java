package P;

import java.util.Scanner;

public class PatrickAndShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), s = sc.nextInt(), d = sc.nextInt();
        System.out.println(Math.min(Math.min(2*(a+s),2*(a+d)), Math.min(a+s+d,2*(d+s))));
    }
}
