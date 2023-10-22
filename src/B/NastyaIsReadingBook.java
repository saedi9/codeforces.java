package B;

import java.util.Scanner;
import java.util.stream.Stream;

public class NastyaIsReadingBook {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] s=new int[n][];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            s[i]= Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int k=sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(k<=s[i][1]){ System.out.println(n-i); break; }
        }
    }
}
