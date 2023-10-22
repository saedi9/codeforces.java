package S;

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int tot=0;
        char[] stone=sc.nextLine().toCharArray();
        for (int i = 0; i < n-1; i++) {
            if(stone[i]==stone[i+1])tot++;
        }
        System.out.println(tot);
    }
}
