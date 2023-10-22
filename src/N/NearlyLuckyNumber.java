package N;

import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.nextLine());
        int counter = 0;
        while (n != 0) {
            if (n % 10 == 4 || n % 10 == 7) { counter += 1; }
            n /= 10;
        }
        if (counter == 4 || counter == 7) {System.out.println("YES");}
        else {System.out.println("NO");}
    }
}
