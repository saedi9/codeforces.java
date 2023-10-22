package M;

import java.util.Scanner;

public class MishkaAndGame {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int mishka,chris,n,tot_m=0,tot_c=0;

        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            mishka=sc.nextInt();
            chris=sc.nextInt();
            if(mishka>chris)tot_m++;
            else if (chris>mishka)tot_c++;
        }
        if(tot_m>tot_c)System.out.println("Mishka");
        else if(tot_c>tot_m)System.out.println("Chris");
        else System.out.println("Friendship is magic!^^");
    }
}
