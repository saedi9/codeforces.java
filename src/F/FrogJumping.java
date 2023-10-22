package F;

import java.util.Scanner;

public class FrogJumping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            long a, b, k, p = 0;
            a = sc.nextLong();
            b = sc.nextLong();
            k = sc.nextLong();
            if (k % 2 == 0) {
                k/=2;
                p+=((k*a)-(k*b));
            }
            else {
                k/=2;
                p+=(((k+1)*a)-(k*b));
            }
            System.out.println(p);
        }
    }
}
