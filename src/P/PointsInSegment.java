package P;

import java.util.Scanner;

public class PointsInSegment {
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        int[] arr=new int[m];
        for (int i = 0; i < n; i++) {
            int l=sc.nextInt();
            int r=sc.nextInt();
            for (int j = l-1; j < r; j++) {
                arr[j]=1;
            }
            sc.nextLine();
        }
        int counter=0;
        String num="";
        for (int i = 0; i < m; i++) {
            if (arr[i]==0){num+=(i+1)+" ";counter++;}
        }
        System.out.println(counter);
        System.out.println(num);
    }
}
