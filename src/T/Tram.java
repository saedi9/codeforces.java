package T;

import java.util.Scanner;
import java.util.stream.Stream;

public class Tram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),max=0;
        sc.nextLine();
        int[] s=new int[n];
        for (int i = 0; i < n; i++) {
            int[] temp= Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            max=max-temp[0] +temp[1];
            s[i]=max;
        }
        for (int i = 0; i < n; i++) {
            if(max<s[i])max=s[i];
        }
        System.out.println(max);
    }
}

