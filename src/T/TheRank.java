package T;

import java.util.Scanner;
import java.util.stream.Stream;

public class TheRank {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int rank=1;
        int [] num=new int[n];
        for (int i = 0; i < n; i++) {
            int temp=0;
            int[] line= Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(double x:line){temp+=x;}
            num[i]=temp;
        }
        int tem=num[0];
        for (int i = 1; i < n; i++) {
            if (tem<num[i])rank++;
        }
        System.out.println(rank);
    }
}
