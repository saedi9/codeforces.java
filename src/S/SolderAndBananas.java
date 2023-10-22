package S;

import java.util.Scanner;

public class SolderAndBananas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt(),n=sc.nextInt(),w=sc.nextInt();
        int tot=n-((w*(w+1))/2)*k;
        if(tot<0){System.out.println(Math.abs(tot));}
        else System.out.println(0);
    }
}
