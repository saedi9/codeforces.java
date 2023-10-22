package G;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Game {
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int[] num= Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(num);
        if(n%2!=0){n/=2; System.out.println(num[n]);}
        else {n/=2; System.out.println(num[n-1]);}
    }
}
