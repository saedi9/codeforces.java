package B;

import java.util.Scanner;
import java.util.stream.Stream;

public class BearAndReverseRadewoosh {
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=sc.nextInt();
        int radewoosh=0,limak=0;
        sc.nextLine();
        int[] num= Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] time= Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ltime=0;
        int rtime=0;
        for (int i = 0; i < n; i++) {
            ltime+=time[i];
            rtime+=time[n-i-1];
            limak+=Math.max(0,num[i]-c*ltime);
            radewoosh+=Math.max(0,num[n-i-1]-c*rtime);
        }
        if(limak>radewoosh) System.out.println("Limak");
        else if(limak<radewoosh) System.out.println("Radewoosh");
        else System.out.println("Tie");
    }
}
