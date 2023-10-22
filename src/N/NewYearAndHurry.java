package N;

import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String[] args) {
        final int TOT_MIN=240;

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt(),k=sc.nextInt(),x=0;
        double x1=0;
        k=TOT_MIN-k;
        if(k<5){ System.out.println(0); }
        int tot_min=5*(n*(n+1))/2;
        if(k-tot_min>=0) System.out.println(n);
        else{
            x=(k /5)*2;
            x1=(Math.sqrt(1+4*x)-1)/2;
            if(x1>0)System.out.println((int)x1);
        }
    }
}
