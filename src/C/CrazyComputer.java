package C;

import java.util.Scanner;

public class CrazyComputer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),counter=0;
        int[] t=new int[n];
        for (int i = 0; i < n; i++) {
            t[i]=sc.nextInt();
        }
        if(t.length>1){
            for (int i = 0; i < n-1; i++) {
                if(t[i+1]-t[i]<=m){
                    counter++;
                }else{counter=0;}
            }
        }
        System.out.println(counter+1);
    }
}
