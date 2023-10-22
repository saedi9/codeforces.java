package P;

import java.util.Scanner;
import java.util.stream.Stream;


public class PolyCarpsPocket {
    public static void main(String[] args){
        int[] arr=new int[150];
        int max=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int[] coins= Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < n; i++) {
            arr[coins[i]]+=1;
            if(arr[coins[i]]>max)max=arr[coins[i]];
        }
        System.out.println(max);
    }
}
