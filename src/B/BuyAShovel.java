package B;

import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt(),r=sc.nextInt(),h=1,i=0,j=1;
        boolean b=true;
        while (b){
            i++;
            h=k*i;
            if(h%10==0||h%10==r)b=false;
        }
        System.out.println(i);
    }
}
