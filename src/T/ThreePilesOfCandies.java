package T;

import java.util.Scanner;

public class ThreePilesOfCandies {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        sc.nextLine();
        while (q-->0){
            long x,y,z,tot=0;
            x=sc.nextLong();
            y=sc.nextLong();
            z=sc.nextLong();
            sc.nextLine();
            tot+=(x+y+z);
            System.out.println((long)tot/2);
        }
    }
}
