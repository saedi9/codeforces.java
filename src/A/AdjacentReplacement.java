package A;

import java.util.Scanner;
import java.util.stream.Stream;

public class AdjacentReplacement {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        long[] nums= Stream.of(sc.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
        for (int i = 0; i < n; i++) {
            if(nums[i]%2==0)System.out.print(nums[i]-1+" ");
            else System.out.print(nums[i]+" ");
        }
    }
}
