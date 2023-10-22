package G;

import java.util.Scanner;

public class GoldenPlate {
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt(),h=sc.nextInt(),k=sc.nextInt();
        int tot=0;
        for (int i = 0; i < k; i++) {
            tot+=(w-2)*2+h*2;
            w-=4;h-=4;
        }
        System.out.println(tot);
    }
}
