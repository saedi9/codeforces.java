package M;

import java.util.Scanner;

public class MaxInTable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int [][] table =new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0||j==0)table[i][j]=1;
                else {table[i][j]=table[i-1][j]+table[i][j-1];}
            }
        }
        System.out.print(table[n-1][n-1]);

    }
}
